package org.example.Colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Colecciones {
    static void main() {

        ArrayList<String>coches = new ArrayList<>();
        Stack<String>pila = new Stack<>();

        pila.push("Caniche");
        pila.push("Husky");
        pila.push("labrador");
        pila.pop();
        System.out.println(pila.peek());

        Stack<Character>lista = new Stack<>();

        lista.peek();
        lista.pop();

        lista.push('A');
        lista.push('B');
        lista.push('C');
        lista.push('D');
        lista.push('E');

        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        System.out.println(lista.peek());

        for (int i = 0; i < lista.size(); i++) {
            lista.pop();
        }

        for (Character caracter : lista){
            lista.pop();
        }

        System.out.println(lista.size());










    }
}
