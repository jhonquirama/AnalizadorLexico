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
public class Automata_parentesis_cerrado {

    int posInicial;//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

    int cont;
    boolean aceptada;/*para guardar los caratcteres y los va ir separando*/

    char[] car;

    public Lexema inicio(Flujo_caracteres flujo) {
        cont = flujo.getPosActual();
        posInicial = flujo.getPosActual();//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

        car = flujo.getCaracteres();
        aceptada = false;
        q0F();
        if (aceptada) {//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
            Analizador_lexico.flujo.setPosActual(cont);//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
            return new Lexema(")", "separador");//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        } else {//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
            return null;//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        }//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    }

    public void q0F() {

        if (cont < car.length) {/*cuantos espacios tiene mi arreglo*/

            if (car[cont] == ')') {/*el arreglo car en el contador 0 lo vamos a comparar si es = a*/

                cont++;/*incrememnto mi contador*/

                aceptada = true;

            } else {
                Analizador_lexico.flujo.setPosActual(posInicial);//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

                aceptada = false;

            }
        }
    }
}
