package org.example.Examen_UD6_Drift;

public enum CategoriaDrift {
    STREET(50.0),PRO(150.0),HYPER_DRIFT(300.0);

    public final double multiplicador;

    CategoriaDrift(double multiplicador) {
        this.multiplicador = multiplicador;
    }
}
