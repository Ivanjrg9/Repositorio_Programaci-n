package org.example.Examen_PracticoUD5;

import java.time.LocalDate;

public class JuegosInviernoApp {
    static void main() {

        Deportista juan = new Deportista("Juan", LocalDate.of(2000,11,12));
        Deportista Belen = new Deportista("Belen",LocalDate.of(2001,5,25));


        Equipo Espanya = new Equipo("España");
        Equipo Francia = new Equipo("Francia");


        System.out.println(Espanya.getListadeportistas());

    }
}
