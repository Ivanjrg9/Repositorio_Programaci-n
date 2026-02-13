package org.example.PracticaEcomerce;

import java.util.Random;

public class Bizum extends MetodoPago{
    Random aleatorio = new Random();

    private String telefono;
    private int pin;


    public Bizum(double importe,String telefono,int pin) {
        this.telefono=telefono;
        this.pin=pin;
        super(importe);
    }

    @Override
    public void procesaPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum");

    }

    public void validarPaypal(){
        


    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
