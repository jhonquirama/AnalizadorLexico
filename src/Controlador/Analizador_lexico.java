/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Flujo_caracteres;
import Modelo.Lexema;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvar
 */
public class Analizador_lexico {

    List<Lexema> listaLexema = new ArrayList<>();
    Lexema lexe;
    public static Flujo_caracteres flujo;

    public void analizar(Flujo_caracteres flu) {
        flujo = flu;
        Automata_Funcion atf = new Automata_Funcion();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
        System.out.println(flujo.getPosActual());
        Automata_CapturarDato atcd = new Automata_CapturarDato();
        lexe = atcd.inicio(flujo);

        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public List<Lexema> getListaLexema() {
        return listaLexema;
    }

    public void setListaLexema(List<Lexema> listaLexema) {
        this.listaLexema = listaLexema;
    }

}
