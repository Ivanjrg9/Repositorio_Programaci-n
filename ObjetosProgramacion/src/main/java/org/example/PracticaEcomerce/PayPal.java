package org.example.PracticaEcomerce;
/**
 * Clase para pagos vía PayPal.
 * Dispone de un saldo por defecto de 23€.
 */
public class PayPal extends MetodoPago{
    private String cuenta;
    private double saldo;
    /**
     * Constructor para PayPal.
     * @param importe Cantidad a pagar.
     * @param cuenta Correo electrónico de la cuenta.
     */
    public PayPal(double importe,String cuenta) {
        this.cuenta=cuenta;
        this.saldo= 23.0;
        super(importe);
    }
    /**
     * Valida el formato del correo mediante regex y comprueba si hay saldo suficiente.
     * @return true si el email es válido y el saldo >= importe.
     */
    public boolean validarPaypal() {
        if (cuenta.matches("^[A-Za-z0-9+_.-]+@.+\\.com$")) {
            System.out.println("Correo correcto");
        } else {
            System.out.println("Correo incorrecto");
            return false;
        }

        if (this.saldo >= getImporte()) {
            System.out.println("Saldo suficiente");
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    @Override
    public void procesaPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con PayPal");
    }


    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
