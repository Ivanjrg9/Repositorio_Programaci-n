package org.example.PruebasEnum;

public enum Nivelesdif {
    FACIL(2),MEDIO(4),DIFICIL(8),EXPERTO(10);
    public final int multiplicador;

    Nivelesdif(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public int getMultiplicador() {
        return multiplicador;
    }







}
