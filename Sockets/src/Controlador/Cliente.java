/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.JfmCliente;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Lenovo
 */
public class Cliente {

    Socket cliente;
    static final String IP = "192.168.137.13";
    static final int PUERTO = 5000;
    private final JfmCliente gui;
    String mensaje = "";
    DataOutputStream flujoSalida;
    
    public Cliente(JfmCliente gui){
        this.gui=gui;
        try{
            cliente=new Socket(IP,PUERTO);
            flujoSalida = new DataOutputStream(cliente.getOutputStream());
            flujoSalida.writeUTF("estoy probando la conexion");
            gui.actualizarEstado("Conectado");
            cliente.close();
            
        }catch(IOException ex){
            System.out.println("error al conectarse al servidor");
            gui.actualizarEstado("error al conectar");
        }
    }
    
    public void enviarMensaje(String mensaje){
        try{
            cliente = new Socket(IP,PUERTO);
            flujoSalida = new DataOutputStream(cliente.getOutputStream());
            flujoSalida.writeUTF(mensaje);
            gui.limpiar();
            cliente.close();
            
        }catch(IOException ex){
            System.out.println("error al enviar mensaje");
        }
    }
    
    public void desconectar(){
        try{
            if (flujoSalida !=null) {
               flujoSalida.close();
            }
            if (cliente!=null) {
                cliente.close();
                
            }
            gui.actualizarEstado("desconectado");
        }catch(IOException ex){
            System.out.println("error desconectandose");
        }
    }
}
