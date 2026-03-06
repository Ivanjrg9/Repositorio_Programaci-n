package org.example.Colecciones;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio2Colas {
    static void main() {

        Queue<String>colaImpresion = new LinkedList<>();

        colaImpresion.offer("Imprimir documento 1");
        colaImpresion.offer("Imprimir documento 2");
        colaImpresion.offer("Imprimir documento 3");
        colaImpresion.offer("Imprimir documento 4");
        colaImpresion.offer("Imprimir documento 5");

        System.out.println("Estado inicial de la cola de impresion: " + colaImpresion);

        while (!colaImpresion.isEmpty()){
            System.out.println("Procesando: " + colaImpresion.poll());
            System.out.println("Estado de la cola despues de procesar el trabajo: " + colaImpresion);

        }
    }
}
