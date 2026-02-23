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

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrarGol() {

    }
}
