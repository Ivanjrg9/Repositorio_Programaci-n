package org.example;

public class EstudianteApp {
    static void main() {
        Estudiante ivan = new Estudiante("ivan", "1daw", "ikdmfs@nfdikds");
        Estudiante alejandroi = new Estudiante("Alejandro");

        System.out.println(ivan.toString());
        System.out.println(alejandroi.toString());
        System.out.println(alejandroi.getNia());

        System.out.println("Estudiantes creados :" + Estudiante.getContadorEstudiantes());
        System.out.println(ivan.getLibros());
    }
}
