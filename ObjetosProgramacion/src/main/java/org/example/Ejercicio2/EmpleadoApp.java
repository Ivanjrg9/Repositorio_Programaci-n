package org.example.Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;

public class EmpleadoApp {
    static void main() {
        ArrayList<Empleado> listaempleados = new ArrayList<>();

        Desarrollador jose = new Desarrollador();
        Disenyador manuel = new Disenyador();
        Gerente pepe = new Gerente();

        listaempleados.addAll(Arrays.asList(jose, manuel, pepe));

        for (Empleado empleado : listaempleados){
            empleado.realizarTarea();
        }
        asignarTarea(jose);

        for (Empleado empleado : listaempleados){
            asignarTarea(empleado);
        }
    }
    public static void asignarTarea(Empleado empleado){
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }
}
