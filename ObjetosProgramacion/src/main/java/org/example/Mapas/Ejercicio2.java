package org.example.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String frase = teclado.next().toLowerCase();

        Map<Character,Integer> mapita = new HashMap<>();

        for (Character palabra : frase.toCharArray()){

//            if (mapita.containsKey(palabra)){
//                mapita.put(palabra,mapita.get(palabra)+1);
//
//            }else {
//                mapita.put(palabra,1);
//            }

            mapita.put(palabra, mapita.getOrDefault(palabra,0)+1);
        }

        for (Map.Entry<Character,Integer>mapita2 : mapita.entrySet()){
            System.out.println(mapita2.getKey() + " : " + mapita2.getValue());
        }
    }
}
