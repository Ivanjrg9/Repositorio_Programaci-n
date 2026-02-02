package org.example.PartidoTenis;

import java.util.ArrayList;
import java.util.Set;

public class Partido {
    private Jugador jugador;
    private ArrayList<Set>listadesets;

    public Partido(Jugador j1,Jugador j2){


    }

    public void puntossetmax(){



    }


    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Set> getListadesets() {
        return listadesets;
    }

    public void setListadesets(ArrayList<Set> listadesets) {
        this.listadesets = listadesets;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "jugador=" + jugador +
                ", listadesets=" + listadesets +
                '}';
    }
}
