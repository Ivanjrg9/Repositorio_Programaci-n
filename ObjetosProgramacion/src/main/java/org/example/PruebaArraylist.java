package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class PruebaArraylist {
    static void main() {

        ArrayList<String> listapartescoche = new ArrayList<>();

        listapartescoche.add("puerta");
        listapartescoche.add("polea");
        listapartescoche.add("piston");
        listapartescoche.add("alternador");

        System.out.println("Elementos insertados " + listapartescoche.size());

        listapartescoche.add(3,"tubo escape");

        System.out.println(listapartescoche);

        listapartescoche.remove("puerta");

        System.out.println(listapartescoche);

        listapartescoche.remove(1);

        System.out.println("Posicion del alternador en la lista " + listapartescoche.indexOf("alternador"));
        System.out.println("Posicion de la puerta en la lista " + listapartescoche.indexOf("puerta"));

        System.out.println("Enla posicion 2 esta " + listapartescoche.get(2));

        for (String parte : listapartescoche){
            System.out.println("Parte: " + parte);
        }

        for (int i = 0; i < listapartescoche.size(); i++) {
            System.out.println("Parte " + i + " : " + listapartescoche.get(i));

        }

        listapartescoche.set(0, "carter");

        System.out.println(listapartescoche);

        Object no_clonar = listapartescoche.clone();

        ArrayList<String>copia= new ArrayList<>(listapartescoche);

        System.out.println("La lista contiene puerta? " + listapartescoche.contains("puerta"));
        System.out.println("La lista contiene alternador? " + listapartescoche.contains("alternador"));

        System.out.println("Esta vacia? " + listapartescoche.isEmpty());

        listapartescoche.addAll(Arrays.asList("rueda", "freno", "radiador"));

        System.out.println(listapartescoche);

        listapartescoche.clear();



    }



}
