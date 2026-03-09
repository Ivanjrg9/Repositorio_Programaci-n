package org.example.Colecciones;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CineApp {
    static Random aleatorio = new Random();
    static Queue<Espectador> cola = new LinkedList<>();


    static void main() {
        generarCola();

        System.out.println(cola);

        double recaudacion = 0;

        while (!cola.isEmpty()){
            if (cola.peek().getEdad()>=18){
                recaudacion+=3.5;
            } else if (cola.peek().getEdad()>=11) {
                recaudacion+=2.5;
            }else {
                recaudacion+=1;
            }
            cola.poll();
        }

        System.out.println("La recuadacion ha sido de " + recaudacion + " €");


    }
    public static void generarCola(){
        int numPersonas = aleatorio.nextInt(251);

        for (int i = 0; i < numPersonas; i++) {
            cola.offer(new Espectador(aleatorio.nextInt(97)+3));
        }




    }
}
