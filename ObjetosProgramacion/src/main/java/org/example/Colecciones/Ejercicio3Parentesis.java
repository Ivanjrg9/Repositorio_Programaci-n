package org.example.Colecciones;

import java.util.Stack;

public class Ejercicio3Parentesis {

    static void main() {

        String expresion = "((2+3)*(5-1)";

        if (esBalanceado(expresion)){
            System.out.println("Bien");
        }else {
            System.out.println("Mal");
        }


    }

    public static boolean esBalanceado(String expresion){
        Stack<Character>pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            if (expresion.charAt(i)== '('){
                pila.push(expresion.charAt(i));
            }else if (expresion.charAt(i)== ')'){
                if (pila.contains('(')){
                    pila.pop();
                }else {
                    return false;
                }
            }
        }
        if (pila.isEmpty()){
            return true;

        }else {
            return false;
        }
    }
}
