package org.example.PracticaHormiguero;

import java.util.ArrayList;

/**
 * Representa una cadena de televisión que agrupa distintos programas.
 * Mantiene una relación de agregación con la clase Programa.
 */
public class Cadena {
    private String nombre;
    private ArrayList<Programa> listaProgramas;

    /**
     * Constructor para la clase Cadena.
     * Por defecto se crea sin programas.
     * @param nombre El nombre de la cadena de televisión.
     */
    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    /**
     * Agrega un programa a la lista de la cadena.
     * @param programa El programa a añadir.
     */
    public void crearPrograma(Programa programa) {
        this.listaProgramas.add(programa);
    }

    /**
     * Elimina un programa de la lista de la cadena.
     * @param programa El programa a eliminar.
     */
    public void borrarPrograma(Programa programa) {
        this.listaProgramas.remove(programa);
    }

    /**
     * Obtiene el nombre de la cadena.
     * @return nombre de la cadena.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la lista de programas asociados a la cadena.
     * @return ArrayList de objetos Programa.
     */
    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    /**
     * Devuelve una representación en texto de la cadena.
     */
    @Override
    public String toString() {
        return "Cadena{nombre='" + nombre + "', listaProgramas=" + listaProgramas + "}";
    }
}