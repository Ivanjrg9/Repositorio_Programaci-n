package org.example.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {

    static HashMap<String,Double>mapa = new HashMap<>();

    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        while (true){
            System.out.println("Elige una opcion [insertar, actualizar,consultar, ver todas, salir]:");
            String opcion = teclado.next().toLowerCase();
            teclado.nextLine();

            switch (opcion){
                case "insertar":
                    insertar();
                    break;
                case "actualizar":
                    actualizar();
                    break;
                case "consultar":
                    consultar();
                    break;
                case "ver todas":
                    verTaodas();
                    break;
                case "salir":
                    return;
                default:
                    System.out.println("Elige una opcion correcta porfavor...");
                    break;
            }

            for(Map.Entry<String,Double>mapita:mapa.entrySet() ){
                System.out.println("Ciudad: " + mapita.getKey() + " Temperatura: " + mapita.getValue() + "º");
            }
        }
    }

    public static void insertar(){
        Scanner tclado = new Scanner(System.in);
        System.out.println("Introduce los nuevos datos. [Ciudad-Temperatura]");
        String datos[] = tclado.nextLine().split("/");

        mapa.put(datos[0],Double.valueOf(datos[1]));


    }

    public static void actualizar(){
        Scanner tclado = new Scanner(System.in);
        System.out.println("Introduce la ciudad que quieres actualizar:");
        String ciudad = tclado.next();
        if (mapa.containsKey(ciudad)){
            System.out.println("introduce la nueva tempreatura:");
            Double temp = tclado.nextDouble();
            mapa.put(ciudad,temp);
        }else {
            System.out.println("La ciudad no existe...");
        }

    }

    public static void consultar(){
        Scanner tclado = new Scanner(System.in);

        System.out.println("Que ciudad quieres consultar?");
        String consultar = tclado.next();

        if (mapa.containsKey(consultar)){
            System.out.println("la ciudad que has seleccionado tiene ahora mismo " + mapa.get(consultar) + "º");
        }else {
            System.out.println("la ciudad que quieres consultar no existe...");
        }

    }

    public static void verTaodas(){
        for(Map.Entry<String,Double>mapita:mapa.entrySet() ){
            System.out.println("Ciudad: " + mapita.getKey() + " Temperatura: " + mapita.getValue() + "º");
        }
    }





    }
