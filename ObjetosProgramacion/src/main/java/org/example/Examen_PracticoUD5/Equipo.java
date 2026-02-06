package org.example.Examen_PracticoUD5;

import java.util.ArrayList;

public class Equipo {
    private String pais;
    private ArrayList<Deportista>listadeportistas;

    public Equipo(String pais, ArrayList<Deportista>listadeportistas){
        this.pais=pais;
        this.listadeportistas= new ArrayList<>();

    }

    public Equipo(String pais){

    }

    public void crearDeportista(Deportista deportista){
        listadeportistas.add(deportista);
    }

    public ArrayList<Deportista> getListadeportistas() {
        return listadeportistas;
    }

    public void setListadeportistas(ArrayList<Deportista> listadeportistas) {
        this.listadeportistas = listadeportistas;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ", listadeportistas=" + listadeportistas +
                '}';
    }

}
