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
 * @author alvar
 */
public class Automata_mas_mas {

    int posInicial;//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    char[] car;

    public Lexema/*XXXXXXXXXXXXXX*/ inicio(Flujo_caracteres flujo) {
        cont = flujo.getPosActual();
        posInicial = flujo.getPosActual();//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        car = flujo.getCaracteres();
        aceptada = false;
        q0();
        if (aceptada) {//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
            Analizador_lexico.flujo.setPosActual(cont);//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
            return new Lexema("++", "Operador aritmetico incremental");//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        } else {//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
            return null;//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        }//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    }

    public void q0() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == '+') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                qF();

            } else {
                Analizador_lexico.flujo.setPosActual(posInicial);//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                aceptada = false;

            }
        }
    }

    public void qF() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == '+' && aceptada == false) {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                aceptada = true;
                qF();

            } else if (car[cont] == ' ') {
                cont++;
                aceptada = true;
            } else {
                Analizador_lexico.flujo.setPosActual(posInicial);//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                aceptada = false;

            }
        }
    }
}
