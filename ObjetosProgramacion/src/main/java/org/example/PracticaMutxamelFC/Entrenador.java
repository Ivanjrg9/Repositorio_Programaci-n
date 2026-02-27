package org.example.PracticaMutxamelFC;
/**
 * Clase que representa al Entrenador del Mutxamel FC.
 * Se encarga de la gestión táctica, planificación de entrenamientos y
 * toma de decisiones durante los partidos.
 * * @author Ivan
 * @version 1.0
 */
public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    private Equipos equipos;
    private String formacionPreferida;

    /**
     * Constructor para crear un nuevo Entrenador.
     * * @param nombre Nombre del entrenador.
     * @param edad Edad del entrenador.
     * @param equipos Equipo asignado (Enum Equipos).
     * @param formacionPreferida Formación táctica inicial.
     */
    public Entrenador(String nombre, int edad,Equipos equipos,String formacionPreferida) {
        super(nombre, edad);
        this.formacionPreferida=formacionPreferida;
        this.equipos=equipos;
    }

    /**
     * Gestiona la organización de las sesiones de entrenamiento del equipo.
     */
    public void planificarEntrenamiento(){
        System.out.println("Entrenador " + getNombre() + " planificando entrenamiento...");
    }
    /**
     * Realiza ajustes tácticos y sustituciones durante el transcurso de un partido.
     */
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
        this.formacionPreferida = formacionPreferida;
        validarFormacion();
    }
    /**
     * Valida que la formación tenga un formato táctico correcto (ej. 4-4-2).
     * Utiliza expresiones regulares para comprobar el patrón número-número-número.
     * * @throws FormacionCorrectaException Si el formato no coincide con el patrón dígito-dígito-dígito.
     */
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
