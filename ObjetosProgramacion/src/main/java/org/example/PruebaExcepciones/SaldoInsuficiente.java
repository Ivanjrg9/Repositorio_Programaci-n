package org.example.PruebaExcepciones;

public class SaldoInsuficiente extends RuntimeException {
    public SaldoInsuficiente(String message) {
        super("No tienes suficiente saldo");
    }

}
