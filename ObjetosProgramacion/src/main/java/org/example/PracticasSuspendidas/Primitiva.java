package org.example.PracticasSuspendidas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        boolean formatoCorrecto = false;

        System.out.println("*** Sorteo de la primitiva ***");

        do {
            System.out.println("Selecciona seis numeros del 1 al 49 y un numero reintegro del 0 al 9:");
            System.out.println("Formato:  N-N-N-N-N-N/R");
            String bolasSorteoUsuario = teclado.nextLine();

            if (bolasSorteoUsuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")){
                String bolasUsuarioVector[] = bolasSorteoUsuario.split("[-/]");
                for (int i = 0; i < bolasUsuarioVector.length; i++) {
                    int numeros = Integer.parseInt(bolasUsuarioVector[i]);
                    if (numeros < 1 || numeros > 49){
                        System.out.println("------------------------------");
                        System.out.println("Error, debes introducir numeros entre 1 y 49...");
                        System.out.println("------------------------------");
                        break;
                    }
                }

                System.out.println("*** NUMEROS DEL SORTEO ***");

                int aciertos = 0;
                int bomboSorteo[] = new int[6];

                for (int i = 0; i < bomboSorteo.length; i++) {
                    int bolasBombo = aleatorio.nextInt(49)+1;
                    boolean repetida = false;
                    for (int j = 0; j < i; j++) {
                        if (bomboSorteo[j] == bolasBombo) {
                            repetida = true;
                            break;
                        }
                    }
                    if (repetida) {
                        i--;
                        continue;
                    }
                    bomboSorteo[i] = bolasBombo;
                }
                Arrays.sort(bomboSorteo);
                int reintegro;
                reintegro = aleatorio.nextInt(10);
                System.out.println("Reintegro: " + reintegro);
                System.out.println("Bolas del sorteo: " + Arrays.toString(bomboSorteo));

                for (int i = 0; i < bomboSorteo.length; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (bomboSorteo[i] == Integer.parseInt(bolasUsuarioVector[j])) {
                            aciertos++;
                            break;
                        }
                    }
                }
                System.out.println("Aciertos: " + aciertos);

                int ultimoDigito = bolasSorteoUsuario.charAt(bolasSorteoUsuario.length()-1) - '0';

                if (reintegro == ultimoDigito){
                    System.out.println("Reintegro!");
                }else {
                    System.out.println("No ha tocado el reintegro...");
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