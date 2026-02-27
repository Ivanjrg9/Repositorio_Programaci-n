package org.example.ModeloExamenPasado;

public abstract class MutxaAwards {
    private int anyo;

    public MutxaAwards(int anyo) {
        this.anyo = anyo;
    }

    public abstract void obtenerDetalles();

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return "MutxaAwards{" +
                "anyo=" + anyo +
                '}';
    }
}
