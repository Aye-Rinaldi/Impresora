package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Impresora {
    Scanner sc = new Scanner(System.in);
    private int inicioIntervalo;
    private int finIntervalo;
    private int pagina;


    List<Integer> hojasAImprimir = new ArrayList<Integer>();

    //metodo para agregar de una hoja a la lista
    public void ingresarPagina(){
        System.out.print("Digame el numero de pagina que desea imprimir: ");
        pagina = Integer.parseInt(sc.nextLine());
        hojasAImprimir.add(pagina);
    }


    //metodo para ingregar los extremos de los intervalos
    public void ingresarNumeros() {
        System.out.print("Ingrese el valor con que comienza el intervalo: ");
        inicioIntervalo = sc.nextInt();
        System.out.print("Ingrese el valor con que finaliza el intervalo: ");
        finIntervalo = sc.nextInt();
    }

    public void recorrerIntervaloYAgregarPagina() {
        for (int i = inicioIntervalo; i <= finIntervalo; i++)
             hojasAImprimir.add(i);
    }

    //mostrar
    public List<Integer> mostrarHojas(){
        for (Integer hoja:hojasAImprimir)
            System.out.print(hoja+"\t");
        return  hojasAImprimir;
    }


}


