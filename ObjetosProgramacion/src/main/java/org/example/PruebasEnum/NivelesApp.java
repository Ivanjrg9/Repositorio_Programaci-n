package org.example.PruebasEnum;

import java.util.Random;
import java.util.Scanner;

public class NivelesApp {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Que dificultado vas a querer??");
        String dificultad = teclado.next();

        int puntuacion = aleatorio.nextInt(4000)+1;


    }
}
