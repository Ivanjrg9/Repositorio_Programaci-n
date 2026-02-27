package org.example.ModeloExamenPasado;

import java.util.ArrayList;

public class Artista extends MutxaAwards implements AccionesAsistentes{
    private String nombre;
    private ArrayList<Premio>listadepremios;
    private ArrayList<Categoria>listacategorias;

    public Artista(int anyo) {
        super(anyo);
        listacategorias = new ArrayList<>();
        listadepremios = new ArrayList<>();
    }

    public void esNominado(Categoria categoria){

    }

    public void ganarPremio(Premio premio){

    }

    public void recogerPremio(Premio premio){

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

    public ArrayList<Premio> getListadepremios() {
        return listadepremios;
    }

    public void setListadepremios(ArrayList<Premio> listadepremios) {
        this.listadepremios = listadepremios;
    }

    public ArrayList<Categoria> getListacategorias() {
        return listacategorias;
    }

    public void setListacategorias(ArrayList<Categoria> listacategorias) {
        this.listacategorias = listacategorias;
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
