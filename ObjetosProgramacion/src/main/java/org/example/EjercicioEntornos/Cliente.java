package org.example.EjercicioEntornos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;
@Getter
@Setter
@ToString
public class Cliente {
    private int id;
    private String nombre;
    private String apellidos;
    private String email;
    private LocalDate fechaNacimiento;

    private static int generadorID=0;

    public Cliente(String nombre, String apellidos, String email, LocalDate fechaNacimiento) {
        this.id = generadorID++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }


}

