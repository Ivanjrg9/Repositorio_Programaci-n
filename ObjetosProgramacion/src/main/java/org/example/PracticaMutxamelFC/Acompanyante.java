package org.example.PracticaMutxamelFC;

public class Acompanyante extends MutxamelFC{
    private Jugador integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad,Jugador integrante,String parentesco) {
        super(nombre, edad);
        this.integrante=integrante;
        this.parentesco=parentesco;
    }

    public void animarEquipo(){
        System.out.println("Vamooooos Equipoooo!!!");
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    @Override
    public void concentrarse() {
        System.out.println("Acomañante " + getNombre() + " concentrandose para el partido");

    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Acompañante viajando a " + ciudad);

    }

    @Override
    public void celebrarGol() {
        System.out.println("Acompañante " + getNombre() + " gritando gooool!!");

    }
}
