package org.example.Colecciones;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EjercicioListaCompra {
    static void main() {
        Scanner teclado= new Scanner(System.in);
        Deque<String> listadecompra = new LinkedList<>();

        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar produco por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("x. Salir");
        System.out.println("------------------------------------");

        System.out.println("Selecciona una opción:");
        String opcion = teclado.next().toLowerCase();

        switch (opcion){
            case "1":
                System.out.println("Que producto deseas añadir?");
                String producto = teclado.next();
                listadecompra.offerLast(producto);
                System.out.println("Producto " + producto + " añadido!");
                break;
            case "2":
                System.out.println("Eliminando el primer producto...");
                listadecompra.pollFirst();
                System.out.println("Lista de la compra actualizada: " + listadecompra);
                break;
            case "3":
                System.out.println("Que producto deseas eliminar?");
                String productoaborrar = teclado.next();
                if (listadecompra.contains(productoaborrar)){
                    listadecompra.remove(productoaborrar);
                }
                System.out.println("Producto " + productoaborrar + " borrado!");
                break;
            case "4":
                System.out.println("El primer producto de la lista es: " + listadecompra.peekFirst());
                break;
            case "5":
                System.out.println("Que producto deseas buscar?");
                String productoBuscar = teclado.next();
                if (listadecompra.contains(productoBuscar)){
                    System.out.println("Producto " + productoBuscar + " encontrado!");
                }else {
                    System.out.println("El producto " + productoBuscar + " no se encuentra en la lista...");
                }
                break;
            case "6":
                System.out.println("La lista actual es: " + listadecompra);
                break;
            case "x":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Selecciona una opcion correcta porfavor...");
                break;

        }







    }
}
