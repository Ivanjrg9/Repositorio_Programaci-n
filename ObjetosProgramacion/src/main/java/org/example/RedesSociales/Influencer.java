package org.example.RedesSociales;

import java.util.ArrayList;

public class Influencer extends Usuario {
    private ArrayList<String>colaboraciones;

    public Influencer(String nombre, int edad, int seguidores, String nombreUsuario) {
        super(nombre, edad, seguidores, nombreUsuario);
        colaboraciones=new ArrayList<>();
    }

    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(ArrayList<String> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    @Override
    public String toString() {
        return "Influencer{" +
                "colaboraciones=" + colaboraciones +
                '}';
    }

}
