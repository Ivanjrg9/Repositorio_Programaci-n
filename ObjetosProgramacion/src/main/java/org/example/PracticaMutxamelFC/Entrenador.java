package org.example.PracticaMutxamelFC;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    private Equipos equipos;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad,Equipos equipos,String formacionPreferida) {
        super(nombre, edad);
        this.formacionPreferida=formacionPreferida;
        this.equipos=equipos;
    }

    public void planificarEntrenamiento(){
        System.out.println("Entrenador planificando entrenamiento...");
    }

    public void hacerCambios(){
        System.out.println("Entrenador haciendo cambios...");
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
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
