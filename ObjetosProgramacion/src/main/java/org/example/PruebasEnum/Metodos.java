package org.example.PruebasEnum;

import java.util.Scanner;

public class Metodos {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Metodo opcion = Metodo.PAYPAL;

        System.out.println(opcion);

        System.out.println("Metodos validos:");
        for (Metodo metodo : Metodo.values()){
            System.out.println(metodo);
        }

        System.out.println(opcion.ordinal());//posicion
        System.out.println(opcion.name());//nombre
        System.out.println("Comision para el metodo " + opcion + " : " + opcion.getComision());

        System.out.println("Elige un metodo de pago: ");
        Metodo respuesta = Metodo.valueOf(teclado.next());
        System.out.println("Metodo elegido: " + respuesta);


    }
}
