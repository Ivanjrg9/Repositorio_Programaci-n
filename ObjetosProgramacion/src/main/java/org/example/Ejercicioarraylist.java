package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicioarraylist {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        ArrayList<String> listacompra =new ArrayList<>();
        System.out.println("La compraestavacia?? " + listacompra.isEmpty());

        listacompra.add("queso");
        System.out.println(listacompra);

        System.out.println("Esta vacia ahora?? " + listacompra.isEmpty());

        listacompra.addAll(Arrays.asList("vinagre", "fresas", "manzana", "pollo"));

        System.out.println(listacompra);

        System.out.println("En latercera posicion esta " + listacompra.get(2));

        listacompra.set(1, "arroz");

        System.out.println(listacompra);

        System.out.println("Esta la leche en la lista?? " + listacompra.contains("Leche"));

        System.out.println("Quieres añadir un nuevo elemento??");
        String alimento = teclado.next();

        if (listacompra.contains(alimento)){
            System.out.println("ya esta en la lista");

        }else {
            listacompra.add(alimento);

        }

        System.out.println("El tamaño de la lista es: " + listacompra.size());

        ArrayList<String>copialistacompra = new ArrayList<>(listacompra);

        copialistacompra.clear();

        System.out.println("La copia esta vacia?? " + copialistacompra.isEmpty());


        System.out.println("Son iguales??");
        if (listacompra.equals(copialistacompra)){
            System.out.println("Son iguales ");
        }else {
            System.out.println("No son iguales ");
        }

        copialistacompra.addAll(Arrays.asList("almendras", "esparragos"));

        ArrayList<String> faltantes = new ArrayList<>(listacompra);
        faltantes.removeAll(copialistacompra);

        System.out.println(listacompra);
        System.out.println(copialistacompra);

        ArrayList<Integer>copiaoriginal = new ArrayList<>();

        for (int i = 0; i < listacompra.size(); i++) {

        }
        System.out.println(listacompra);
        System.out.println(copialistacompra);




        //listacompra.clone();
        listacompra.clear();


    }
}
