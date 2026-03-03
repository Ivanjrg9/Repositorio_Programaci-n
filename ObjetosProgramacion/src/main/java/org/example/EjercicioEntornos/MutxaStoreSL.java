package org.example.EjercicioEntornos;

import java.time.LocalDate;

public class MutxaStoreSL {
    static void main() {
        Cliente pepe = new Cliente("pepe","ramos","aefef@adfd", LocalDate.of(2000, 1, 1));

        System.out.println("Nuevo cliente " + pepe);

        Cliente manolo = new Cliente("manolo","ramos","aefef@adfd", LocalDate.of(2000, 1, 1));

        System.out.println("Nuevo cliente " + manolo);

    }
}
