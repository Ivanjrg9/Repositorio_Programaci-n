package org.example.PracticaMutxamelFC;

public class DorsalDuplicadoException extends RuntimeException {
    public DorsalDuplicadoException() {
        super("Jugadores con dorsales iguales");
    }
}
