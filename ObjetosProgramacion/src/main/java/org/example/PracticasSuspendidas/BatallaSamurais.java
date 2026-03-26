package org.example.PracticasSuspendidas;

import java.util.Arrays;
import java.util.Scanner;

public class BatallaSamurais {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        final int numeroSamurais = 7;
        final int potenciaTotalEquipo = 30;
        final int numeroDeEquipos = 2;
        boolean errorEquipo;
        int equipo1[] = new int [numeroSamurais];
        int equipo2[] = new int [numeroSamurais];

        System.out.println("-------------------------------------------------------------------");
        System.out.println("¡Bienvenid@ a la batalla de Samurais!");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Reglas del juego:");
        System.out.println("> 2 Equipos");
        System.out.println("> 7 Samurais por equipo con valor del 1 al 24");
        System.out.println("> 30 puntos de potencia por equipo");
        System.out.println("Ejemplo de equipo: [24 1 1 1 1 1 1]");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < numeroDeEquipos; i++) {
            do {
                errorEquipo = false;

                System.out.println("[Equipo " + (i + 1) + "]" + ", intruduce a tus Samurais (separados por espacios):");
                String equipo[];
                int valorEquipo = 0;
                int valorPorSmaurai;

                String samurais = teclado.nextLine();
                equipo = samurais.split(" ");
                if (equipo.length == numeroSamurais) {
                    for (int b = 0; b < equipo.length; b++) {
                        valorPorSmaurai = Integer.parseInt(equipo[b]);
                        valorEquipo += valorPorSmaurai;
                        if (valorPorSmaurai < 1 || valorPorSmaurai > 24) {
                            System.out.println("Cada samurai debe de tener entre 1 y 24 de potencia...");
                            errorEquipo = true;
                        }
                        if (i == 0) {
                            equipo1[b] = valorPorSmaurai;
                        } else {
                            equipo2[b] = valorPorSmaurai;
                        }
                    }
                    if (valorEquipo > potenciaTotalEquipo) {
                        System.out.println("La potencia maxima por equipo es 30 y has introducido " + valorEquipo);
                        errorEquipo = true;
                    }
                } else {
                    System.out.println("Has de introducir " + numeroSamurais + " samurais exactamente y has introducido " + equipo.length + " samurai/s...");
                    errorEquipo = true;
                }
            } while (errorEquipo);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Equipo 1: " + Arrays.toString(equipo1));
        System.out.println("Equipo 2: " + Arrays.toString(equipo2));
        System.out.println("Equipos guardados con exito, a la batallaaa!!");
        System.out.println("-------------------------------------------------------------------");


        int puntosEquipo1 = 0;
        int puntosEquipo2 = 0;

        for (int i = 0; i < numeroSamurais; i++) {
            if (equipo1[i] > equipo2[i]){
                System.out.println("Equipo 1, ganador ronda " + (i+1));
                equipo2[i] = 0;
                puntosEquipo1++;
            } else if (equipo1[i] < equipo2[i]) {
                System.out.println("Equipo 2, ganador ronda " + (i+1));
                equipo1[i] = 0;
                puntosEquipo2++;
            }else {
                System.out.println("Empate en la ronda " + (i+1) + ", no muere ninguno!");
            }
        }
        if (puntosEquipo1>puntosEquipo2){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("El equipo 1 ha ganado con un total de " + puntosEquipo1 + " muertes a favor!");
        }else if (puntosEquipo1<puntosEquipo2){
            System.out.println("-------------------------------------------------------------------");
            System.out.println("El equipo 2 ha ganado con un total de " + puntosEquipo2 + " muertes a favor!");
        }else {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("Ha habido un empate entre los dos equipos, buena batalla!!");
        }

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Asi han quedado los equipos despues de la batalla:");
        System.out.println("Equipo 1: " + Arrays.toString(equipo1));
        System.out.println("Equipo 2: " + Arrays.toString(equipo2));
    }
}
