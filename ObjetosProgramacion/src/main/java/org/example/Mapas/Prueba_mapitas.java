package org.example.Mapas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Prueba_mapitas {
    static void main() {

        HashMap<Integer,String> mapa = new HashMap<>();

        mapa.put(1,"España");
        mapa.put(2,"Senegal");
        mapa.put(3,"Francia");
        mapa.put(4,"Marruecos");

        System.out.println(mapa.keySet());
        System.out.println(mapa.values());

        mapa.put(4,"Israel");

        System.out.println(mapa.values());

        for (Map.Entry<Integer,String > mapita : mapa.entrySet()){
            System.out.println("*" + mapita.getKey() + " : " + mapita.getValue());

        }



    }
}
