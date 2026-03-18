package org.example.EjercicioEntornos;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void suma() {
        Calculadora calc = new Calculadora(2,3);
         int valorEsperado = 8;
         int valorObtenido = calc.suma();

         assertEquals(valorEsperado,valorObtenido);
    }

    @org.junit.jupiter.api.Test
    void resta() {
        Calculadora calc = new Calculadora(2,3);
        int valorEsperado = 1;
        int valorObtenido = calc.resta();

        assertEquals(valorEsperado,valorObtenido);
    }

    @org.junit.jupiter.api.Test
    void multipliar() {
        Calculadora calc = new Calculadora(2,3);
        int valorEsperado = 6;
        int valorObtenido = calc.multipliar();

        assertEquals(valorEsperado,valorObtenido);
    }

    @org.junit.jupiter.api.Test
    void dividir() {
        Calculadora calc = new Calculadora(50,2);
        int valorEsperado = 25;
        int valorObtenido = calc.dividir();

        assertEquals(valorEsperado,valorObtenido);
    }
}