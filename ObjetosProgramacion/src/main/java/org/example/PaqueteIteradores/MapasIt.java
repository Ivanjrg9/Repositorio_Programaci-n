package org.example.PaqueteIteradores;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapasIt {

    static void main() {
        HashMap<String,Integer>goleadores = new HashMap<>();

        goleadores.put("Ronaldo Nazario",9);
        goleadores.put("Messi",34);
        goleadores.put("Manolo",234);


        Iterator<Map.Entry<String,Integer>>iteratormapita =goleadores.entrySet().iterator();//lo que va en el foreach siempre

        while (iteratormapita.hasNext()){

            Map.Entry<String,Integer> goleadorGol = iteratormapita.next();
            System.out.println(goleadorGol.getKey() + " ha marcado " + goleadorGol.getValue() + " goles.");

            if (goleadorGol.getValue()<100){
                iteratormapita.remove();
            }
        }
        System.out.println(goleadores.entrySet());



    }
}
