package org.example.PaqueteIteradores;

import java.util.ArrayList;
import java.util.ListIterator;

public class TecladorotoOlimpiadas {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            String palabra = in.next();

            ArrayList<Character> listacaracteres = new ArrayList<>();
            ListIterator<Character> it= listacaracteres.listIterator();

            for (Character caracter:palabra.toCharArray()){
                switch (caracter){
                    case '-':
                        if (it.hasPrevious()){
                            it.previous();
                        }
                        break;
                    case '+':
                        if (it.hasNext()){
                            it.next();
                        }
                        break;
                    case '3':
                        if (it.hasNext()){
                            it.next();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(caracter);
                }
            }

            for (Character caracter : listacaracteres){
                System.out.print(caracter);
            }
            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {

        }
    }
}
