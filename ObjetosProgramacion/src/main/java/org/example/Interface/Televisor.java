package org.example.Interface;

import org.example.EjercicioClaseInterfaces.ControlRemoto;
import org.example.EjercicioClaseInterfaces.Dispositivo;

public class Televisor extends Dispositivo implements ControlRemoto {

    @Override
    public void encender() {
        System.out.println("Encendiendo televisor...");
    }
}
