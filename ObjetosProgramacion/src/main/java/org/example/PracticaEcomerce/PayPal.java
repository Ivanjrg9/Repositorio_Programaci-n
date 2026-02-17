package org.example.PracticaEcomerce;

public class PayPal extends MetodoPago{
    private String cuenta;
    private double saldo;




    public PayPal(double importe,String cuenta) {
        this.cuenta=cuenta;
        this.saldo= 23.0;
        super(importe);
    }

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
