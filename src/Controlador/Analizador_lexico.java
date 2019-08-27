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

        do {
            automataFuncion();
            automataBoo();
            automataMesaje();
            automataSumarNR();
            automataCadena();
            automataCapturarDato();
        } while (flujo.getPosActual() < flujo.getCaracteres().length);
    }

    public void automataCadena() {
        Automata_cadena atf = new Automata_cadena();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataBoo() {
        Automata_boo atf = new Automata_boo();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataFuncion() {
        Automata_Funcion atf = new Automata_Funcion();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataSumarNR() {
        Automata_SumarNR atf = new Automata_SumarNR();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataMesaje() {
        Automata_Mensaje atf = new Automata_Mensaje();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataCapturarDato() {
        Automata_CapturarDato atf = new Automata_CapturarDato();
        lexe = atf.inicio(flujo);
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
