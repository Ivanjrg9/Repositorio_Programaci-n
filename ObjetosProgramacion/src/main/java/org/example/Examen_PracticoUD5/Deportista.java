package org.example.Examen_PracticoUD5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Deportista {
    private String nombre;
    private LocalDate fecha_visita;
    private int medallas;
    private Equipo equipo;
    private ArrayList<String>listamodalidades;
    private ArrayList<Deportista>listadeportistas;


    public Deportista(String nombre, LocalDate fecha_visita, int medallas){
        this.nombre=nombre;
        this.medallas=medallas;
        listamodalidades=new ArrayList<>();
        fechaNacimiento();
    }

    public Deportista(String medallas, LocalDate equipo){
        this.medallas=0;

    }

    private void fechaNacimiento() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año de nacimiento de " + nombre + ":");
        int anyo = teclado.nextInt();
        System.out.println("Introduce el mes:");
        int mes = teclado.nextInt();
        System.out.println("Introduce el día:");
        int dia = teclado.nextInt();
        this.fecha_visita = LocalDate.of(anyo, mes, dia);
    }

    public void inscribirse(){
        listamodalidades.add(getNombre());
    }

    public void verModalidades(ArrayList<String>listamodalidades){
        System.out.println("Modalidades " + listamodalidades);

    }

    public void medallasTotales(int medallas){
        System.out.println("Medallas totales " + medallas);

    }

    public void verMedallasdeportista(Deportista deportista){


    }

    public ArrayList<Deportista> getListadeportistas() {
        return listadeportistas;
    }

    public void setListadeportistas(ArrayList<Deportista> listadeportistas) {
        this.listadeportistas = listadeportistas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListamodalidades() {
        return listamodalidades;
    }

    public void setListamodalidades(ArrayList<String> listamodalidades) {
        this.listamodalidades = listamodalidades;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }


    @Override
    public String toString() {
        return "Deportistas{" +
                "nombre='" + nombre + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", medallas=" + medallas +
                ", equipo=" + equipo +
                ", listamodalidades=" + listamodalidades +
                '}';
    }
}
