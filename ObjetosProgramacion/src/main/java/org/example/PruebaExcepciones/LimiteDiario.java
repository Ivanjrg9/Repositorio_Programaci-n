package org.example.PruebaExcepciones;

public class LimiteDiario extends RuntimeException {
    public LimiteDiario(String message) {
        super("El limite diario es de 600€...");
    }
}
