package org.example.PracticaHormiguero;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Gestiona la lógica principal de un programa de televisión, incluyendo
 * su equipo de empleados y sus invitados.
 * Implementa la relación de composición con Empleados e Invitados.
 */
@Getter
public class Programa {
    @Setter
    private String nombre;
    private int temporadas;
    @Setter
    private Cadena cadena;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    @Setter
    private Empleado director;

    /**
     * Constructor que inicializa el programa, crea al director y establece
     * la relación bidireccional con la cadena.
     * @param nombre Nombre del programa.
     * @param cadena Objeto Cadena al que pertenece.
     * @param nombreDirector Nombre del director responsable.
     */
    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();

        this.director = new Empleado(nombreDirector, "director", null);
        this.listaEmpleados.add(this.director);

        cadena.getListaProgramas().add(this);
    }

    /**
     * Crea un nuevo empleado y lo añade a la lista del programa.
     * @param nombre Nombre del empleado.
     * @param cargo Cargo que ocupa (director, técnico, presentador, colaborador).
     * @param director Referencia al director del programa.
     */
    public void insertarEmpleado(String nombre, String cargo, Empleado director) {
        listaEmpleados.add(new Empleado(nombre, cargo, director));
    }

    /**
     * Crea un nuevo invitado y lo añade a la lista del programa.
     * @param nombre Nombre del invitado.
     * @param profesion Profesión del invitado.
     * @param temporada Temporada en la que acude.
     */
    public void insertarInvitado(String nombre, String profesion, int temporada) {
        listaInvitados.add(new Invitado(nombre, profesion, temporada));
    }

    /**
     * Muestra los invitados que asistieron en una temporada específica y el total.
     * @param temporada Número de la temporada a consultar.
     */
    public void invitadosTemporada(int temporada) {
        int cont = 0;
        for (Invitado invitado : listaInvitados) {
            if (invitado.getTemporada() == temporada) {
                System.out.println("- " + invitado.getNombre() + " (" + invitado.getProfesion() + ")");
                cont++;
            }
        }
        System.out.println("Total en temporada " + temporada + ": " + cont);
    }

    /**
     * Devuelve las veces que un invitado ha visitado el programa.
     * @param nombre Nombre del invitado.
     * @return Número de visitas.
     */
    public int vecesInvitado(String nombre) {
        int contador = 0;
        for (Invitado invitado : listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre)) contador++;
        }
        return contador;
    }
    /**
     * Imprime las veces que ha ido un invitado, sus fechas y temporadas.
     * @param nombre Nombre del invitado a rastrear.
     */
    public boolean rastrearInvitado(String nombre) {
        for (Invitado invitado: listaInvitados) {
            if (invitado.getNombre().equalsIgnoreCase(nombre))
                return true;
        }
        return false;
    }


    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Programa{nombre='" + nombre + "', cadena=" + cadena.getNombre() + "}";
    }
}