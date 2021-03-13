package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

/*
Escriba un algoritmo que indique las paginas a imprimir 1,3-5,10
donde el - representa un rango de paginas -> resultado esperado 1,3,4,5,10
 */
public class Main {

    public static void main(String[] args) {

        Impresora impresora = new Impresora();

        impresora.ingresarPagina();
        impresora.ingresarPagina();
        impresora.ingresarNumeros();
        impresora.recorrerIntervaloYAgregarPagina();
        impresora.mostrarHojas();




    }
}
