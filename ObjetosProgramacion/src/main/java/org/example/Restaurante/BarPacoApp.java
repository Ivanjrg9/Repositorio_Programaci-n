package org.example.Restaurante;

public class BarPacoApp {
    static void main() {

        Camarero pepe = new Camarero("Pepe", "48627380K",1234.89);

        pepe.mostarinfopersona();

        Cliente jose = new Cliente("Jose", "48627380K", 4,6);

        jose.mostrarInfoPersona();

    }
}
