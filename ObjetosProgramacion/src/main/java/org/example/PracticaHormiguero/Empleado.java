package org.example.PracticaHormiguero;

import java.util.ArrayList;
/**
 * Representa a un trabajador de un programa de televisión.
 * Incluye un sistema de autogeneración de ID y validación de cargos jerárquicos.
 */
public class Empleado {
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    private static int contador=0;

    /**
     * Crea un nuevo empleado asignando un ID automático y validando su cargo.
     * @param nombre Nombre completo del empleado.
     * @param cargo Puesto (director, técnico, presentador, colaborador).
     * @param director Referencia al director del programa (null si el cargo es director).
     */
    public Empleado(String nombre,String cargo,Empleado director){
        this.id = generarId();
        this.nombre = nombre;
        setCargo(cargo);
        this.director = (this.cargo.equals("director")) ? null : director;
    }
    /**
     * Genera un identificador único con formato EPXXX.
     * @return El ID generado (ej: EP001).
     */
    private String generarId() {
            return String.format("EP%03d", contador++);
    }
    public String getCargo() {
        return cargo;
    }
    /**
     * Valida y establece el cargo del empleado.
     * @param cargo El cargo a asignar. Si no es válido, se asigna "pte".
     */
    public void setCargo(String cargo) {
        if (cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador")) {
            this.cargo = cargo;
        } else {
            this.cargo = "pte";
        }
    }

    @Override
    public String toString() {
        return "Empleado{nombre='" + nombre + "', id='" + id + "', cargo='" + cargo +
                "', director=" + (director != null ? director.nombre : "null") + "}";
    }
}

