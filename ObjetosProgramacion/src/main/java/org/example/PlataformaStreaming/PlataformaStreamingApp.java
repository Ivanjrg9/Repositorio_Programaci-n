package org.example.PlataformaStreaming;

import java.util.ArrayList;
import java.util.Arrays;

public class PlataformaStreamingApp {
    static void main() {
        ArrayList<Suscripcion> listaPlanes = new ArrayList<>();

        PlanGratis planGratis = new PlanGratis("Plan Gratis",0.00);
        PlanBasico planBasico = new PlanBasico("Plan Básico",9.99);
        PlanPremium planPremium = new PlanPremium("Plan Premium",14.99);
        PlanFamiliar planFamiliar = new PlanFamiliar("Plan Familiar",19.99);

        listaPlanes.add(planGratis);
        listaPlanes.add(planBasico);
        listaPlanes.add(planPremium);
        listaPlanes.add(planFamiliar);

        for (Suscripcion suscripcion : listaPlanes){
            suscripcion.mostrarPrecio();
            suscripcion.obtenerBeneficios();
        }

    }
}
