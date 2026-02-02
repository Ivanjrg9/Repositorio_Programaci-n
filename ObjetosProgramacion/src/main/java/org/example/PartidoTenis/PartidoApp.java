package org.example.PartidoTenis;

public class PartidoApp {
    static void main() {

        Jugador j1 = new Jugador("Nadal",1);
        Jugador j2 = new Jugador("Alcaraz", 2);

        Partido partido = new Partido(j1,j2);


    }
}
