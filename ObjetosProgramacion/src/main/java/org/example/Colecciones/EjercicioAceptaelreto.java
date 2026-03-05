package org.example.Colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class EjercicioAceptaelreto {
    public class solution {
        static java.util.Scanner in;

        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {
                ArrayList<Character>listaabiertos = new ArrayList<>(Arrays.asList('(','{','['));
                ArrayList<Character>listacerrados = new ArrayList<>(Arrays.asList(')','}',']'));
                Stack<Character>pila = new Stack<>();

                String expresion = in.nextLine();

                for (int i = 0; i < expresion.length(); i++) {
                    if (listaabiertos.contains(expresion.charAt(i))){
                        pila.push(expresion.charAt(i));
                    } else if (listacerrados.contains(expresion.charAt(i))) {
                        int pos = listacerrados.indexOf(expresion.charAt(i));
                        if (pila.contains(listaabiertos.get(pos)) && pila.peek() == listaabiertos.get(pos)){
                            pila.pop();
                        }else {
                            System.out.println("NO");
                            return true;
                        }
                    }
                }
                if (pila.isEmpty()){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
            return false;
        }
        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {


            }
        }
    }
}
