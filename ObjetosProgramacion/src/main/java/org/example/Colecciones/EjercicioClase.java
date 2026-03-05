package org.example.Colecciones;

import java.util.Stack;

public class EjercicioClase {
    static void main() {
        Stack<Integer>pila = new Stack<>();

        pila.push(5);
        pila.push(6);
        pila.push(7);

        for (int i = 0; i < pila.size(); i++) {
            System.out.println(pila.pop());

        }

        while(!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
}
