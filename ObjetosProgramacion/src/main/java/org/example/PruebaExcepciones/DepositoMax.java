package org.example.PruebaExcepciones;

public class DepositoMax extends RuntimeException {
    public DepositoMax(String message) {
        super("El maximo para ingresar es de 3000€...");
    }
}
