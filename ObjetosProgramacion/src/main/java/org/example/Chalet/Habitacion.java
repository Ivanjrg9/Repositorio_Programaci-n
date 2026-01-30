package org.example.Chalet;

import java.util.ArrayList;

public class Habitacion {
    private double metroscuadrados;
    private String nombre;





    private ArrayList<Electrodomesticos>listaelectrodomesticos;


    public Habitacion(String nombre, double metroscuadrados){
        this.nombre=nombre;
        this.metroscuadrados=metroscuadrados;
        listaelectrodomesticos=new ArrayList<>();
    }

    public void crearElectrodomestico (String nombre, double consumo){
        listaelectrodomesticos.add(new Electrodomesticos(nombre,consumo));

    }

    public void mostrarElectrodomestico(){
        for (Electrodomesticos electrodomesticos:listaelectrodomesticos){
            System.out.println("Electrodomesticos de la habitacion " + getNombre());
        }

    }

    public double calcularConsumo(double consumo){
        double consumototal = 0;
        for (Electrodomesticos electrodomesticos:listaelectrodomesticos){
            consumototal+=electrodomesticos.getConsumo();
        }

        return consumototal;
    }

    public void borrarElectrodomesticos(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetroscuadrados() {
        return metroscuadrados;
    }

    public void setMetroscuadrados(double metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }
    public ArrayList<Electrodomesticos> getListaelectrodomesticos() {
        return listaelectrodomesticos;
    }

    public void setListaelectrodomesticos(ArrayList<Electrodomesticos> listaelectrodomesticos) {
        this.listaelectrodomesticos = listaelectrodomesticos;
    }




    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metroscuadrados=" + metroscuadrados +
                '}';
    }


}
