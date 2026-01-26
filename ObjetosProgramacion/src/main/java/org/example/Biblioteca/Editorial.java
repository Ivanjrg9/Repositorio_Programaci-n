package org.example.Biblioteca;

public class Editorial {
    private String pais;
    private String nombre;


    public Editorial(String nombre,String pais){
        this.nombre=nombre;
        this.pais=pais;

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }


}
