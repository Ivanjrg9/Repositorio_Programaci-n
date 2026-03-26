package org.example.PracticasSuspendidas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        boolean formatoCorrecto = false;
        int bolasSorteo;
        int reintegro;
        System.out.println("*** Sorteo de la primitiva ***");


        do {
            System.out.println("Selecciona seis numeros del 1 al 49 y un numero reintegro del 0 al 9:");
            System.out.println("Formato:  N-N-N-N-N-N/R");
            String eleccionSorteoUsuario = teclado.nextLine();
            String sorteoUsuarioVector[] = eleccionSorteoUsuario.split("[-/]");

            if (eleccionSorteoUsuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")){
                if (Integer.parseInt(Arrays.toString(sorteoUsuarioVector)) > 49 || Integer.parseInt(Arrays.toString(sorteoUsuarioVector) < 1)){

                }


                formatoCorrecto = true;

            }else {
                System.out.println("------------------------------");
                System.out.println("Error, formato incorrecto...");
                System.out.println("------------------------------");

            }


        }while (!formatoCorrecto);


    }
}
