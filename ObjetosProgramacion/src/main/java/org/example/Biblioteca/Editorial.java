package org.example.Biblioteca;

import java.util.ArrayList;

public class Editorial {
    private String pais;
    private String nombre;
    private ArrayList<Libros>listadelibros;


    public Editorial(String nombre,String pais){
        this.nombre=nombre;
        this.pais=pais;
        this.listadelibros=new ArrayList<>();
    }

    public void anyadirlibro(Libros libros){
        listadelibros.add(libros);
    }

    public void borrarlibro(Libros libros){
        listadelibros.remove(libros);
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
    public ArrayList<Libros> getListadelibros() {
        return listadelibros;
    }

    public void setListadelibros(ArrayList<Libros> listadelibros) {
        this.listadelibros = listadelibros;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                "libros " + listadelibros +
                '}';
    }


}
