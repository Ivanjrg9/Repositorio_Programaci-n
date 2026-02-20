package org.example.PruebaExcepciones;

public class CuentaSaldoNegtivo extends RuntimeException {
    public CuentaSaldoNegtivo(String message) {
        super("El saldo tiene que ser positivo");
    }

    public CuentaSaldoNegtivo() {

    }
}
