package org.example.PracticaMutxamelFC;

import java.util.ArrayList;

public class Masajista extends MutxamelFC{
    private String titulacion;
    private int anyosExperiencia;
    private ArrayList<Jugador>listajugadores;

    public Masajista(String nombre, int edad, String titulacion, int anyosExperiencia, ArrayList<Jugador>listajugadores) {
        super(nombre, edad);
        this.anyosExperiencia=anyosExperiencia;
        this.titulacion=titulacion;
        this.listajugadores=listajugadores;

    }

    public void darMasaje(Jugador jugador){
        System.out.println("Dando masaje al jugador " + jugador.getNombre());
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public ArrayList<Jugador> getListajugadores() {
        return listajugadores;
    }

    public void setListajugadores(ArrayList<Jugador> listajugadores) {
        this.listajugadores = listajugadores;
    }


    @Override
    public void concentrarse() {
        System.out.println("Masajista " + getNombre() + " concentrado para el partido");

    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Masajista viajando a " + ciudad);

    }

    @Override
    public void celebrarGol() {
        System.out.println("Masajista " + getNombre() + " gritando goool!!" );

    }
    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", anyosExperiencia=" + anyosExperiencia +
                ", listajugadores=" + listajugadores + "nombre " + getNombre() +
                '}';
    }
}
