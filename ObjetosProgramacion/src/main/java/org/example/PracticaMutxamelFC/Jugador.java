package org.example.PracticaMutxamelFC;

public class Jugador extends MutxamelFC implements AccionesDeportivas{
    private int dorsal;
    private Posiciones posicion;
    private Equipos categoria;

    public Jugador(String nombre, int edad,Posiciones posicion,Equipos categoria) {
        super(nombre, edad);
        this.categoria=categoria;
        this.dorsal=dorsal;
    }

    public void calentar(){
        System.out.println("Jugador calentando");
    }

    public void descansar(){
        System.out.println("Jugador descansando");
    }

    public void marcarGol(){
        System.out.println("GOOOOOOOOOOOOL!!!");
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
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

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrarGol() {

    }

    @Override
    public void entrenar() {
        
    }

    @Override
    public void jugarPartido(String rival) {

    }
}
