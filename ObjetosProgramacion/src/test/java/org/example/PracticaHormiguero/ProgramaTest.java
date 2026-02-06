package org.example.PracticaHormiguero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProgramaTest {

    @Test
    void testDirectorAutomatico() {

        Cadena c = new Cadena("Antena 3");
        Programa p = new Programa("El Hormiguero", c, "Pablo Motos");
        assertFalse(p.getListaEmpleados().isEmpty());
        assertTrue(p.getListaEmpleados().get(0).toString().contains("director"));
    }

    @Test
    void testAñadirInvitado() {

        Cadena c = new Cadena("Telecinco");
        Programa p = new Programa("La Rebelión", c, "Director X");

        p.insertarInvitado("Prueba", "Test", 1);
        assertEquals(1, p.getListaInvitados().size());
    }

    @Test
    void testRastrearInvitado() {

        Cadena c = new Cadena("Antena 3");
        Programa p = new Programa("Hormiguero", c, "Motos");

        p.insertarInvitado("Aitana", "Cantante", 1);

        assertTrue(p.rastrearInvitado("Aitana"));
        assertFalse(p.rastrearInvitado("Messi"));
    }
}