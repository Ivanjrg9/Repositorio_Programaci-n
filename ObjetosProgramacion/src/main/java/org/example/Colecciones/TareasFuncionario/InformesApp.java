package org.example.Colecciones.TareasFuncionario;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class InformesApp {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        Stack<Informe>pilaInformes = new Stack<>();

        Informe informeManolo = new Informe(12356,Descripcion.EMPRESARIAL);
        Informe informePaco = new Informe(32554,Descripcion.ADMINISTRATIVO);
        Informe informeManu = new Informe(48985,Descripcion.PERSONAL);
        Informe informeRamon = new Informe(789261,Descripcion.EMPRESARIAL);
        Informe informeLucia = new Informe(46512,Descripcion.PERSONAL);

        pilaInformes.add(informeManolo);
        pilaInformes.add(informePaco);
        pilaInformes.add(informeManu);
        pilaInformes.add(informeRamon);
        pilaInformes.add(informeLucia);

       System.out.println("Cantidad de informes: " + pilaInformes.size());

        while (!pilaInformes.isEmpty()){
            System.out.println(" ");
            System.out.println("Siguiente informe en ser eliminado: " + pilaInformes.peek());
            System.out.println("Eliminando informe: " + pilaInformes.pop());
            System.out.println("Eliminado!");
            System.out.println("*****************************************************");
            if (pilaInformes.size() == 0){
                System.out.println("No quedan mas tareas por realizar, buen trabajo!");
                System.out.println(pilaInformes);
            }else {
                System.out.println("Numero de tareas por realizar: " + pilaInformes.size());
                System.out.println(pilaInformes);
            }
            System.out.println("----------------------------------------------------");

        }

        String eleccion;

        do {
            System.out.println("Deseas añadir mas informes?(Si o No)");
            eleccion = teclado.next().toLowerCase();

            switch (eleccion){
                case "si":
                    System.out.println("Introduce el codigo del Informe:");
                    int codigo = teclado.nextInt();
                    System.out.println("Ahora el tipo [ADMINISTRATIVO,EMPRESARIAL,PERSONAL]:");
                    String descripcion = teclado.next().toUpperCase();
                    if (descripcion.matches("ADMINISTRATIVO") || descripcion.matches("EMPRESARIAL") || descripcion.matches("PERSONAL")){
                        Informe informeNuevo = new Informe(codigo,Descripcion.valueOf(descripcion));
                        pilaInformes.add(informeNuevo);
                    }
                    System.out.println("Nuevo tamaño de la lista: " + pilaInformes.size() + " informe/s");
                    System.out.println("Lista actualizada: " + pilaInformes);

                    break;
                case "no":
                    System.out.println("De acuerdo, saliendo...");
                    System.out.println("Lista de informes pendientes: " + pilaInformes.size());
                    break;
                default:
                    System.out.println("Inserta una opcion valida porfavor...");
                    break;
            }

        }while (!eleccion.equals("no"));




    }
}
