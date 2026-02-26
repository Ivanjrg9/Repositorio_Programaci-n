package org.example.PracticaMutxamelFC;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMantenimiento {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Jugador> listajugadores = new ArrayList<>();
        ArrayList<Masajista> listamasajistas = new ArrayList<>();

        Masajista manolin = new Masajista("Manolin",33,"Fisio",5,listajugadores);
        Masajista laura = new Masajista("Laura",28,"Universidad",2,listajugadores);
        listamasajistas.add(manolin);
        listamasajistas.add(laura);

        System.out.println("=== App de mantenimiento del Mutxamel FC ===");
        System.out.println("[1]. Mantenimiento de jugadores (Añadir jugador, modificar, y añadir acompañantes (solo seniors))");
        System.out.println("[2]. Mantenimiento  de entrenadores (Añadir-modificar-salir)");
        System.out.println("[3]. Mantenimiento de masajistas (Añadir-modificar datos-salir)");
        System.out.println("[4]. Consultar equipos");
        System.out.println("[X]. Salir");
        System.out.println("==========================================================");
        System.out.println("Selecciona una opción -->");
        String opcion = teclado.next().toUpperCase();

        switch (opcion){
            case "1":
                System.out.println("Opción no disponible, lo siento");
                break;
            case "2":
                System.out.println("Opción no disponible, lo siento...");
                break;
            case "3":
                System.out.println("Quieres añadir, modificar o salir??");
                String opcion2 = teclado.next().toLowerCase();

                switch (opcion2){
                    case "añadir":
                        System.out.println("Escribe el nombre del nuevo masajista");
                        String nombre = teclado.next();
                        System.out.println("Edad:");
                        int edad = teclado.nextInt();
                        System.out.println("Titulacion:");
                        String titulacion = teclado.next();
                        System.out.println("Años de experiencia:");
                        int anyosExperiencia = teclado.nextInt();

                        Masajista masajistacreado = new Masajista(nombre,edad,titulacion,anyosExperiencia,listajugadores);
                        listamasajistas.add(masajistacreado);
                        System.out.println("Masajista " + masajistacreado + " creado correctamente!!");
                        break;
                    case "modificar":
                        System.out.println("Elige el masajista que quieres modificar");
                        for (int i = 0; i < listamasajistas.size(); i++) {
                            System.out.println(("( " + i + " )" + " " + listamasajistas.get(i).toString()));
                        }
                        System.out.println("Cual quieres?");
                        int masajistaquequieres = teclado.nextInt();

                        if (masajistaquequieres >= listamasajistas.size()){
                            System.out.println("El masajista no existe");
                            return;
                        }

                        System.out.println("Nombre, edad, titulacion, años de experiencia");
                        String opcion3 = teclado.next().toLowerCase();

                        switch (opcion3){
                            case "nombre":
                                System.out.println("Escribe el nuevo nombre:");
                                String nombrenuevo = teclado.next();
                                listamasajistas.get(masajistaquequieres).setNombre(nombrenuevo);
                                break;
                            case "edad":
                                System.out.println("Introduce la nueva edad:");
                                int nuevaedad = teclado.nextInt();
                                listamasajistas.get(masajistaquequieres).setEdad(nuevaedad);
                                break;
                            case "titulacion":
                                System.out.println("Introduce la nueva titulacion:");
                                String titulacionnueva = teclado.next();
                                listamasajistas.get(masajistaquequieres).setTitulacion(titulacionnueva);
                                break;
                            case "años de experiencia":
                                System.out.println("Dime el nuevo tiempo de experiencia:");
                                int nuevaexperiencia = teclado.nextInt();
                                listamasajistas.get(masajistaquequieres).setAnyosExperiencia(nuevaexperiencia);
                                break;
                            default:
                                System.out.println("Elige una opcion correcta porfavor...");
                                break;
                        }
                        System.out.println("Masajista actualizad@ con exito!");
                        System.out.println(listamasajistas.get(masajistaquequieres));
                        break;
                    case "salir":
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Elige una opcion correcta porfavor...");
                        break;
                }
                break;
            case "4":


                break;
            case "X":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Elige una opcion correcta porfavor...");
                break;

        }
    }

}
