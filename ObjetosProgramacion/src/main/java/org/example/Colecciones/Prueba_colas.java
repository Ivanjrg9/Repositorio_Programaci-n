package org.example.Colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Prueba_colas {
    static void main() {

        Deque<String> cola = new LinkedList<>();

        cola.poll();
        cola.offer("Manolito");
        cola.offer("Pocoyo");
        cola.offer("Bart Simpson");
        cola.offer("Stewie");
        cola.poll();//manolo fuera
        System.out.println(cola.peek());
        cola.offerFirst("Kevin MC calister");
        System.out.println(cola.peek());
        cola.pollLast();
        System.out.println(cola.peekLast());

        LinkedBlockingQueue<String>colalimitada = new LinkedBlockingQueue<>(3);

        colalimitada.offer("MANOLITO");
        colalimitada.offer("JUANITO");
        colalimitada.offer("JAIMITO");
        colalimitada.offer("JOSELITO");//este no entraria por el limite de 3

        System.out.println(colalimitada);



    }
}
