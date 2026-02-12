package org.example.PlataformaStreaming;

public class PlanPremium extends Suscripcion {
    public PlanPremium(String nombrePlan,double precio) {
        super(nombrePlan, precio );
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido de alta definicion y descargas offline");
    }
}
