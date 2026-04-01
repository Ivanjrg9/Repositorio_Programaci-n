package RecuperacioFormiguero;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Representa un invitado que acude a un programa de televisión.
 * Su ciclo de vida está ligado al del Programa (composición).
 */
public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    /**
     * Constructor de Invitado.
     * Solicita al usuario la fecha de visita por teclado (año, mes, día).
     *
     * @param nombre    Nombre del invitado.
     * @param profesion Profesión del invitado.
     * @param temporada Temporada en la que acude.
     */
    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año en el que acudirá el invitado " + nombre + ":");
        int anyo = teclado.nextInt();
        System.out.println("Introduce el mes:");
        int mes = teclado.nextInt();
        System.out.println("Introduce el día:");
        int dia = teclado.nextInt();

        setFecha_visita(LocalDate.of(anyo, mes, dia));
    }

    /**
     * @return Nombre del invitado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return Profesión del invitado.
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @return Fecha de visita al programa.
     */
    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    /**
     * @return Temporada en la que acudió.
     */
    public int getTemporada() {
        return temporada;
    }

    /**
     * @param nombre Nuevo nombre del invitado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param profesion Nueva profesión del invitado.
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @param fecha_visita Fecha de visita al programa.
     */
    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    /**
     * @param temporada Temporada en la que acudió.
     */
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado{nombre='" + nombre + "', profesion='" + profesion
                + "', fecha_visita=" + fecha_visita + ", temporada=" + temporada + "}";
    }
}
