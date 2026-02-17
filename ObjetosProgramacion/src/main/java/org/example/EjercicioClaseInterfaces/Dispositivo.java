package org.example.EjercicioClaseInterfaces;

import org.example.Interface.Televisor;

public abstract class Dispositivo {
    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre){
        this.nombre=nombre;
        estado=false;
    }

    public abstract void encender();

    public void apagar(){
        if (estado){
            estado=false;
            System.out.println(nombre +" apagado.");
        }else {
            System.out.println(nombre + " ya esta apagado.");
        }
    }

    public void mostrarEstado(){
        if (estado == false){
            System.out.println(nombre + " apagado");
        }else {
            System.out.println("El dispositivo " + nombre + " ya esta apagado");
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
