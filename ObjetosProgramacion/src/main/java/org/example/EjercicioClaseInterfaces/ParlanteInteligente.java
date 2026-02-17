package org.example.EjercicioClaseInterfaces;

public class ParlanteInteligente extends Dispositivo{

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        System.out.println("Activando parlante por comando de voz");

//        if ( ){
//            System.out.println("El parlante ya esta encendido");
//        }else {
//            System.out.println("Activando parlante con comando de voz");
//        }
    }
}
