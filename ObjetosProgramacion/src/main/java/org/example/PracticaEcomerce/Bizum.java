package org.example.PracticaEcomerce;

import java.util.Random;

public class Bizum extends MetodoPago{
    Random aleatorio = new Random();

    private String telefono;
    private int pin;


    public Bizum(double importe,String telefono) {
        super(importe);
        this.telefono=telefono;
        pin=aleatorio.nextInt(900000) + 100000;
        System.out.println("El pin es: " + this.pin);
    }

    @Override
    public void procesaPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum");
    }

<<<<<<< HEAD
    public void validarPaypal(){



=======
    public boolean validarBizum(int pinIntroducido) {
        if (this.telefono.length() == 9 && pinIntroducido == this.pin) {
            System.out.println("Pin correcto!");
            return true;
        } else {
            System.out.println("Pin incorrecto");
            return false;
        }
>>>>>>> 04a8957864c5c10616b766057d8418f2de92aa72
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
