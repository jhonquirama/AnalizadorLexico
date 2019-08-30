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

    public static List<Lexema> listaLexema = new ArrayList<>();
    Lexema lexe;
    public static Flujo_caracteres flujo;

    public void analizar(Flujo_caracteres flu) {
        flujo = flu;

        do {
            automataVacio();
            automataFuncion();
            automataDividirNR();
            automataEntero();
            automataBoo();
            automataMesaje();
            automataSumarNR();
            automataFlotante();
            automataHallarLimite();
            automataIntegrarFuncion();
            automataMultiplicarNR();
            automataCadena();
            automataRestarNR();
            automataMain();
            automataResolverVectores();
            automataRetornar();
            automataDefecto();
            automataNada();
            automataRomper();
            automataCase();
            automataCapturarDato();
            automataContrario();
            automataDecimal();
            automataContinuar();
            automataDerivarFuncion();
            automataMasMas();
            automataMenosMenos();
            automataOperadoresAsignacion();
            automataOperadoresRelacionales();
            automataOperadoresAritmeticos();
        } while (flujo.getPosActual() < flujo.getCaracteres().length);
    }

    public void automataMenosMenos() {
        Automata_menos_menos atf = new Automata_menos_menos();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataOperadoresAritmeticos() {
        Automata_OperadoresAritmeticos atf = new Automata_OperadoresAritmeticos();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataOperadoresRelacionales() {
        Automata_OperadoresRelaciones atf = new Automata_OperadoresRelaciones();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataOperadoresAsignacion() {
        Automata_OperadoresAsignacion atf = new Automata_OperadoresAsignacion();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataMasMas() {
        Automata_mas_mas atf = new Automata_mas_mas();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataDerivarFuncion() {
        Automata_derivarFuncion atf = new Automata_derivarFuncion();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataDefecto() {
        Automata_defecto atf = new Automata_defecto();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataDecimal() {
        Automata_decimal atf = new Automata_decimal();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataContrario() {
        Automata_contrario atf = new Automata_contrario();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataContinuar() {
        Automata_continuar atf = new Automata_continuar();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataCase() {
        Automata_case atf = new Automata_case();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataRomper() {
        Automata_romper atf = new Automata_romper();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataRetornar() {
        Automata_retornar atf = new Automata_retornar();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataRestarNR() {
        Automata_restarNR atf = new Automata_restarNR();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataResolverVectores() {
        Automata_resolverVectores atf = new Automata_resolverVectores();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataNada() {
        Automata_nada atf = new Automata_nada();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataMultiplicarNR() {
        Automata_multiplicarNR atf = new Automata_multiplicarNR();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataMain() {
        Automata_main atf = new Automata_main();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataIntegrarFuncion() {
        Automata_integrarFuncion atf = new Automata_integrarFuncion();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataHallarLimite() {
        Automata_hallarLimite atf = new Automata_hallarLimite();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataFlotante() {
        Automata_flotante atf = new Automata_flotante();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataEntero() {
        Automata_entero atf = new Automata_entero();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
    }

    public void automataDividirNR() {
        Automata_dividirNR atf = new Automata_dividirNR();
        lexe = atf.inicio(flujo);
        if (lexe != null) {
            listaLexema.add(lexe);
        }
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

    public void automataVacio() {
        Automata_vacio atf = new Automata_vacio();
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
