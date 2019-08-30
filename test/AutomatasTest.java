/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controlador.Automata_Funcion;
import Modelo.Flujo_caracteres;
import Modelo.Lexema;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Lenovo
 */
public class AutomatasTest {

    @Test
    public void TestAutomataFuncionCorrecto() {
        Automata_Funcion fun = new Automata_Funcion();
        char[] caracteres = "funcion".toCharArray();
        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
        int esperado = 1;
        int resultadoMetodo;
        if (resultado != null) {
            resultadoMetodo = 1;
        } else {
            resultadoMetodo = 0;
        }

        assertEquals(esperado, resultadoMetodo);

    }
    
    @Test
    public void TestAutomataFuncionIncorrecto() {
        Automata_Funcion fun = new Automata_Funcion();
        char[] caracteres = "funcionnnnn".toCharArray();
        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
        int esperado = 0;
        int resultadoMetodo;
        if (resultado != null) {
            resultadoMetodo = 1;
        } else {
            resultadoMetodo = 0;
        }

        assertEquals(esperado, resultadoMetodo);

    }

}
