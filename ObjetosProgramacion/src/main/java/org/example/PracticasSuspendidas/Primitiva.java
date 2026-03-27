package org.example.PracticasSuspendidas;

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
            String bolasSorteoUsuario = teclado.nextLine();
            String bolasUsuarioVector[] = bolasSorteoUsuario.split("[-/]");

            if (bolasSorteoUsuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")){
                for (int i = 0; i < bolasUsuarioVector.length; i++) {
                    int numeros = Integer.parseInt(bolasUsuarioVector[i]);
                    if (numeros < 1 || numeros > 49){
                        System.out.println("------------------------------");
                        System.out.println("Error, debes introducir numeros entre 1 y 49...");
                        System.out.println("------------------------------");
                        break;
                    }
                }

                for (int i = 0; i < 6; i++) {
                    bolasSorteo = aleatorio.nextInt(48)+1;
                    System.out.println(bolasSorteo);

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
