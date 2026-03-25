package org.example.PracticasSuspendidas;

import java.util.Scanner;

public class CalculadoraInteligente {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("*** Bienvenid@ a la calculadora simple ***");
        System.out.println("Introduce el operando...");

        if (teclado.hasNextInt()){
            int numero = teclado.nextInt();
            System.out.println("---------------------------------");
            System.out.println("> Elige una operación:");
            System.out.println("Sumar [+]");
            System.out.println("Restar [-]");
            System.out.println("Multiplicar [*] ");
            System.out.println("Dividir [/]");
            System.out.println("Raíz Cuadrada [R]");

            String opcion = teclado.next().toUpperCase();

            switch (opcion){
                case "+":
                    System.out.println("Introduce el numero por el cual quieres sumar:");
                    int numeroSumar = teclado.nextInt();
                    int resultadoSumar = numero + numeroSumar;
                    System.out.println("El resultado de la suma es: " + resultadoSumar);
                    break;
                case "-":
                    System.out.println("Introduce el numero a restar:");
                    int numeroRestar = teclado.nextInt();
                    int resultadoResta = numero - numeroRestar;
                    System.out.println("El resultado de la resta es: " + resultadoResta);
                    break;
                case "*":
                    System.out.println("Introduce el numero a multiplicar:");
                    int numeroMultiplicar = teclado.nextInt();
                    int resultadoMultiplicacion = numero * numeroMultiplicar;
                    System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
                    break;
                case "/":
                    System.out.println("Introduce el numero a dividir:");
                    int numeroDividir = teclado.nextInt();
                    if (numeroDividir <= 0 ){
                        System.out.println("Error no se puede dividir entre 0...");
                        return;
                    }else {
                        int resultadoDivision = numero / numeroDividir;
                        System.out.println("El resultado de la division es: " + resultadoDivision);
                    }
                    break;
                case "R":
                    if (numero <= 0){
                        System.out.println("Error: no se puede ejecutar la raíz cuadrada de un numero negativo o igual a 0...");
                    }else {
                        double resultadoRaiz = Math.sqrt(numero);
                        System.out.println("La raíz cuadrada de " + numero + " es: " + resultadoRaiz);

                    }
                    break;
                default:
                    System.out.println("Elige una opción correcta por favor...");
                    break;

            }
        }else {
            System.out.println("Introduce solo números por favor...");
        }
    }
}
