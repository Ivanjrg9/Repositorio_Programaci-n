package org.example.EjercicioClaseInterfaces;

import org.example.Interface.Televisor;

public abstract class Dispositivo {
    private String nombre;
    private boolean estado;

    public abstract void encender();

    public void apagar(boolean estado){
        if (estado == false){
            System.out.println(nombre + " apagado");
        }else {
            System.out.println("El dispositivo " + nombre + " ya esta apagado");
        }
    }

    public void mostrarEstado(boolean estado){
        if (estado=false){
            System.out.println("El dispositivo " + nombre + " esta apagado");
        }else {
            System.out.println("El dispositivo " + nombre + " esta encendido");
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
