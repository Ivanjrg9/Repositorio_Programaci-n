package org.example.ModeloExamenPasado;

public class Presentador extends MutxaAwards implements AccionesAsistentes{
    private String nombre;

    public Presentador(int anyo,String nombre) {
        super(anyo);
        this.nombre=nombre;
    }

    public void presentar(){

    }

    public void entregarPremio(Premio premio){

    }

    @Override
    public void obtenerDetalles() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void aplaudir() {

    }

    @Override
    public void alfombraRoja() {

    }

    @Override
    public void darDiscurso(String tematica) {

    }

    @Override
    public void celebrarPremio(Premio premio) {

    }
}
