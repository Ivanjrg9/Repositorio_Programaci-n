package org.example.PracticaMutxamelFC;

/**
 * Interfaz que define las competencias estrictamente deportivas dentro del club.
 * Establece los métodos obligatorios para aquellos integrantes que participan
 * directamente en la actividad física o técnica del Mutxamel FC.
 * * @author Ivan
 * @version 1.0
 */
public interface AccionesDeportivas {

    /**
     * Define la actividad de entrenamiento.
     * Cada clase debe implementar su propia lógica: un jugador realiza el ejercicio
     * mientras que un entrenador dirige la sesión.
     */
    void entrenar();

    /**
     * Gestiona la participación en un encuentro oficial o amistoso.
     * * @param rival Nombre del equipo oponente contra el cual se compite.
     */
    void jugarPartido(String rival);
}