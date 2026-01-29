package org.example.Chalet;

public class Habitacion {
    private double metroscuadrados;
    private String nombre;


    public Habitacion(String nombre, double metroscuadrados){
        this.nombre=nombre;
        this.metroscuadrados=metroscuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetroscuadrados() {
        return metroscuadrados;
    }

    public void setMetroscuadrados(double metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }



    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metroscuadrados=" + metroscuadrados +
                '}';
    }


}
