package org.example.PracticaEcomerce;

public class TarjetaCredito extends MetodoPago{
    private int numeroTarjeta;
    private String tipoTarjeta;

    public TarjetaCredito(double importe) {
        super(importe);
    }

    @Override
    public void procesaPago(double importe) {

    }
}
