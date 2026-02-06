package org.example.PracticaHormiguero;

import java.util.Scanner;

public class AppProgramas {
    public static void main() {

        Cadena antena3 = new Cadena("Antena 3");


        Programa elHormiguero = new Programa("El Hormiguero", antena3, "Pablo Motos");

        elHormiguero.insertarEmpleado("Jorge Salvador", "director", null);
        elHormiguero.insertarEmpleado("Marron", "colaborador", null);
        elHormiguero.insertarEmpleado("Barrancas", "técnico", null);

        elHormiguero.insertarEmpleado("Karlos Arguiñano", "cocinero", null);

        System.out.println("*EQUIPO DE EL HORMIGUERO*");
        System.out.println(elHormiguero.getListaEmpleados());
        System.out.println("--------------------------------------------------------------");

        System.out.println("*REGISTRANDO INVITADOS*");
        elHormiguero.insertarInvitado("Aitana", "Cantante", 1);
        elHormiguero.insertarInvitado("Will Smith", "Actor", 1);
        elHormiguero.insertarInvitado("Aitana", "Cantante", 2);
        System.out.println("--------------------------------------------------------------");

        System.out.println("*PRUEBAS DE BÚSQUEDA*");
        elHormiguero.invitadosTemporada(1);

        int veces = elHormiguero.vecesInvitado("Aitana");
        System.out.println("Aitana ha venido " + veces + " veces.");

        elHormiguero.buscarInvitado("Aitana");

        if(elHormiguero.buscarInvitado("Will Smith")) {
            System.out.println("Will Smith ha estado en el programa.");
        }

        Cadena telecinco = new Cadena("Telecinco");
        Programa laRebelion = new Programa("La Rebelión", telecinco, "Ana Rosa");
        System.out.println("--------------------------------------------------------------");

        System.out.println("*REGISTRO EN LA REBELIÓN*");
        laRebelion.insertarInvitado("Aitana", "Cantante", 1);

    }
}