package org.example.Biblioteca;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prestamo {

    private  Libros libros;
    private Estudiante estudiante;
    private LocalDateTime fecha;

    public Prestamo(Estudiante estudiante, Libros libros){
        fecha=LocalDateTime.now();
        this.estudiante=estudiante;
        this.libros=libros;

    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }



    @Override
    public String toString() {
        return "Prestamo{" +
                "estudiante=" + estudiante +
                ", libros=" + libros +
                ", fecha=" + fecha +
                '}';
    }



}
