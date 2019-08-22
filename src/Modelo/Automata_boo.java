/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Automata_boo {
   int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    char[] car;

    public void inicio() {
        cont = 0;
        aceptada = false;
    }
    
     public void q0() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'b') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                q1();

            } else {

                aceptada = false;

            }
        }
    }

 
     public void q1() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'o') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                qF();

            } else {

                aceptada = false;

            }
        }
    }
public void qF() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'o') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                aceptada = true;

            } else {

                aceptada = false;

            }
        }
    }
    }

