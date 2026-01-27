package org.example;

public class AbueloApp {
    static void main() {

        Abuelo pepe = new Abuelo("Pepe", 67);
        Abuelo marisa = new Abuelo("Marisa", 69);
        Abuelo marino = new Abuelo("Mariano", 77);
        Abuelo juan = new Abuelo("Juan", 87);

        Autobus alsa = new Autobus( "2345fgh","Mallorca");

        alsa.insertarabuelo(pepe);
        alsa.insertarabuelo(marino);
        alsa.insertarabuelo(marisa);
        alsa.insertarabuelo(juan);

        System.out.println(alsa.getListaAbuelo());

        alsa.borrarabuelo(juan);

        alsa.mostrarPasajeros();

        System.out.println("Son mayores de 80:");
        alsa.mostrarMayores(80);



    }
}
