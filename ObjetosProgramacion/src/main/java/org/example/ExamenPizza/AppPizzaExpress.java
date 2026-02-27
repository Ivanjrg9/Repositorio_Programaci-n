package org.example.ExamenPizza;

import java.util.Scanner;

public class AppPizzaExpress {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        Empleado joselu = new Empleado("ffdf","joselu");

        System.out.println("Hola cliente nuevo, dime tu nombre");
        String nombre = teclado.next();
    }
}
