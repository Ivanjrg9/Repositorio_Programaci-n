package org.example.Interface;

import org.example.EjercicioClaseInterfaces.ControlRemoto;
import org.example.EjercicioClaseInterfaces.Dispositivo;

public class Televisor extends Dispositivo implements ControlRemoto {

    public Televisor(String nombre){
        super(nombre);
    }
    @Override
    public void encender() {
      if (super.isEstado()){
          System.out.println("El televisor ya esta encendido ");
      }else {
          System.out.println("Encendiendo televisor...");

      }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }

}


