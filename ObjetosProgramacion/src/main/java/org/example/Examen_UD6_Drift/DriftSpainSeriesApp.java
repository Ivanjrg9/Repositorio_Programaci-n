package org.example.Examen_UD6_Drift;

import org.example.ModeloExamenPasado.Categoria;

import java.util.ArrayList;
import java.util.Scanner;

public class DriftSpainSeriesApp {
    public static ArrayList<Inscripcion>pilotosInsritos = new ArrayList<>();
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=== Bienvenido a la app del drift Spain series de Valencia ===");

        Piloto piloto1 = new Piloto("Juan","Francia","Skoda",EstadoCoche.APTO,45);
        Piloto piloto2 = new Piloto("Manu","España","Mercedes",EstadoCoche.APTO,45);
        Piloto piloto3 = new Piloto("Roberto","Alemania","Toyota",EstadoCoche.APTO,70);

        piloto1.inscribirse(CategoriaDrift.PRO);
        piloto2.inscribirse(CategoriaDrift.PRO);
        piloto3.inscribirse(CategoriaDrift.PRO);

        Juez juez1 = new Juez("Manolo","España");

        Inscripcion p1 = new Inscripcion(piloto1,CategoriaDrift.PRO ,true);
        Inscripcion p2 = new Inscripcion(piloto2,CategoriaDrift.PRO,true);
        Inscripcion p3 = new Inscripcion(piloto3,CategoriaDrift.PRO,false);

        juez1.validarInscripciones(p1);
        juez1.validarInscripciones(p2);
        juez1.validarInscripciones(p3);

        Mecanico mecanicoP1 = new Mecanico("Jose","España", piloto1);
        Mecanico mecanicoP2 = new Mecanico("Ivan","España", piloto2);
        Mecanico mecanicoP3 = new Mecanico("Florentino", "Albania", piloto3);

        mecanicoP1.revisarVehiculo();
        mecanicoP2.revisarVehiculo();
        mecanicoP3.revisarVehiculo();

        juez1.validarCochePiloto(piloto1);
        juez1.validarCochePiloto(piloto2);
        juez1.validarCochePiloto(piloto3);

        juez1.darSalida();

        juez1.puntuar(piloto1);
        juez1.puntuar(piloto2);
        juez1.puntuar(piloto3);

        System.out.println("Inscribiendo participante...");
        System.out.println("Nombre:");
        String nombre = teclado.next();
        System.out.println("Pais:");
        String pais = teclado.next();
        Piloto pilototeclado = new Piloto(nombre,pais,"Skoda",EstadoCoche.APTO,458);
        System.out.println("Piloto " + pilototeclado.getNombre() + " de la marca Skoda creado con exito");

        pilotosInsritos.add(p1);
        pilotosInsritos.add(p2);
        pilotosInsritos.add(p3);

        System.out.println("Piloto " + pilototeclado.getNombre() + " realizando inscripcion...");
        System.out.println("Elige una categoria[street,pro,hyper]");
        String categoria = teclado.next();

        switch (categoria){
            case "street":
               // pilototeclado.setCategoria();
                break;
            case "pro":

                break;
            case "hyper":

                break;
            default:
                System.out.println("Categoria incorrecta, elige una existente");
        }

        Inscripcion pilotocreado = new Inscripcion(pilototeclado,CategoriaDrift.PRO,true);
        pilotosInsritos.add(pilotocreado);

        System.out.println("Inscribiendo al juez...");
        System.out.println("Nombre:");
        String nombrejuez = teclado.next();
        System.out.println("Pais:");
        String paisjuez = teclado.next();
        Juez juezteclado = new Juez(nombrejuez,paisjuez);
        System.out.println("Juez " + juezteclado.getNombre() + " creado!");
    }
}
