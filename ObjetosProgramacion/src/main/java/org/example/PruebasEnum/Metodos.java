package org.example.PruebasEnum;

public class Metodos {
    static void main() {
        Metodo opcion = Metodo.PAYPAL;

        System.out.println(opcion);

        System.out.println("Metodos validos:");
        for (Metodo metodo : Metodo.values()){
            System.out.println(metodo);
        }

        System.out.println(opcion.ordinal());//posicion
        System.out.println(opcion.name());//nombre
        System.out.println("Comision para el metodo " + opcion + " : " + opcion.getComision());

    }
}
