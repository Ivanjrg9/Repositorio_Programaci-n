package org.example.PracticaHormiguero;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Representa a un invitado que asiste a un programa de televisión.
 * Gestiona la información personal, profesional y la fecha de su visita.
 */
@Getter
@Setter
@ToString
public class Invitado {
    private String nombre;
    private String profesion;
    private int temporada;
    private LocalDate fecha_visita;

    /**
     * Constructor para crear un Invitado. Solicita la fecha de visita por consola.
     * @param nombre Nombre del invitado.
     * @param profesion Profesión o actividad principal.
     * @param temporada Número de temporada en la que participa.
     */
    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        solicitarFecha();
    }
    /**
     * Pide al usuario el año, mes y día para establecer la fecha de visita.
     */
    private void solicitarFecha() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año de visita para " + nombre + ":");
        int anyo = teclado.nextInt();
        System.out.println("Introduce el mes:");
        int mes = teclado.nextInt();
        System.out.println("Introduce el día:");
        int dia = teclado.nextInt();
        this.fecha_visita = LocalDate.of(anyo, mes, dia);
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getTemporada() {
        return temporada;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    @Override
    public String toString() {
        return "Invitado{nombre='" + nombre + "', profesion='" + profesion +
                "', fecha_visita=" + fecha_visita + ", temporada=" + temporada + "}";
    }
}