package org.example.PracticaMutxamelFC;
/**
 * Interfaz que define las funciones sociales y logísticas comunes a todos
 * los integrantes del Mutxamel FC.
 * * Establece los comportamientos básicos que cualquier persona vinculada
 * al club debe cumplir durante la disciplina de grupo o eventos oficiales.
 * * @author Ivan
 * @version 1.0
 */
public interface FuncionesIntegrantes {
    /**
     * Define el estado de preparación y enfoque previo a un evento deportivo.
     * Cada integrante lo implementa según su rol (ej. charla técnica,
     * descanso o mentalización).
     */
    void concentrarse();
    /**
     * Gestiona el desplazamiento de los integrantes a una ubicación externa.
     * * @param ciudad Nombre del destino al que se traslada el integrante.
     */
    void viajar(String ciudad);
    /**
     * Representa la acción de júbilo tras anotar un tanto a favor del equipo.
     * La implementación varía desde la celebración en el campo hasta
     * el apoyo desde la grada.
     */
    void celebrarGol();

}