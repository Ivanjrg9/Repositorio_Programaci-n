package org.example.EjercicioEntornos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void suma() {
        Calculadora calc = new Calculadora(2, 3);
        int valorEsperado = 5;
        int valorObtenido = calc.suma();
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void resta() {
        Calculadora calc = new Calculadora(2, 3);
        int valorEsperado = 1;
        int valorObtenido = calc.resta();
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void multipliar() {
        Calculadora calc = new Calculadora(2, 3);
        int valorEsperado = 6;
        int valorObtenido = calc.multipliar();
        assertEquals(valorEsperado, valorObtenido);
    }

    @Test
    void dividir() {
        Calculadora calc = new Calculadora(50, 2);
        int valorEsperado = 25;
        int valorObtenido = calc.dividir();
        assertEquals(valorEsperado, valorObtenido);
    }
}