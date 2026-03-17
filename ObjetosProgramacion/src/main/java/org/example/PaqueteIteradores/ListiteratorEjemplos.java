package org.example.PaqueteIteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;

public class ListiteratorEjemplos {
    static void main() {
        ArrayList<String>listaalumnos = new ArrayList<>(Arrays.asList("Juan","manolo","Jose","Paula"));

        ListIterator<String>it = listaalumnos.listIterator();

        while (it.hasNext()){
            System.out.println(it.nextIndex());
            String nombre = it.next();
            System.out.println(it.nextIndex());
            System.out.println(nombre);

        }
        System.out.println("---------------------");
        while(it.hasPrevious()){

            System.out.println(it.previousIndex());
            String nombre = it.previous();
            System.out.println(it.previousIndex());
            System.out.println(nombre);

            if (nombre.equals("manolo")){
                it.add("Patri");
            }

        }



    }
}
