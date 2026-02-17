package org.example.PracticaEcomerce;

public class TarjetaCredito extends MetodoPago{
    private String numeroTarjeta;
    private String tipoTarjeta;

    public TarjetaCredito(double importe,String numeroTarjeta,String tipoTarjeta) {
        this.tipoTarjeta=tipoTarjeta;
        this.numeroTarjeta=numeroTarjeta;
        super(importe);
    }

    @Override
    public void procesaPago(double importe) {
        System.out.println("Procesando pago de: " + importe + " € " + " con tarjeta de crédito VISA");

    }

    public boolean validarTarjeta() {
        boolean numeroCorrecto = false;
        boolean tipoCorrecto = false;

        if (!numeroTarjeta.matches("\\d+")) {
            System.out.println("Error, solo se admiten numeros");
        } else if (numeroTarjeta.length() != 16) {
            System.out.println("Error, numero incorrecto");
        } else {
            System.out.println("Numero de tarjeta correcto");
            numeroCorrecto = true;
        }

        if (tipoTarjeta.equals("VISA") || tipoTarjeta.equals("MASTERCARD") || tipoTarjeta.equals("MAESTRO")) {
            System.out.println("Tipo de tarjeta correcto");
            tipoCorrecto = true;
        } else {
            System.out.println("Tipo de tarjeta incorrecto");
        }

        return numeroCorrecto && tipoCorrecto;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
}
