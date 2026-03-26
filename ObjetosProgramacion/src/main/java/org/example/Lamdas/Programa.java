package org.example.Lamdas;

public class Programa {
    static void main() {

        Prueba anonima = new Prueba() {
            @Override
            public char saludar(String nombre) {
                System.out.println("Hola" + nombre + " soy una anónima");
                return nombre.charAt(nombre.length()-1);
            }
        };

        Prueba lambda =(String nombre)->{System.out.println("Hola " + nombre + " soy una lambda");
            int num = (nombre.length()-1)/2;
            return nombre.charAt(num);
        };
        anonima.saludar("Ivan");
        lambda.saludar("Ismael");

        System.out.println(anonima.saludar("Ivan"));
        System.out.println(lambda.saludar("Ismael"));

    }
}
