package org.example.PlataformaStreaming;

public abstract class Suscripcion {
    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio){
        this.nombrePlan=nombrePlan;
        this.precio= precio;
    }


    public void mostrarPrecio() {
        System.out.println("El precio del plan es: " + precio);
    }

    public abstract void obtenerBeneficios();

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
