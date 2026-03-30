package org.example.RecuperacionFormiguero;

public class Empleado {
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;
    private static int contador = 0;

    public Empleado(String id, String nombre, String cargo) {
        this.id = generarId();
        this.nombre = nombre;
        this.cargo = cargo;
        this.director = director;
    }

    public String generarId(){
        return String.format("Empleado: " + contador++);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }
}
