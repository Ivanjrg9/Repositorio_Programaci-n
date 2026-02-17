package org.example.PracticaEcomerce;
/**
 * Clase abstracta que define la estructura base para cualquier método de pago.
 * @author Ivan
 */
public abstract class MetodoPago {
    private double importe;
    /**
     * Constructor de la clase MetodoPago.
     * @param importe Cantidad económica asociada al pago.
     */
    public MetodoPago(double importe){
        this.importe=importe;
    }
    /**
     * Método abstracto para procesar el pago. Debe ser implementado por las subclases.
     * @param importe Cantidad a cobrar.
     */
    public abstract void procesaPago(double importe);


    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }




}
