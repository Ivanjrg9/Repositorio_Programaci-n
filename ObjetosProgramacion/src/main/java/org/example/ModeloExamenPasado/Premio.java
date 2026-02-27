package org.example.ModeloExamenPasado;

public class Premio extends MutxaAwards{
    private Categoria categoria;
    private Artista ganador;

    public Premio(int anyo,Categoria categoria,Artista ganador) {
        super(anyo);
        this.categoria=categoria;
        this.ganador=ganador;
    }

    @Override
    public void obtenerDetalles() {

    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Artista getGanador() {
        return ganador;
    }

    public void setGanador(Artista ganador) {
        this.ganador = ganador;
    }
}
