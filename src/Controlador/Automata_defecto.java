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
 * @author Lenovo
 */
public class Automata_defecto {

    int posInicial;

    int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    char[] car;

    public Lexema inicio(Flujo_caracteres flujo) {
        posInicial = flujo.getPosActual();
        cont = flujo.getPosActual();
        car = flujo.getCaracteres();
        aceptada = false;
        q0();
        if (aceptada) {
            Analizador_lexico.flujo.setPosActual(cont);
            return new Lexema("defecto", "Palabra Reservada");
        } else {
            return null;
        }
    }

    public void q0() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'd') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                q1();

            } else {
                Analizador_lexico.flujo.setPosActual(posInicial);

                aceptada = false;

            }
        }
    }

    public void q1() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'e') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                q2();

            } else {
                Analizador_lexico.flujo.setPosActual(posInicial);

                aceptada = false;

            }
        }
    }

    public void q2() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'f') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                q3();

            } else {
                Analizador_lexico.flujo.setPosActual(posInicial);

                aceptada = false;

            }
        }
    }

    public void q3() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'e') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                q4();

            } else {
                Analizador_lexico.flujo.setPosActual(posInicial);

                aceptada = false;

            }
        }
    }

    public void q4() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'c') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                q5();

            } else {
                Analizador_lexico.flujo.setPosActual(posInicial);

                aceptada = false;

            }
        }
    }

    public void q5() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 't') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                qF();

            } else {
                Analizador_lexico.flujo.setPosActual(posInicial);

                aceptada = false;

            }
        }
    }

    public void qF() {
        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == 'o' && aceptada == false) {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                aceptada = true;
                cont++;
                qF();

            } else if (Character.isLetter(car[cont]) || Character.isDigit(car[cont])) {
                Analizador_lexico.flujo.setPosActual(posInicial);

                aceptada = false;
                cont--;

              } else if (car[cont] == ' ') {
                validarEspacios();
                aceptada = true;
            }
        }
    }

    public void validarEspacios() {
        if (car[cont] == ' ') {
            cont++;
            validarEspacios();
        }
    }
}
