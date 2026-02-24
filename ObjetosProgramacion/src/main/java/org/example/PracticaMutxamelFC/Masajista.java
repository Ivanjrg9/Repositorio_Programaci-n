package org.example.PracticaMutxamelFC;

public class Masajista extends MutxamelFC{
    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad,String titulacion,int anyosExperiencia) {
        super(nombre, edad);
        this.anyosExperiencia=anyosExperiencia;
        this.titulacion=titulacion;
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
}
