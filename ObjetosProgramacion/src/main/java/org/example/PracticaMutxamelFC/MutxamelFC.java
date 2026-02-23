package org.example.PracticaMutxamelFC;

public abstract class MutxamelFC implements FuncionesIntegrantes {
    private String nombre;
    private int edad;

    public MutxamelFC(String nombre,int edad){
        this.edad=edad;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "MutxamelFC{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }



}
