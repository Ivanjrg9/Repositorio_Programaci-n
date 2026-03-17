package org.example.comparadorer;

import java.util.Comparator;
import java.util.Objects;

public class Portatil implements Comparator<Portatil> {
    private String nombre;
    private int ram;
    private int peso;

    public Portatil(String nombre, int ram, int peso) {
        this.nombre = nombre;
        this.ram = ram;
        this.peso = peso;
    }


    @Override
    public int compare(Portatil portatil1, Portatil portatil2) {
        int comparar = portatil1.getRam();
        return comparar;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Portatil portatil = (Portatil) o;
        return ram == portatil.ram && peso == portatil.peso && Objects.equals(nombre, portatil.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ram, peso);
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
