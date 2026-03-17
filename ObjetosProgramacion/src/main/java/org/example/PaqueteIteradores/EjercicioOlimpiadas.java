package org.example.PaqueteIteradores;

import java.awt.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class EjercicioOlimpiadas {
  static Scanner teclado = new Scanner(System.in);

    static void main() {
        String palabra = teclado.next();

        ArrayList<Character>listacaracteres = new ArrayList<>();
        ListIterator<Character>it= listacaracteres.listIterator();

        for (Character caracter:palabra.toCharArray()){
            switch (caracter){
                case '<':
                    if (it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case '>':
                    if (it.hasNext()){
                        it.next();
                    }
                    break;
                case '#':
                    if (it.hasPrevious()){
                        it.previous();
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
    }
}
