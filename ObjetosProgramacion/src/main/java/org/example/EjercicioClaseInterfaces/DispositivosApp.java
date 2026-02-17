package org.example.EjercicioClaseInterfaces;

import org.example.Interface.Televisor;

import java.util.ArrayList;

public class DispositivosApp {
    static void main() {
        ArrayList<Dispositivo> listadispositivos = new ArrayList<>();

        listadispositivos.add(new Televisor("LG Smart"));
        listadispositivos.add(new ParlanteInteligente("Alexa"));

        for (Dispositivo dispositivo : listadispositivos){
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto)dispositivo).sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.apagar();

            Dispositivo proyector = new Dispositivo("Optoma") {
                @Override
                public void encender() {
                    System.out.println("Encendiendo proyector con ajuste de brillo");
                    if (isEstado()){
                        System.out.println("El proyector ya esta encendido ");
                    }else {
                        System.out.println("Encendiendo proyector");

                    }
                }
            };
            proyector.encender();

            ControlRemoto proyector_sinc = new ControlRemoto() {
                @Override
                public void sincronizar() {
                    System.out.println("Sincronizando proyector con control remoto de presentación... ");
                }
            };
            proyector_sinc.sincronizar();

            Dispositivo horno_ia = new Dispositivo("Horno chat gpt") {
                @Override
                public void encender() {
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    if (isEstado()){
                        System.out.println("El horno ya esta encendido");
                    }else {
                        System.out.println("Apagando horno");
                    }
                }
            };
            horno_ia.encender();

            listadispositivos.add(proyector);
            listadispositivos.add(horno_ia);


        }
    }
}
