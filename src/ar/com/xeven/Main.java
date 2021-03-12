package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

/*
Escriba un algoritmo que indique las paginas a imprimir 1,3-5,10
donde el - representa un rango de paginas -> resultado esperado 1,3,4,5,10
 */
public class Main {

    public static void main(String[] args) {

        List<Impresora> hojasAImprimir = new ArrayList<>();

        Impresora h1 = new Impresora(5);
        Impresora h2 = new Impresora(10);
        Impresora h3 = new Impresora(11);



        Impresora intervalo1 = new Impresora();
        intervalo1.ingresarNumeros();
        intervalo1.recorrerIntervalo();


        hojasAImprimir.add(h1);
        hojasAImprimir.add(h2);
        hojasAImprimir.add(intervalo1.recorrerIntervalo());
        hojasAImprimir.add(h3);


        /*
        System.out.println("\nQue paginas del libro desea imprimir: ");
        for (Impresora pagina: hojasAImprimir)
            System.out.print(pagina);

         */
    }
}
