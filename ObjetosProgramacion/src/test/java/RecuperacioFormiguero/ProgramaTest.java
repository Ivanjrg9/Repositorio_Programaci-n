package RecuperacioFormiguero;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaTest {

    private Cadena cadena;
    private Programa programa;
    private Programa otraPrograma;

    private void simularEntrada(int anyo, int mes, int dia) {
        String input = anyo + "\n" + mes + "\n" + dia + "\n";
        InputStream fakeIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(fakeIn);
    }

    @BeforeEach
    void setUp() {
        cadena = new Cadena("Antena 3");
        programa = new Programa("El Hormiguero", cadena, "Director1");
        otraPrograma = new Programa("La Rebelión", new Cadena("La Sexta"), "DirectorR");

        simularEntrada(2024, 3, 10);
        programa.insertarInvitado("Aitana", "cantante", 1);

        simularEntrada(2025, 6, 5);
        programa.insertarInvitado("Aitana", "cantante", 2);

        simularEntrada(2024, 9, 1);
        programa.insertarInvitado("Rosalía", "cantante", 1);

        simularEntrada(2023, 1, 15);
        otraPrograma.insertarInvitado("Aitana", "cantante", 1);
    }

    @Test
    void cadena_seRegistraElPrograma() {
        assertTrue(cadena.getListaProgramas().contains(programa));
    }

    @Test
    void cadena_eliminarPrograma() {
        cadena.eliminarPrograma(programa);
        assertFalse(cadena.getListaProgramas().contains(programa));
    }

    @Test
    void empleado_cargoInvalidoAsignaPte() {
        Empleado emp = new Empleado("Test", "jefe_inventado", null);
        assertEquals("pte", emp.getCargo());
    }

    @Test
    void empleado_directorTieneDirectorNulo() {
        Empleado emp = new Empleado("Dir", "director", null);
        assertNull(emp.getDirector());
    }

    @Test
    void empleado_idAutogenerado() {
        Empleado e1 = new Empleado("A", "técnico", null);
        Empleado e2 = new Empleado("B", "técnico", null);
        assertNotEquals(e1.getId(), e2.getId());
    }

    @Test
    void vecesInvitado_cuentaCorrectamente() {
        assertEquals(2, programa.vecesInvitado("Aitana"));
    }

    @Test
    void vecesInvitado_invitadoNoExiste() {
        assertEquals(0, programa.vecesInvitado("Shakira"));
    }

    @Test
    void vecesInvitado_insensibleMayusculas() {
        assertEquals(2, programa.vecesInvitado("aitana"));
    }

    @Test
    void buscarInvitado_encuentraInvitado() {
        assertTrue(programa.buscarInvitado("Rosalía"));
    }

    @Test
    void buscarInvitado_noEncuentraInvitado() {
        assertFalse(programa.buscarInvitado("Shakira"));
    }

    @Test
    void programa_directorSeAnyadeAListaEmpleados() {
        assertEquals("Director1", programa.getDirector().getNombre());
        assertTrue(programa.getListaEmpleados().contains(programa.getDirector()));
    }

    @Test
    void programa_insertarEmpleadoCargoPresentador() {
        programa.insertarEmpleado("Pablo Motos", "presentador", null);
        assertEquals(2, programa.getListaEmpleados().size());
        assertEquals("presentador", programa.getListaEmpleados().get(1).getCargo());
    }

    @Test
    void setCadena_actualizaRelacionBidireccional() {
        Cadena nuevaCadena = new Cadena("Telecinco");
        programa.setCadena(nuevaCadena);
        assertFalse(cadena.getListaProgramas().contains(programa));
        assertTrue(nuevaCadena.getListaProgramas().contains(programa));
        assertEquals(nuevaCadena, programa.getCadena());
    }

    @Test
    void invitado_fechaVisitaCorrecta() {
        Invitado inv = programa.getListaInvitados().get(0);
        assertEquals(LocalDate.of(2024, 3, 10), inv.getFecha_visita());
    }
}
