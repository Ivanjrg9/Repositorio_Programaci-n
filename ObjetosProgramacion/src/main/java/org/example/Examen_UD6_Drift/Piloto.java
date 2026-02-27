package org.example.Examen_UD6_Drift;

public class Piloto extends Participante{
    private String marca;
    private EstadoCoche estadoCoche;
    private int puntuacion;

    public Piloto(String nombre, String pais,String marca,EstadoCoche estadoCoche,int puntuacion) {
        super(nombre, pais);
        this.marca = marca;
        this.estadoCoche = estadoCoche;
        this.puntuacion = puntuacion;
    }


    public void inscribirse(CategoriaDrift pro){

    }

    public void pagarInscripcion(Inscripcion inscripcion){
        System.out.println("El piloto " + getNombre() + " ha pagado la inscripcion");

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public EstadoCoche getEstadoCoche() {
        return estadoCoche;
    }

    public void setEstadoCoche(EstadoCoche estadoCoche) {
        this.estadoCoche = estadoCoche;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
