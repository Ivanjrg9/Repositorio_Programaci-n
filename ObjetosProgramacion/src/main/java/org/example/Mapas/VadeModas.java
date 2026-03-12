package org.example.Mapas;

import java.util.HashMap;
import java.util.Map;

public class VadeModas {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int numero = in.nextInt();
        if (numero == 0)
        return false;
        else {
            Map<Integer,Integer>mapa = new HashMap<>();
            for (int i = 0; i < numero; i++) {
                int num = in.nextInt();
                if (mapa.containsKey(num)){
                mapa.put(num,mapa.get(num)+1);
                }else {
                mapa.put(num,1);
                }
            }
            int max = 0;
            int clave = 0;

            for (Map.Entry<Integer,Integer>mapita : mapa.entrySet()){
                if (mapita.getValue()>max){
                    max = mapita.getValue();
                    clave = mapita.getKey();
                }
            }
            System.out.println(clave);

            return true;
        }
    }
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
