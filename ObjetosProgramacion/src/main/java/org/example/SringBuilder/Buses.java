
package org.example.SringBuilder;

import java.util.Random;

public class Buses {
    public static final int TAM = 97;

    public static void main(String[] args) throws InterruptedException {
        Random aleatorio = new Random();

        int a = 0;// POSICIÓN INICIAL DEL AUTOBÚS
        int b = 0;// POSICIÓN INICIAL DEL AUTOBÚS

        System.out.println("\n<<<<<<<<<< AUTOBUSITO >>>>>>>>>>");
        Thread.sleep(3000);



        while (a < TAM && b < TAM) {
            int movimientoRandom = aleatorio.nextInt(2);
            if (movimientoRandom == 1){
                a++;
            }else {
                b++;
            }

            limpiarPantalla();

            System.out.println(dibujarCarrera(a,b));
            Thread.sleep(70);
        }

        if (a >= TAM){
            System.out.println("Autobus #1 es el ganador!");
        }else {
            System.out.println("Autobus #2 es el gandor!");
        }



        System.out.println("\033[32m" + "EL AUTOBUSITO HA LLEGADO A SU DESTINO!!" + "\033[0m");

    }

    public static String dibujarCarrera(int a, int b) {

        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(a)).append("________________    ").append(" ".repeat(TAM - a)).append("|\n");
        sb.append(" ".repeat(a)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - a)).append("|\n");
        sb.append(" ".repeat(a)).append("|  #1 IES MUTXAMEL  |)").append(" ".repeat(TAM - a)).append("|\n");
        sb.append(" ".repeat(a)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - a)).append("|\n");
        sb.append("_".repeat(117));

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(b)).append("________________    ").append(" ".repeat(TAM - b)).append("|\n");
        sb.append(" ".repeat(b)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - b)).append("|\n");
        sb.append(" ".repeat(b)).append("|  #2 IES MUTXAMEL  |)").append(" ".repeat(TAM - b)).append("|\n");
        sb.append(" ".repeat(b)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - b)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}
