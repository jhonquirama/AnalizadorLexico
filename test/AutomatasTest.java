/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Controlador.Automata_CapturarDato;
import Controlador.Automata_Delimitador;
import Controlador.Automata_Funcion;
import Controlador.Automata_Mensaje;
import Controlador.Automata_OperadoresAritmeticos;
import Controlador.Automata_OperadoresAsignacion;
import Controlador.Automata_OperadoresLogicos;
import Controlador.Automata_OperadoresRelaciones;
import Controlador.Automata_SumarNR;
import Controlador.Automata_boo;
import Controlador.Automata_cadena;
import Controlador.Automata_case;
import Controlador.Automata_comilla;
import Controlador.Automata_continuar;
import Controlador.Automata_contrario;
import Controlador.Automata_corchete;
import Controlador.Automata_decimal;
import Controlador.Automata_defecto;
import Controlador.Automata_derivarFuncion;
import Controlador.Automata_diples;
import Controlador.Automata_dividirNR;
import Controlador.Automata_entero;
import Controlador.Automata_flotante;
import Controlador.Automata_hallarLimite;
import Controlador.Automata_igual;
import Controlador.Automata_integrarFuncion;
import Controlador.Automata_llave;
import Controlador.Automata_main;
import Controlador.Automata_mas_mas;
import Controlador.Automata_menos_menos;
import Controlador.Automata_multiplicarNR;
import Controlador.Automata_nada;
import Controlador.Automata_parentesis;
import Controlador.Automata_resolverVectores;
import Controlador.Automata_restarNR;
import Controlador.Automata_retornar;
import Controlador.Automata_romper;
import Controlador.Automata_si;
import Controlador.Automata_vacio;
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

    @Test
    public void TestAutomataCapturarDatoCorrecto() {
        Automata_CapturarDato fun = new Automata_CapturarDato();
        char[] caracteres = "capturarDato".toCharArray();
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
    public void TestAutomatacapturarDatoIncorrecto() {
        Automata_CapturarDato fun = new Automata_CapturarDato();
        char[] caracteres = "capturarDatooooo".toCharArray();
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

    @Test
    public void TestAutomataDelimitadorPuntoYComaCorrecto() {
        Automata_Delimitador fun = new Automata_Delimitador();
        char[] caracteres = ";".toCharArray();
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
    public void TestAutomataDelimitadorPuntoYComaInCorrecto() {
        Automata_Delimitador fun = new Automata_Delimitador();
        char[] caracteres = "}".toCharArray();
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

    @Test
    public void TestAutomataMensajeCorrecto() {
        Automata_Mensaje fun = new Automata_Mensaje();
        char[] caracteres = "mensaje".toCharArray();
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
    public void TestAutomataMensajeInCorrecto() {
        Automata_Mensaje fun = new Automata_Mensaje();
        char[] caracteres = "mensajeeee".toCharArray();
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

    @Test
    public void TestAutomataSumarNRCorrecto() {
        Automata_SumarNR fun = new Automata_SumarNR();
        char[] caracteres = "sumarNR".toCharArray();
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
    public void TestAutomataSumarNRInCorrecto() {
        Automata_SumarNR fun = new Automata_SumarNR();
        char[] caracteres = "sumarNRes".toCharArray();
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

    @Test
    public void TestAutomataBooCorrecto() {
        Automata_boo fun = new Automata_boo();
        char[] caracteres = "boo".toCharArray();
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
    public void TestAutomataBooInCorrecto() {
        Automata_boo fun = new Automata_boo();
        char[] caracteres = "boooo".toCharArray();
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

    @Test
    public void TestAutomataCadenaCorrecto() {
        Automata_cadena fun = new Automata_cadena();
        char[] caracteres = "cadena".toCharArray();
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
    public void TestAutomataCadenaInCorrecto() {
        Automata_cadena fun = new Automata_cadena();
        char[] caracteres = "cadenaaa".toCharArray();
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

    @Test
    public void TestAutomataCaseCorrecto() {
        Automata_case fun = new Automata_case();
        char[] caracteres = "case".toCharArray();
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
    public void TestAutomataCaseInCorrecto() {
        Automata_case fun = new Automata_case();
        char[] caracteres = "cadenaaa".toCharArray();
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

    @Test
    public void TestAutomataComillaCorrecto() {
        Automata_comilla fun = new Automata_comilla();
        char comilla = '\'';
        String comillas = comilla + "alvaro" + comilla;
        char[] caracteres = comillas.toCharArray();
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
    public void TestAutomataComillaInCorrecto() {
        Automata_comilla fun = new Automata_comilla();
        char[] caracteres = "ññññ".toCharArray();
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


    @Test
    public void TestAutomataContinuarCorrecto() {
       Automata_continuar fun = new Automata_continuar();
        char[] caracteres = "continuar".toCharArray();
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
    public void TestAutomataContinuarInCorrecto() {
        Automata_continuar fun = new Automata_continuar();
        char[] caracteres = "continuaaaar".toCharArray();
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
    
    
    @Test
    public void TestAutomataContrarioCorrecto() {
       Automata_contrario fun = new Automata_contrario();
        char[] caracteres = "contrario".toCharArray();
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
    public void TestAutomataContrarioInCorrecto() {
       Automata_contrario fun = new Automata_contrario();
        char[] caracteres = "contrariooo".toCharArray();
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
    
     @Test
    public void TestAutomataCorcheteAbiertoCorrecto() {
       Automata_corchete fun = new Automata_corchete();
        char[] caracteres = "{".toCharArray();
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
    public void TestAutomataCorcheteAbiertoInCorrecto() {
       Automata_corchete fun = new Automata_corchete();
        char[] caracteres = "ff".toCharArray();
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
    
     @Test
    public void TestAutomataCorcheteCerradoCorrecto() {
       Automata_corchete fun = new Automata_corchete();
        char[] caracteres = "}".toCharArray();
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
    public void TestAutomataCorcheteCerradoInCorrecto() {
       Automata_corchete fun = new Automata_corchete();
        char[] caracteres = "ff".toCharArray();
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
    
     @Test
    public void TestAutomataDecimalCorrecto() {
       Automata_decimal fun = new Automata_decimal();
        char[] caracteres = "decimal".toCharArray();
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
    public void TestAutomataDecimalInCorrecto() {
       Automata_decimal fun = new Automata_decimal();
        char[] caracteres = "decimalll".toCharArray();
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
    
     @Test
    public void TestAutomataDefectoCorrecto() {
       Automata_defecto fun = new Automata_defecto();
        char[] caracteres = "defecto".toCharArray();
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
    public void TestAutomataDefectoInCorrecto() {
       Automata_defecto fun = new Automata_defecto();
        char[] caracteres = "defectoooo".toCharArray();
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
    
     @Test
    public void TestAutomataDerivarFuncionCorrecto() {
       Automata_derivarFuncion fun = new Automata_derivarFuncion();
        char[] caracteres = "derivarFuncion".toCharArray();
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
    public void TestAutomataDerivarFuncionInCorrecto() {
       Automata_derivarFuncion fun = new Automata_derivarFuncion();
        char[] caracteres = "derivarFuncionnn".toCharArray();
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
    
     @Test
    public void TestAutomataDiplesAbiertoCorrecto() {
       Automata_diples fun = new Automata_diples();
        char[] caracteres = "<".toCharArray();
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
    public void TestAutomataDiplesAbiertoInCorrecto() {
       Automata_diples fun = new Automata_diples();
        char[] caracteres = "ffh".toCharArray();
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
    
     
     @Test
    public void TestAutomataDiplesCerradoCorrecto() {
       Automata_diples fun = new Automata_diples();
        char[] caracteres = ">".toCharArray();
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
    public void TestAutomataDiplesCerradoInCorrecto() {
       Automata_diples fun = new Automata_diples();
        char[] caracteres = "ffh".toCharArray();
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
    
     
     @Test
    public void TestAutomataDividirNRCorrecto() {
       Automata_dividirNR fun = new Automata_dividirNR();
        char[] caracteres = "dividirNR".toCharArray();
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
    public void TestAutomataDividirNRInCorrecto() {
       Automata_dividirNR fun = new Automata_dividirNR();
        char[] caracteres = "ffh".toCharArray();
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
    
     
     @Test
    public void TestAutomataEnteroCorrecto() {
       Automata_entero fun = new Automata_entero();
        char[] caracteres = "entero".toCharArray();
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
    public void TestAutomataEnteroInCorrecto() {
       Automata_entero fun = new Automata_entero();
        char[] caracteres = "enteroo".toCharArray();
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
    
    
     
     @Test
    public void TestAutomataFlotanteCorrecto() {
       Automata_flotante fun = new Automata_flotante();
        char[] caracteres = "flotante".toCharArray();
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
    public void TestAutomataFlotanteInCorrecto() {
       Automata_flotante fun = new Automata_flotante();
        char[] caracteres = "flotantee".toCharArray();
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
    
     
     @Test
    public void TestAutomataHallarLimiteCorrecto() {
       Automata_hallarLimite fun = new Automata_hallarLimite();
        char[] caracteres = "hallarLimite".toCharArray();
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
    public void TestAutomataHallarLimiteInCorrecto() {
       Automata_hallarLimite fun = new Automata_hallarLimite();
        char[] caracteres = "hallarLimitede".toCharArray();
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
    
     
     @Test
    public void TestAutomataIgualCorrecto() {
       Automata_igual fun = new Automata_igual();
        char[] caracteres = "=".toCharArray();
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
    public void TestAutomataIgualInCorrecto() {
       Automata_igual fun = new Automata_igual();
        char[] caracteres = "hgh".toCharArray();
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
    
     
     @Test
    public void TestAutomataIntegrarFuncionCorrecto() {
       Automata_integrarFuncion fun = new Automata_integrarFuncion();
        char[] caracteres = "integrarFuncion".toCharArray();
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
    public void TestAutomataIntegrarFuncionInCorrecto() {
       Automata_integrarFuncion fun = new Automata_integrarFuncion();
        char[] caracteres = "integrarFuncionnn".toCharArray();
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
    
     
     @Test
    public void TestAutomataLlaveAbiertaCorrecto() {
       Automata_llave fun = new Automata_llave();
        char[] caracteres = "[".toCharArray();
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
    public void TestAutomataLlaveAbiertaInCorrecto() {
       Automata_llave fun = new Automata_llave();
        char[] caracteres = "ghg".toCharArray();
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
    
    @Test
    public void TestAutomataLlaveCerradaCorrecto() {
       Automata_llave fun = new Automata_llave();
        char[] caracteres = "]".toCharArray();
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
    public void TestAutomataLlaveCerradaInCorrecto() {
       Automata_llave fun = new Automata_llave();
        char[] caracteres = "ghg".toCharArray();
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
    
    @Test
    public void TestAutomataMainCorrecto() {
       Automata_main fun = new Automata_main();
        char[] caracteres = "main".toCharArray();
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
    public void TestAutomataMainInCorrecto() {
       Automata_main fun = new Automata_main();
        char[] caracteres = "mainnn".toCharArray();
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
    
    @Test
    public void TestAutomataMasMasCorrecto() {
        Automata_mas_mas fun = new Automata_mas_mas();
        char[] caracteres = "++".toCharArray();
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
    public void TestAutomataMasMasInCorrecto() {
       Automata_mas_mas fun = new Automata_mas_mas();
        char[] caracteres = "dhsbcdh".toCharArray();
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
    
     @Test
    public void TestAutomataMenosMenosCorrecto() {
         Automata_menos_menos fun = new Automata_menos_menos();
        char[] caracteres = "--".toCharArray();
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
    public void TestAutomataMenosMenosInCorrecto() {
       Automata_menos_menos fun = new Automata_menos_menos();
        char[] caracteres = "dhsbcdh".toCharArray();
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
    
     @Test
    public void TestAutomataMultiplicarNRCorrecto() {
         Automata_multiplicarNR fun = new Automata_multiplicarNR();
        char[] caracteres = "multiplicarNR".toCharArray();
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
    public void TestAutomataMultiplicarNRInCorrecto() {
       Automata_multiplicarNR fun = new Automata_multiplicarNR();
        char[] caracteres = "multiplicarNRSS".toCharArray();
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
    
     @Test
    public void TestAutomataNadaCorrecto() {
        Automata_nada fun = new Automata_nada();
        char[] caracteres = "nada".toCharArray();
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
    public void TestAutomataNadaInCorrecto() {
       Automata_nada fun = new Automata_nada();
        char[] caracteres = "nadaaa".toCharArray();
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
    
     @Test
    public void TestAutomataParentesisAbiertoCorrecto() {
         Automata_parentesis fun = new Automata_parentesis();
        char[] caracteres = "(".toCharArray();
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
    public void TestAutomataParentesisAbiertoInCorrecto() {
       Automata_parentesis fun = new Automata_parentesis();
        char[] caracteres = "dhsbcdh".toCharArray();
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
    
      @Test
    public void TestAutomataParentesisCerradoCorrecto() {
         Automata_parentesis fun = new Automata_parentesis();
        char[] caracteres = ")".toCharArray();
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
    public void TestAutomataParentesisCerradoInCorrecto() {
       Automata_parentesis fun = new Automata_parentesis();
        char[] caracteres = "dhsbcdh".toCharArray();
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
    
    
     @Test
    public void TestAutomataResolverVectoresCorrecto() {
         Automata_resolverVectores fun = new Automata_resolverVectores();
        char[] caracteres = "resolverVectores".toCharArray();
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
    public void TestAutomataResolverVectoresInCorrecto() {
        Automata_resolverVectores fun = new Automata_resolverVectores();
        char[] caracteres = "resolverVectoresss".toCharArray();
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
    
    
     @Test
    public void TestAutomataRestarNRCorrecto() {
         Automata_restarNR fun = new Automata_restarNR();
        char[] caracteres = "restarNR".toCharArray();
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
    public void TestAutomataRestarNRInCorrecto() {
       Automata_restarNR fun = new Automata_restarNR();
        char[] caracteres = "restarNRrrrff".toCharArray();
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
    
    
     @Test
    public void TestAutomataRetornarCorrecto() {
         Automata_retornar fun = new Automata_retornar();
        char[] caracteres = "retornar".toCharArray();
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
    public void TestAutomataRetornarInCorrecto() {
       Automata_retornar fun = new Automata_retornar();
        char[] caracteres = "retornardsdsa".toCharArray();
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
    
    
     @Test
    public void TestAutomataRomperCorrecto() {
         Automata_romper fun = new Automata_romper();
        char[] caracteres = "romper".toCharArray();
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
    public void TestAutomataRomperInCorrecto() {
       Automata_romper fun = new Automata_romper();
        char[] caracteres = "romperrr".toCharArray();
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
    
    
     @Test
    public void TestAutomataSiCorrecto() {
        Automata_si fun = new Automata_si();
        char[] caracteres = "si".toCharArray();
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
    public void TestAutomataSiInCorrecto() {
       Automata_si fun = new Automata_si();
        char[] caracteres = "siii".toCharArray();
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
    
    
     @Test
    public void TestAutomataVacioCorrecto() {
         Automata_vacio fun = new Automata_vacio();
        char[] caracteres = "vacio".toCharArray();
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
    public void TestAutomataVacioInCorrecto() {
        Automata_vacio fun = new Automata_vacio();
        char[] caracteres = "vaciooo".toCharArray();
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
    
     @Test
    public void TestAutomataOperadoresAritmeticosCorrecto() {
         Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
        char[] caracteres = "+".toCharArray();
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
    public void TestAutomataOperadoresAritmeticosInCorrecto() {
       Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
        char[] caracteres = "dgdfh".toCharArray();
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
    
     @Test
    public void TestAutomataOperadoresAsignacionCorrecto() {
        Automata_OperadoresAsignacion fun = new Automata_OperadoresAsignacion();
        char[] caracteres = "+=".toCharArray();
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
    public void TestAutomataOperadoresAsignacionInCorrecto() {
        Automata_OperadoresAsignacion fun = new Automata_OperadoresAsignacion();
        char[] caracteres = "dfgfhj".toCharArray();
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
    
      @Test
    public void TestAutomataOperadoresRelacionalesCorrecto() {
          Automata_OperadoresRelaciones fun = new Automata_OperadoresRelaciones();
        char[] caracteres = "<=".toCharArray();
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
    public void TestAutomataOperadoresRelaciomalesInCorrecto() {
        Automata_OperadoresRelaciones fun = new Automata_OperadoresRelaciones();
        char[] caracteres = "dfgfhj".toCharArray();
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
    
      @Test
    public void TestAutomataOperadoresLogicosCorrecto() {
          Automata_OperadoresLogicos fun = new Automata_OperadoresLogicos();
        char[] caracteres = "&".toCharArray();
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
    public void TestAutomataOperadoresLogicosInCorrecto() {
        Automata_OperadoresLogicos fun = new Automata_OperadoresLogicos();
        char[] caracteres = "dfgfhj".toCharArray();
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
    
    
    
//     @Test
//    public void TestAutomataMenosCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "-".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 1;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//
//    @Test
//    public void TestAutomataMenosInCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "dfgfhj".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 0;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//    
//     @Test
//    public void TestAutomataDividirCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "/".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 1;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//
//    @Test
//    public void TestAutomataDividirInCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "dfgfhj".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 0;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//    
//     @Test
//    public void TestAutomataPorCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "*".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 1;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//
//    @Test
//    public void TestAutomataPorInCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "dfgfhj".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 0;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//    
//     @Test
//    public void TestAutomataModuloCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "%".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 1;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//
//    @Test
//    public void TestAutomataModuloInCorrecto() {
//        Automata_OperadoresAritmeticos fun = new Automata_OperadoresAritmeticos();
//        char[] caracteres = "dfgfhj".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 0;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//    
//     @Test
//    public void TestAutomataCorrecto() {
//         Automata_OperadoresAsignacion fun = new Automata_OperadoresAsignacion();
//        char[] caracteres = "-".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 1;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
//
//    @Test
//    public void TestAutomataMenosIgualInCorrecto() {
//        Automata_OperadoresAsignacion fun = new Automata_OperadoresAsignacion();
//        char[] caracteres = "".toCharArray();
//        Lexema resultado = fun.inicio(new Flujo_caracteres(0, caracteres));
//        int esperado = 0;
//        int resultadoMetodo;
//        if (resultado != null) {
//            resultadoMetodo = 1;
//        } else {
//            resultadoMetodo = 0;
//        }
//
//        assertEquals(esperado, resultadoMetodo);
//
//    }
    
}


