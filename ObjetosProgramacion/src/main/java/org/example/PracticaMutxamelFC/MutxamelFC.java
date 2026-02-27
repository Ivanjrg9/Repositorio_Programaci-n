package org.example.PracticaMutxamelFC;

/**
 * Clase abstracta que define la estructura base para cualquier integrante del Mutxamel FC.
 * Proporciona los atributos comunes como nombre y edad, y establece el contrato
 * de comportamiento mediante la interfaz {@link FuncionesIntegrantes}.
 * * No puede ser instanciada directamente; debe ser extendida por clases específicas
 * como Jugador, Entrenador o Acompanyante.
 * * @author Ivan
 * @version 1.0
 */
public abstract class MutxamelFC implements FuncionesIntegrantes {
    private String nombre;
    private int edad;

    /**
     * Constructor base para los integrantes del club.
     * * @param nombre El nombre que identificará al integrante.
     * @param edad La edad del integrante.
     */
    public MutxamelFC(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del integrante.
     * @return Cadena de texto con el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Actualiza el nombre del integrante.
     * @param nombre Nuevo nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del integrante.
     * @return Valor entero de la edad.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Actualiza la edad del integrante.
     * @param edad Nueva edad a asignar.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}