package org.example.PruebaExcepciones;

import java.util.Scanner;

public class CuentaBancariaApp {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        CuentaBancaria cuenta1 = new CuentaBancaria(1200);

        System.out.println("=== Cajero Automatico ===");
        System.out.println("[1]. Consultar saldo");
        System.out.println("[2]. Ingresar dinero");
        System.out.println("[3]. Retirar dinero");
        System.out.println("[X]. Salir");

        String opcion  = teclado.next();

        switch (opcion){
            case "1":
                cuenta1.consultarSlado(cuenta1.getSaldo());
                break;
            case "2":
                cuenta1.ingresarDienro(cuenta1.getSaldo());
                break;
            case "3":
               cuenta1.retirarDinero(cuenta1.getSaldo());
               break;
            case "X":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Elige una opcion correcta...");
                break;
        }
    }
}
