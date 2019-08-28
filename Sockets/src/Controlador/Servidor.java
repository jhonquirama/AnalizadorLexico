/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.JfrmServer;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Lenovo
 */
public class Servidor implements Runnable {

    Socket cliente = null;
    static final int PUERTO = 5000;
    boolean status = true;
    ServerSocket servidor = null;
    DataInputStream flujoEntrada;
    private JfrmServer gui;
    String mensaje = "";
    int totalSolicitudes = 0;

    public Servidor(JfrmServer gui) {
        this.gui = gui;
        new Thread(this).start();
    }

    @Override
    public void run() {

        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("server online escuchando por el puerto");
            gui.actualizarEstado("");
            while (status) {
                {
                    System.out.println("serve esperando solicitusd");
                    cliente = servidor.accept();
                    System.out.println("server: se recibio solicitud");
                    totalSolicitudes++;
                    flujoEntrada = new DataInputStream(cliente.getInputStream());
                    mensaje = flujoEntrada.readUTF();
                    gui.actualizarSolicitudes(totalSolicitudes, mensaje);
                    cliente.close();
                }
            }
        } catch (IOException ex) {
            System.out.println("");
        }
    }

    public void desconectar() {
        status = false;
        gui.actualizarEstado("desconectado");
        try {
            if (flujoEntrada != null) {
                flujoEntrada.close();
            }
            if (cliente != null) {
                cliente.close();

            }
            if (servidor != null) {
                servidor.close();

            }
            System.out.println("servidor desconectado");
        } catch (IOException ex) {
            System.out.println("error desconectar servidor");
        }
    }
}
