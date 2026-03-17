package org.example.comparadorer;

import java.util.*;

public class CompararIvanApp {
    static void main() {
        List<Portatil>listaportatiles = new LinkedList<>();

        Portatil mac = new Portatil("Mac",64,1254);
        Portatil mac1 = new Portatil("Mac1",32,1234);
        Portatil mac2 = new Portatil("Mac2",16,1266);

        listaportatiles.add(mac);
        listaportatiles.add(mac1);
        listaportatiles.add(mac2);

        TreeMap<Portatil,String>mapa = new TreeMap<>(Comparator.reverseOrder());









    }
}
