package org.example.Chalet;

import java.util.ArrayList;

public class Casa {

    private String direccion;
    private ArrayList<Habitacion>listahabitaciones;

    public void mostrarhabitaciones(){

        System.out.println("habitacionesde la casa en la direccion " + direccion);

        for (Habitacion habitacion:listahabitaciones){
            System.out.println("- " + habitacion.getNombre() + " con " + habitacion.getMetroscuadrados());
        }
    }

    public Casa(String direccion){
        this.direccion=direccion;
        listahabitaciones = new ArrayList<>();
    }

    public Habitacion gethabitacionmasgrandes(){
        Habitacion maximo = listahabitaciones.get(0);
        for (Habitacion habitacion : listahabitaciones){
            if (maximo.getMetroscuadrados()< habitacion.getMetroscuadrados()){
                maximo = habitacion;
            }
        }
        return maximo;
    }

    public ArrayList<Habitacion> getListahabitaciones() {
        return listahabitaciones;
    }

    public void setListahabitaciones(ArrayList<Habitacion> listahabitaciones) {
        this.listahabitaciones = listahabitaciones;
    }

    public void crearhabitacion(String nombre, double metroscuadrados){

        for (Habitacion habitacion : listahabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitacion" + nombre + " ya existe.");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre,metroscuadrados);
        listahabitaciones.add(habitacion);
    }

    public void borrarhabitacion(){


    }

    public String getDireccion() {

        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                '}';
    }


}
