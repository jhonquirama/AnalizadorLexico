/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Flujo_caracteres;

/**
 *
 * @author alvar
 */
public class Automata_corchete_abierto {

    int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    char[] car;

    public void inicio(Flujo_caracteres flujo) {
        cont = flujo.getPosActual();
        car = flujo.getCaracteres();
        aceptada = false;
        q0F();
    }

    public void q0F() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == '{') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                aceptada = true;

            } else {

                aceptada = false;

            }
        }
    }
}
