package org.example.Colecciones;

import java.util.*;

public class CollectionClase {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        String peces[] = {"boquerones","sardinas","anchoas","anchoas","tiburon","merluza","merluza","anguila"};

        HashSet<String>desordenada = new HashSet<>(Arrays.asList(peces));
        LinkedHashSet<String> respeta_orden = new LinkedHashSet<>(Arrays.asList(peces));
        TreeSet<String>ordenado = new TreeSet<>(Arrays.asList(peces));

        System.out.println(desordenada);
        System.out.println(respeta_orden);
        System.out.println(ordenado);
       //ejercicio 1
        System.out.println("-----------------------------------------------------");
        System.out.println("Escribe una frase: ");
        String frase = teclado.nextLine().toLowerCase();

        String frase1[] = frase.split(" ");

        HashSet<String>fraseSinDuplicados = new HashSet<>(Arrays.asList(frase1));

        System.out.println("la frase que has escrito es: " + frase);
        System.out.println("La frase sin duplicados es: " + fraseSinDuplicados);

        //ejercicio 3
        System.out.println("-----------------------------------------------------");
        LinkedHashSet<String>listaurl = new LinkedHashSet<>();
        while (true){
            System.out.println("Escribe una URL visitada (o 'Salir' para terminar):");
            String url = teclado.next().toLowerCase();
            if (url.equals("salir")){
                break;
            }
            listaurl.add(url);
        }
        System.out.println("Historial de navegacion:");
        int contador = 1;
        for (String frase2 : listaurl){
            System.out.println(contador + " " + frase2);
        }
    }
}
