package org.example.Chalet;

public class ChaletApp {
    static void main() {
        Casa pisitio = new Casa("Calle falsa 123");
        System.out.println(pisitio.getPropietario());

        pisitio.crearhabitacion("Cocina", 12.5);
        pisitio.crearhabitacion("Terraza", 4);
        pisitio.crearhabitacion("Despacho",13);
        pisitio.crearhabitacion("Despacho",14);

        pisitio.borrarhabitacion("Despacho");
        pisitio.getListahabitaciones().get(1).crearElectrodomestico("Lavadora", 234.4);
        pisitio.mostrarhabitaciones();
        pisitio.getListahabitaciones().get(1).mostrarElectrodomestico();

        System.out.println("La habitacion mas grande es: " + pisitio.gethabitacionmasgrandes().getNombre());


    }
}
