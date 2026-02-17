package org.example.PracticaEcomerce;

import java.util.Random;
/**
 * Clase que gestiona los pagos mediante el sistema Bizum.
 * Requiere un teléfono de 9 dígitos y un PIN de 6 dígitos generado aleatoriamente.
 */
public class Bizum extends MetodoPago{
    Random aleatorio = new Random();

    private String telefono;
    private int pin;
    /**
     * Constructor que inicializa el teléfono y genera un PIN aleatorio.
     * @param importe Importe inicial.
     * @param telefono Número de teléfono del usuario.
     */
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

    /**
     * Valida si el teléfono tiene la longitud correcta y el PIN coincide.
     * @param pinIntroducido PIN que el usuario escribe por consola.
     * @return true si los datos son válidos, false en caso contrario.
     */
    public boolean validarBizum(int pinIntroducido) {
        if (this.telefono.length() == 9 && pinIntroducido == this.pin) {
            System.out.println("Pin correcto!");
            return true;
        } else {
            System.out.println("Pin incorrecto");
            return false;
        }
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
