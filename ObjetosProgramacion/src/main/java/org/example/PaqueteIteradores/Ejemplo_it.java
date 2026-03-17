package org.example.PaqueteIteradores;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ejemplo_it {
    static void main() {
        TreeSet<String> peliculas = new TreeSet<>();

        peliculas.add("Scream");
        peliculas.add("Cars");
        peliculas.add("Saw");
        peliculas.add("Toy Story");
        peliculas.add("Bolt");

        Iterator<String>it= peliculas.iterator();

        while(it.hasNext()){

            String peli = it.next();
            System.out.println(peli);

            if (peli.equals("Bolt")){
                it.remove();
            }
        }

        System.out.println(peliculas);



    }
}
