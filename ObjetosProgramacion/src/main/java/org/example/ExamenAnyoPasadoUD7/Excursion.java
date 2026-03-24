package org.example.ExamenAnyoPasadoUD7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Excursion {
    private String nombre_actividad;
    private String localidad;
    private double precio;

    private List<String>profesores;
    private List<Estudiante>listaAsistentes;

    public Excursion(String nombre_actividad, String localidad, double precio) {
        this.nombre_actividad = nombre_actividad;
        this.localidad = localidad;
        this.precio = precio;
        this.profesores = new ArrayList<>();
        this.listaAsistentes = new ArrayList<>();
    }

    public void insertarProfesor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del profesor/a para la excursión en " + this.localidad);
        String nombre = teclado.nextLine();
        this.profesores.add(nombre);
        System.out.println("Profesor añadido correctamente a la excursión " + this.nombre_actividad);
    }

    public void inscribirAsistente() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Creando estudiante...");
        System.out.print("Inserta los apellidos: ");
        String ape = teclado.nextLine();
        System.out.print("Inserta el nombre: ");
        String nom = teclado.nextLine();
        System.out.print("Inserta el curso: ");
        String cur = teclado.nextLine();
        System.out.print("Inserta su edad: ");
        int ed = teclado.nextInt();

        Estudiante nuevo = new Estudiante(nom, ape, cur, ed);

        // Control de duplicados
        if (this.listaAsistentes.contains(nuevo)) {
            System.out.println("El estudiante ya existe en la lista...");
        } else {
            this.listaAsistentes.add(nuevo);
            System.out.println("Añadido correctamente...");
        }
    }

    public double calcularImporteIngreso(){
        return this.listaAsistentes.size() * this.precio;
    }

    public void verAsistentes(){
        System.out.println("Lista de inscritos para la actividad " + nombre_actividad + ":");
        listaAsistentes.sort(Comparator.comparing(Estudiante::getCurso).thenComparing(Estudiante::getApellidos));
        for (Estudiante estudiante: listaAsistentes){
            System.out.println(estudiante.getApellidos() + " ," + estudiante.getNombre() + " ( " + estudiante.getEdad() + " años)" + estudiante.getCurso());
        }
    }

    public void eliminarPorEdad(int edadMinima){
        listaAsistentes.removeIf(estudiante -> estudiante.getEdad() < edadMinima);
    }

    public String getNombre_actividad() {
        return this.nombre_actividad;
    }

    public void setNombre_actividad(String nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<String> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<String> profesores) {
        this.profesores = profesores;
    }

    public List<Estudiante> getListaAsistentes() {
        return listaAsistentes;
    }

    public void setListaAsistentes(List<Estudiante> listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }
}
