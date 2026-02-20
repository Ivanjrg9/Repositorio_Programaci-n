package org.example.PruebaExcepciones;

public class EjemploClase {
    static void main() {


        int cuenta = -5;

        if (cuenta<=0){
            throw new CuentaSaldoNegtivo();
        }
    }
}
