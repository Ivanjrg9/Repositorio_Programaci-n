package org.example;

public class LibrosApp {
    static void main() {

        Libros libro1 = new Libros("El principito", "Antonie");
        Libros libro2 = new Libros("Harry Potter", "J.K Rowling");
        Libros libro3 = new Libros("El quijote", "Cervantes");

        System.out.println(libro1.toString());


        System.out.println(libro3);
        System.out.println("El id del primer libro es: " + libro1.getId());
        System.out.println("El id del segundo libro es: " + libro2.getId());
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        System.out.println("Total de libros en la biblioteca " + Libros.getCantidadLibros());
        System.out.println("-----------------------------------------------");

        System.out.println("** Prestando libro **");
        libro1.Prestar();

        System.out.println("Libros disponibles ahora: " + Libros.getLibrosDisponible());
        System.out.println("-----------------------------------------------");

        System.out.println("** Devolviendo libro **");
        libro1.devolver();

        System.out.println("Libros disponibles ahora: " + Libros.getLibrosDisponible());
    }
}
