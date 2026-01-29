package org.example.Chalet;

public class ChaletApp {
    static void main() {
        Casa pisitio = new Casa("Calle falsa 123");

        pisitio.crearhabitacion("Cocina", 12.5);
        pisitio.crearhabitacion("Terraza", 4);
        pisitio.crearhabitacion("Despacho",13);
        pisitio.crearhabitacion("Despacho",14);

        pisitio.mostrarhabitaciones();

        System.out.println("La habitacion mas grande es: " + pisitio.gethabitacionmasgrandes().getNombre());


    }
}
