package org.example.Colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class EjercicioPalindromo {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        Deque<Character>palindromo = new LinkedList<>();

        String palabra = "mateo";

        for (int i = 0; i < palabra.length(); i++) {
            palindromo.offer(palabra.charAt(i));
        }

        while (!palindromo.isEmpty()){
            if (palindromo.peekFirst() == palindromo.peekLast()){
                palindromo.pollFirst();
                palindromo.pollLast();
            }else {
                System.out.println("No es palindormo");
                break;
            }
            System.out.println("Es palindromo");
        }











    }
}
