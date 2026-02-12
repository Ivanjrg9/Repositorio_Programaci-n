package org.example.PracticaEcomerce;

public abstract class MetodoPago {
    private double importe;

    public MetodoPago(double importe){
        this.importe=importe;
    }


    public abstract void procesaPago(double importe);


    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }




}
