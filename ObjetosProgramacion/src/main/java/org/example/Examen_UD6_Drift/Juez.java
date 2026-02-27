package org.example.Examen_UD6_Drift;

import java.util.Random;

public class Juez extends Participante implements AccionesCarrera{
    public Juez(String nombre, String pais) {
        super(nombre, pais);
    }

    public void validarCochePiloto(Piloto piloto){
        if (piloto.getEstadoCoche().equals(EstadoCoche.APTO)){
            System.out.println("Coche apto");
        }else {
            System.out.println("Coche no preparado");
        }

    }

    @Override
    public void validarInscripciones(Inscripcion inscripcion) {
        if (!inscripcion.isPagado()){
            System.out.println("El piloto no ha pagado la inscripcion");

        }else {
            System.out.println("El piloto ha pagado la inscripcion");
        }

    }

    @Override
    public void darSalida() {
        System.out.println("Luz verde, adelante!!!");
    }

    @Override
    public void puntuar(Piloto piloto) {
        Random aleatorio = new Random();
         int puntuacion = piloto.getPuntuacion() * aleatorio.nextInt(20)+1;

        System.out.println("La puntuacion del piloto " + piloto.getNombre() + " es de: " + puntuacion + " puntos!");



    }
}
