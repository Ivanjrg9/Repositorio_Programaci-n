package org.example;

import java.util.Scanner;

public class PacienteApp {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- Registro de Paciente ---");
        System.out.print("Introduce el nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduce la edad: ");
        int edad = teclado.nextInt();

        System.out.print("Introduce el sexo (H/M): ");
        char sexo = teclado.next().charAt(0);

        System.out.print("Introduce el peso (kg): ");
        double peso = teclado.nextDouble();

        System.out.print("Introduce la altura (cm): ");
        int altura = teclado.nextInt();

        Paciente paciente1 = new Paciente(nombre, edad, sexo, peso, altura);

        Paciente paciente2 = new Paciente("Paco", 70,'H');

        Paciente paciente3 = new Paciente();
        paciente3.setNombre("Joselu");
        paciente3.setEdad(20);
        paciente3.setSexo('H');
        paciente3.setPeso(65);
        paciente3.setAltura(180);

        System.out.println("-----------------------------------");

        System.out.println("Paciente 2:" + paciente2.toString());

        int estafit = paciente1.calcularIMC();

        if (estafit == -1){
            System.out.println("El paciente 1 esta en infrapeso");
        } else if (estafit==0) {
            System.out.println("El paciente 1 esta fit");

        }else {
            System.out.println("El paciente 1 tiene sobrepeso");
        }

        if (paciente1.esMayorDeEdad()){
            System.out.println(" * Es mayor de edad");
        }else {
            System.out.println(" * No es mayor de edad aun");
        }

        System.out.println("--> Dni del paciente 1: " + paciente1.getDni());


    }
}
