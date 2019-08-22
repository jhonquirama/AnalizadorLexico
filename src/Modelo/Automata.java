/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Automata {

    int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    char[] car;

    public static void main(String[] args) {
        Automata aut = new Automata();
        String cadena = "abab";
        aut.car = cadena.toCharArray();
        aut.inicio();
    }

    public void inicio() { /*metodo*/

        cont = 0;
        aceptada = false;
        q0();/*irnos al codigo 0 */

    }

    public void q0() {
        System.out.println("En q0");/*imprimimos y decimos que estamos en q0*/

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'a') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                q0();/*si no lo dejo en 0*/

            } else if (car[cont] == 'b') {/*si es una b me muevo al q1*/

                cont++;
                q1();/*nos va a mover al estado uno*/

            }
        }

    }

    public void q1() {
        System.out.println("En q1");
        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'a') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;
                q1();
            } else if (car[cont] == 'b') {
                cont++;
                q2();/*nos va a mover al estado dos*/

            }
        }
    }

    public void q2() {
        System.out.println("En q2");
        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'a') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;
                q2();
            } else if (car[cont] == 'b') {
                cont++;
                q3();/*nos va a mover al estado uno*/

            }
        }
    }

    public void q3() {
        System.out.println("En q3 cadena aceptada");
        aceptada = true;/*que es aceptada*/

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'a') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;
                q3();
            } else if (car[cont] == 'b') {
                cont++;
                qError();/*nos va a mover al estado uno*/

            }
        }
    }

    public void qError() {
        System.out.println("Error");
        aceptada = false;/*restablecemos nuestra bandera */

        return;/*regresamos*/

    }

}
