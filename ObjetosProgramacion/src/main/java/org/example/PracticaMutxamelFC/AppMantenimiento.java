package org.example.PracticaMutxamelFC;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Jugador> listajugadores = new ArrayList<>();

        System.out.println("=== App de mantenimiento del Mutxamel FC ===");
        System.out.println("[1]. Mantenimiento de jugadores (Añadir jugador, modificar, y añadir acompañantes (solo seniors))");
        System.out.println("[2]. Mantenimiento  de entrenadores (Añadir-modificar-salir)");
        System.out.println("[3]. Mantenimiento de masajistas (Añadir-modificar datos-salir)");
        System.out.println("[4]. Consultar equipos");
        System.out.println("[X]. Salir");
        System.out.println("==========================================================");
        System.out.println("Selecciona una opción -->");
        String opcion = teclado.next();

        switch (opcion){
            case "1":
                System.out.println("");
        }

    }
}
