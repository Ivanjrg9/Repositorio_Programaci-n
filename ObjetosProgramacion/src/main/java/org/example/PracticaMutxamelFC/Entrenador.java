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
        System.out.println("Entrenador " + getNombre() + " planificando entrenamiento...");
    }

    public void hacerCambios(){
        System.out.println("Entrenador " + getNombre() + " haciendo cambios...");
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
        validarFormacion();
    }

    public void validarFormacion(){
        if (!formacionPreferida.matches("\\d-\\d-\\d")){
            throw new FormacionCorrectaException();
        }
    }


    @Override
    public void concentrarse() {
        System.out.println("Entrenador " + getNombre() + " dando la charla de concentracion");

    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Entrenador viajando a " + ciudad);

    }

    @Override
    public void celebrarGol() {
        System.out.println("Entrenador " + getNombre() + " celebrando el gol");

    }

    @Override
    public void entrenar() {
        System.out.println("Entrenador " + getNombre() + " realizando el entrenamiento");

    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Entrenador enfrentandose a " + rival);

    }
}
