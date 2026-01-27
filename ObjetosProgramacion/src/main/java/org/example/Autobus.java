package org.example;

import java.util.ArrayList;

public class Autobus {

    private String matricula;
    private String destino;
    private ArrayList<Abuelo>listaAbuelo;

    public Autobus(String s, String mallorca){
        this.matricula= matricula;
        this.destino= destino;
        listaAbuelo = new ArrayList<>();

    }

    public void insertarabuelo(Abuelo abuelo){
        listaAbuelo.add(abuelo);

    }

    public void borrarabuelo(Abuelo abuelo){
        listaAbuelo.remove(abuelo);

    }

    public  void mostrarPasajeros(){
        System.out.println("Listade pasajeros: ");

        for (Abuelo abuelo : listaAbuelo){
            System.out.println("-" + abuelo.getNombre());
        }
    }

    public void mostrarMayores(int edad){
        for (Abuelo abuelo:listaAbuelo){
            if (abuelo.getEdad() >= edad){
                System.out.println("- " + abuelo.getNombre());
            }
        }
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<Abuelo> getListaAbuelo() {
        return listaAbuelo;
    }

    public void setListaAbuelo(ArrayList<Abuelo> listaAbuelo) {
        this.listaAbuelo = listaAbuelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return "Autobus{" +
                "matricula='" + matricula + '\'' +
                ", destino='" + destino + '\'' +
                ", listaAbuelo=" + listaAbuelo +
                '}';
    }


}
