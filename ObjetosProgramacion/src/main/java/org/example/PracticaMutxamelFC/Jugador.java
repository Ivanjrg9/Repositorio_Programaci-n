package org.example.PracticaMutxamelFC;

import java.util.ArrayList;

/**
 * Clase que representa a un Jugador del Mutxamel FC.
 * Gestiona la información específica del futbolista, como su posición en el campo,
 * su categoría y su dorsal único. Implementa las interfaces de comportamiento del club.
 * * @author Ivan
 * @version 1.0
 */
public class Jugador extends MutxamelFC implements AccionesDeportivas {

    /** Número identificativo del jugador en su equipo */
    private int dorsal;

    /** Demarcación táctica del jugador (Portero, Defensa, etc.) */
    private Posiciones posicion;

    /** Equipo o categoría a la que pertenece el jugador (Senior, Juvenil, etc.) */
    private Equipos categoria;

    /**
     * Constructor para instanciar un nuevo Jugador.
     * Al crearse, se valida la disponibilidad del dorsal y se añade automáticamente
     * al registro del club.
     * * @param nombre Nombre completo del jugador.
     * @param edad Edad cronológica.
     * @param posicion Valor del Enum {@link Posiciones}.
     * @param categoria Valor del Enum {@link Equipos}.
     * @param dorsal Número de camiseta asignado.
     * @param listajugadores Lista global de jugadores para verificar duplicados.
     */
    public Jugador(String nombre, int edad, Posiciones posicion, Equipos categoria, int dorsal, ArrayList<Jugador> listajugadores) {
        super(nombre, edad);
        this.categoria = categoria;
        this.posicion = posicion;
        setDorsal(dorsal, listajugadores);
    }

    /**
     * Simula la fase de calentamiento previa a la actividad física.
     */
    public void calentar() {
        System.out.println("Jugador " + getNombre() + " calentando");
    }

    /**
     * Representa el periodo de recuperación o inactividad del jugador.
     */
    public void descansar() {
        System.out.println("Jugador " + getNombre() + " descansando");
    }

    /**
     * Acción de anotar un tanto durante un encuentro.
     */
    public void marcarGol() {
        System.out.println("GOOOOOOOOOOOOL!!!");
    }

    /**
     * Obtiene el número de dorsal del jugador.
     * @return El número de camiseta.
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * Asigna un dorsal al jugador.
     * Realiza una validación para asegurar que el dorsal no esté repetido dentro
     * de la misma categoría. Si es válido, añade el jugador a la lista proporcionada.
     * * @param dorsal El número a asignar.
     * @param listajugadores Lista donde se busca la existencia del dorsal.
     * @throws DorsalDuplicadoException Si ya existe un jugador con el mismo dorsal en la categoría.
     */
    public void setDorsal(int dorsal, ArrayList<Jugador> listajugadores) {
        for (Jugador jugador : listajugadores) {
            if (dorsal == jugador.getDorsal() && jugador.getCategoria().equals(categoria)) {
                throw new DorsalDuplicadoException();
            }
        }
        this.dorsal = dorsal;
        listajugadores.add(this);
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    /**
     * El jugador se prepara para el próximo evento.
     */
    @Override
    public void concentrarse() {
        System.out.println("Jugador " + getNombre() + " concentrandose para el partido");
    }

    /**
     * Gestiona el traslado del jugador a otra ubicación.
     * @param ciudad Destino del desplazamiento.
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("Jugador " + getNombre() + " viajando a " + ciudad);
    }

    /**
     * Ejecuta la coreografía de celebración tras un gol (Por la cara AJAJA).
     */
    @Override
    public void celebrarGol() {
        System.out.println("Jugador " + getNombre() + " corriendo al corner gritando gooool!!");
    }

    /**
     * Realiza la sesión de entrenamiento correspondiente.
     */
    @Override
    public void entrenar() {
        System.out.println("Jugador " + getNombre() + " esta entrenado");
    }

    /**
     * Simula la disputa de un partido oficial.
     * @param rival Nombre del oponente.
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println("Jugador enfrentandose a " + rival);
    }
}