package RecuperacioFormiguero;

import java.util.ArrayList;

/**
 * Representa una cadena de televisión.
 * Mantiene una lista de programas asociados (relación de agregación bidireccional con Programa).
 */
public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    /**
     * Constructor de Cadena. Se crea sin programas por defecto.
     * @param nombre Nombre de la cadena de televisión.
     */
    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<>();
    }

    /**
     * @return Nombre de la cadena.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return Lista de programas de la cadena.
     */
    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    /**
     * @param nombre Nuevo nombre de la cadena.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Añade un programa a la lista de la cadena.
     * @param programa Programa a añadir.
     */
    public void agregarPrograma(Programa programa) {
        if (!listaProgramas.contains(programa)) {
            listaProgramas.add(programa);
        }
    }

    /**
     * Elimina un programa de la lista de la cadena.
     * @param programa Programa a eliminar.
     */
    public void eliminarPrograma(Programa programa) {
        listaProgramas.remove(programa);
    }

    @Override
    public String toString() {
        return "Cadena [nombre='" + nombre + "', listaProgramas=" + listaProgramas + "]";
    }
}
