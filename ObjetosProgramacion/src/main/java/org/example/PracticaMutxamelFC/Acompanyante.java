package org.example.PracticaMutxamelFC;

/**
 * Clase que representa a un Acompañante de un integrante del Mutxamel FC.
 * Esta clase vincula a una persona (familiar, amigo, representante) con un
 * jugador específico, permitiéndole participar en las actividades logísticas del club.
 * * @author Ivan
 * @version 1.0
 */
public class Acompanyante extends MutxamelFC {
    private Jugador integrante;
    private String parentesco;

    /**
     * Constructor para crear un nuevo Acompañante.
     * * @param nombre Nombre del acompañante.
     * @param edad Edad del acompañante.
     * @param integrante Objeto {@link Jugador} al que está vinculado.
     * @param parentesco Descripción del vínculo afectivo o profesional.
     */
    public Acompanyante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    /**
     * Simula la acción de apoyo moral del acompañante hacia el equipo.
     */
    public void animarEquipo() {
        System.out.println("Vamooooos Equipoooo!!!");
    }

    /**
     * Obtiene el parentesco registrado.
     * @return String con la relación.
     */
    public String getParentesco() {
        return parentesco;
    }

    /**
     * Actualiza el parentesco del acompañante.
     * @param parentesco Nuevo vínculo a establecer.
     */
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    /**
     * Obtiene el jugador al que acompaña esta persona.
     * @return Objeto {@link Jugador} vinculado.
     */
    public Jugador getIntegrante() {
        return integrante;
    }

    /**
     * Cambia el jugador vinculado a este acompañante.
     * @param integrante Nuevo objeto Jugador.
     */
    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    /**
     * El acompañante dedica tiempo a la preparación mental previa al encuentro.
     */
    @Override
    public void concentrarse() {
        System.out.println("Acomañante " + getNombre() + " concentrandose para el partido");
    }

    /**
     * Representa el desplazamiento del acompañante para seguir al equipo.
     * @param ciudad Destino del viaje.
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("Acompañante viajando a " + ciudad);
    }

    /**
     * Acción de festejo del acompañante tras un gol del equipo.
     */
    @Override
    public void celebrarGol() {
        System.out.println("Acompañante " + getNombre() + " gritando gooool!!");
    }
}