package org.example.Chalet;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    static Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion>listahabitaciones;
    private Propietario propietario;

    public void mostrarhabitaciones(){
        System.out.println("habitaciones de la casa de " + propietario + "en la direccion " + direccion);

        for (Habitacion habitacion:listahabitaciones){
            System.out.println("- " + habitacion.getNombre() + " con " + habitacion.getMetroscuadrados());
        }
    }

    public Casa(String direccion){
        this.direccion=direccion;
        listahabitaciones = new ArrayList<>();
        setPropietario();
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

    public void borrarhabitacion(String nombre){
        for (Habitacion habitacion: listahabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                listahabitaciones.remove(habitacion);
                System.out.println("Habitacion " + nombre + " borrada con éito");
                return;
            }
        }
    }

    public String getDireccion() {

        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Introduce el nombre del propietario de la casa con direccion " + direccion);
        String nombre = teclado.next();
        System.out.println("Edad:");
        int edad = teclado.nextInt();

        propietario = new Propietario(nombre,edad);
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "Propietario " + propietario +
                '}';
    }


}
