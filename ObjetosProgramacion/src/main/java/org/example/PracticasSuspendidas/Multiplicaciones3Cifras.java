package org.example.PracticasSuspendidas;

import java.util.Scanner;

public class Multiplicaciones3Cifras {
    public static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el multiplicando (3 cifras) :");
        int multiplicando = teclado.nextInt();
        //Comprobamos que sean exactamente 3 cifras
        if (multiplicando<100 || multiplicando > 999){
            System.out.println("Error, solo 3 cifras...");
            return;
        }

        System.out.println("Introduce el multiplicador (3 cifras) :");
        int multiplicador = teclado.nextInt();
        //Comprobamos que sean exactamente 3 cifras
        if (multiplicador<100 || multiplicador > 999){
            System.out.println("Error, solo 3 cifras...");
            return;
        }


        int resultado = multiplicador * multiplicando;

        System.out.println("El producto de la multiplicacion es: " + resultado);
        System.out.println("El proceso es: ");
        System.out.println("   " + multiplicando);
        System.out.println("x  " + multiplicador);
        System.out.println("----------");

        // Convertimos el multiplicador a String
        String s2 = Integer.toString(multiplicador);

        // Sacamos los dígitos uno a uno con substring
        String d3 = s2.substring(2, 3); // Unidades
        String d2 = s2.substring(1, 2); // Decenas
        String d1 = s2.substring(0, 1); // Centenas

        // Calculamos los resultados de cada una de las partes
        int p1 = multiplicando * Integer.parseInt(d3);
        int p2 = multiplicando * Integer.parseInt(d2);
        int p3 = multiplicando * Integer.parseInt(d1);

        // Mostramos los resultados
        System.out.println("   " + p1);
        System.out.println("  " + p2 + "x");
        System.out.println(" " + p3 + "xx");

        System.out.println("----------");
        System.out.println("  " + resultado);
    }
}