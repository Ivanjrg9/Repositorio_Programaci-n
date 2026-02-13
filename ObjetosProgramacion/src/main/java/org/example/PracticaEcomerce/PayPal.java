package org.example.PracticaEcomerce;

public class PayPal extends MetodoPago{
    private String cuenta;
    private double saldo;

    final double saldoDefault = 23;


    public PayPal(double importe,String cuenta,double saldo) {
        this.cuenta=cuenta;
        this.saldo=saldo;
        super(importe);
    }

    public void validarPaypal(){
        if (cuenta.matches("^[A-Za-z0-9+_.-]+@.com$")){
            System.out.println("Correo correcto");
        }else {
            System.out.println("Correo incorrecto");
        }

        if (saldoDefault!=getImporte()){
            System.out.println("Saldo insuficiente");
        }else {
            System.out.println("Saldo suficiente");
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
