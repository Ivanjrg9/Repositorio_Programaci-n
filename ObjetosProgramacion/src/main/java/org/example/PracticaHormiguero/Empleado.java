package org.example.PracticaHormiguero;

import java.util.ArrayList;

public class Empleado {
    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    private static int contador=0;


    public Empleado(String nombre,String cargo,Empleado director){
        this.nombre=nombre;
        this.cargo=cargo;
        this.director=director;
    }

    private static void generarId(){


    }



}
