package org.example.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una frase");
        String frase = teclado.nextLine().toLowerCase();

        Map<String,Integer>mapita = new HashMap<>();

        for (String palabra : frase.split(" ")){

            if (mapita.containsKey(palabra)){
                mapita.put(palabra,mapita.get(palabra)+1);

            }else {
                mapita.put(palabra,1);
            }
        }

        for (Map.Entry<String,Integer>mapita2 : mapita.entrySet()){
            System.out.println(mapita2.getKey() + " : " + mapita2.getValue());
        }
    }
}
