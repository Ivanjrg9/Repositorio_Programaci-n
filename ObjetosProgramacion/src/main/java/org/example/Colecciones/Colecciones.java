package org.example.Colecciones;

import java.util.ArrayList;
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




    }
}
