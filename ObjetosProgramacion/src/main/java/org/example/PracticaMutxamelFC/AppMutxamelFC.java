package org.example.PracticaMutxamelFC;

import java.util.ArrayList;

public class AppMutxamelFC {
    static void main() {

        ArrayList<Jugador>listajugadores = new ArrayList<>();

        Jugador ramos = new Jugador("Ramos",18,Posiciones.DELANTERO,Equipos.SENIOR,9,listajugadores);
        Jugador pepe = new Jugador("Pepe",22,Posiciones.MEDIO,Equipos.SENIOR,9,listajugadores);
        Jugador juanito = new Jugador("Juanito",28,Posiciones.PORTERO,Equipos.SENIOR,1,listajugadores);
        Entrenador flick = new Entrenador("Flick",45,Equipos.ALEVIN,"4-4-2");
        Masajista manolin = new Masajista("Manolin",33,"Fisio",5);
        Masajista laura = new Masajista("Laura",28,"Universidad",2);
        Acompanyante madreRamos = new Acompanyante("Susi",70,ramos,"Madre");
        Acompanyante hermanoPepe = new Acompanyante("Ramon",25,pepe,"Hermano");

        listajugadores.add(ramos);
        listajugadores.add(pepe);
        listajugadores.add(juanito);

        flick.concentrarse();
        juanito.entrenar();
        manolin.concentrarse();
        manolin.darMasaje(juanito);
        juanito.concentrarse();
        juanito.viajar("Madrid");
        manolin.viajar("Madrid");



    }
}
