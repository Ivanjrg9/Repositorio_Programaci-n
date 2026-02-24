package org.example.PracticaMutxamelFC;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements AccionesDeportivas{
    private int dorsal;
    private Posiciones posicion;
    private Equipos categoria;


    public Jugador(String nombre, int edad,Posiciones posicion,Equipos categoria,int dorsal,ArrayList<Jugador>listajugadores) {
        super(nombre, edad);
        this.categoria=categoria;
        setDorsal(dorsal, listajugadores);
    }

    public void calentar(){
        System.out.println("Jugador " + getNombre() + " calentando");
    }

    public void descansar(){
        System.out.println("Jugador " + getNombre() +" descansando");
    }

    public void marcarGol(){
        System.out.println("GOOOOOOOOOOOOL!!!");
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal, ArrayList<Jugador>listajugadores) {
        for (Jugador jugador : listajugadores){
            if (dorsal == jugador.getDorsal() && jugador.getCategoria().equals(categoria)){
                throw new DorsalDuplicadoException();
            }
        }
        this.dorsal=dorsal;
        listajugadores.add(this);
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }


    @Override
    public void concentrarse() {
        System.out.println("Jugador " + getNombre() + " concentrandose para el partido");

    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Jugador " + getNombre() + " viajando a " + ciudad);

    }

    @Override
    public void celebrarGol() {
        System.out.println("Jugador " + getNombre() + " corriendo al corner gritando gooool!!");

    }

    @Override
    public void entrenar() {
        System.out.println("Jugador " + getNombre() + " esta entrenado");

    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Jugador enfrentandose a " + rival);

    }
}
