/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Flujo_caracteres;
import Modelo.Lexema;

/**
 *
 * @author juan
 */
public class Automata_Y_O_N {

    int posIncial;
    int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    int token;
    char[] car;

    public Lexema inicio(Flujo_caracteres flujo) {
        token = 0;
        posIncial = flujo.getPosActual();
        cont = flujo.getPosActual();
        car = flujo.getCaracteres();
        aceptada = false;
        q0();

        if (aceptada) {
            Analizador_lexico.flujo.setPosActual(cont);
            if (token == 1) {
                return new Lexema("Y", "Operador logico");

            } else if (token == 2) {
                return new Lexema("O", "Operador logico");

            } else if (token == 3) {
                return new Lexema("N", "Operador logico");
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public void q0() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'Y') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                token = 1;
                cont++;/*incrememnto mi contador*/

                aceptada = true;

            } else if (car[cont] == 'O') {
                token = 2;
                cont++;/*incrememnto mi contador*/

                aceptada = true;

            } else if (car[cont] == 'N') {
                cont++;/*incrememnto mi contador*/

                token = 3;
                aceptada = true;

            } else {
                aceptada = false;
            }
        }
    }

}
