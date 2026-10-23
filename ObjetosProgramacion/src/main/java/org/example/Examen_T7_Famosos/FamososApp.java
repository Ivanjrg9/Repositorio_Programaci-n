package org.example.Examen_T7_Famosos;

import java.util.*;

public class FamososApp {
    static LinkedList<Famoso>listafamosos = new LinkedList<>();

    static void procesarDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Procesando datos desde EntradaDeDatos...");
        EntradaDatos.generarDatos();
        Queue<Famoso> famosos = EntradaDatos.getDatosActuales();
        ArrayList<Famoso>listaFamosos = new ArrayList<>();

        while (!famosos.isEmpty()){
            Famoso famoso = famosos.poll();
            listaFamosos.add(famoso);
            System.out.println(famoso);
        }
    }

    static void nuevoFamoso(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Insertando famoso...");
        System.out.println("Nombre:");
        String nombre = teclado.next();
        System.out.println("Pais:");
        String pais = teclado.next();
        System.out.println("Profesion:");
        String profesion = teclado.next();
        System.out.println("Edad:");
        int edad = teclado.nextInt();
        listafamosos.add(new Famoso(nombre,pais,profesion,edad));
        System.out.println("Famoso insertado");
    }

    static void buscarFamoso(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Buscando famoso...");
        System.out.println("Nombre:");
        String nombre = teclado.next();
        System.out.println("Pais:");
        String pais = teclado.next();
        System.out.println("Profesion:");
        String profesion = teclado.next();
        System.out.println("Edad:");
        int edad = teclado.nextInt();

        Famoso famosobuscado = new Famoso(nombre,pais,profesion,edad);

        if (listafamosos.contains(famosobuscado)){
            System.out.println("El famoso ha estado en la isla...");
        }else {
            System.out.println("El famoso no ha estado en la isla, no esta en la lista...");
        }
    }

    static void eliminarMenores(){
        System.out.println("Eliminando menores de edad...");

        while (!listafamosos.isEmpty()){
            listafamosos.removeIf(famoso -> famoso.getEdad() < 16);
        }
        System.out.println(listafamosos);
    }

    static Estadistica generarEstadisticas(ArrayList<Famoso>listaFamosos){
        Map<Famoso,Integer>mapaEstadistica = new HashMap<>();


        return null;
    }

    static void main() {

        procesarDatos();
        nuevoFamoso();
        buscarFamoso();
        eliminarMenores();


    }
}
