package org.example.PracticaHormiguero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvitadoTest {

    @Test
    void comprobarCargos() {
        // Si meto un cargo raro, debe salir "pte"
        Empleado e = new Empleado("Juan", "limpiador", null);
        assertTrue(e.toString().contains("pte"));
    }

    @Test
    void comprobarIds() {
        // Los IDs no pueden ser iguales
        Empleado e1 = new Empleado("Emp1", "técnico", null);
        Empleado e2 = new Empleado("Emp2", "técnico", null);
        assertNotEquals(e1.toString(), e2.toString());
    }
}