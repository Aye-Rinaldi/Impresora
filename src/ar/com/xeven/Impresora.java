package ar.com.xeven;

import java.util.Scanner;

public class Impresora {
    Scanner sc = new Scanner(System.in);
    private int inicioIntervalo;
    private int finIntervalo;
    private int pagina;

    //constructores
    public Impresora(int pagina) {
        this.pagina = pagina;
    }

    public Impresora() {

    }


    public void ingresarNumeros() {
        System.out.print("Ingrese el valor con que comienza el intervalo: ");
        inicioIntervalo = sc.nextInt();
        System.out.print("Ingrese el valor con que finaliza el intervalo: ");
        finIntervalo = sc.nextInt();
    }

    public void recorrerIntervalo() {
        for (int i = inicioIntervalo; i <= finIntervalo; i++)
            System.out.println(i);
    }

}


