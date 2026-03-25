package org.example.PracticasSuspendidas;

import java.util.Scanner;

public class Multiplicaciones3Cifras {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        int multiplicando = 0;
        do {
            System.out.println("Introduce el multiplicando (3 cifras) :");
            multiplicando = teclado.nextInt();
            //Comprobamos que sean exactamente 3 cifras
            if (multiplicando<100 || multiplicando > 999){
                System.out.println("Error, solo 3 cifras...");

            }
        }while (multiplicando < 100 || multiplicando > 999);

        int multiplicador = 0;
        do {
            System.out.println("Introduce el multiplicador (3 cifras) :");
            multiplicador = teclado.nextInt();

            //Comprobamos que sean exactamente 3 cifras
            if (multiplicador<100 || multiplicador > 999){
                System.out.println("Error, solo 3 cifras...");

            }
        }while (multiplicador<100 || multiplicador > 999);

        int resultado = multiplicador * multiplicando;

        System.out.println("El producto de la multiplicacion es: " + resultado);
        System.out.println("El proceso es: ");
        System.out.println("   " + multiplicando);
        System.out.println("x  " + multiplicador);
        System.out.println("----------");

        // Convertimos el multiplicador a String
        String posicion = Integer.toString(multiplicador);

        // Sacamos los dígitos uno a uno con substring
        String numero1 = posicion.substring(2, 3); // Unidades
        String numero2 = posicion.substring(1, 2); // Decenas
        String numero3 = posicion.substring(0, 1); // Centenas

        // Calculamos los resultados de cada una de las partes
        int parcial1 = multiplicando * Integer.parseInt(numero1);
        int parcial2 = multiplicando * Integer.parseInt(numero2);
        int parcial3 = multiplicando * Integer.parseInt(numero3);

        // Mostramos los resultados
        System.out.println("   " + parcial1);
        System.out.println("  " + parcial2 + "x");
        System.out.println(" " + parcial3 + "xx");

        System.out.println("----------");
        System.out.println("  " + resultado);
    }
}