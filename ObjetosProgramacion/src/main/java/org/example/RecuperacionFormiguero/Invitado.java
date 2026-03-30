package org.example.RecuperacionFormiguero;

import java.time.LocalDateTime;

public class Invitado {
    private String nombre;
    private String profesion;
    private LocalDateTime fechaVisita;
    private int temporada;

    public Invitado(String nombre, String profesion, LocalDateTime fechaVisita, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fechaVisita = fechaVisita;
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDateTime getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDateTime fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}
