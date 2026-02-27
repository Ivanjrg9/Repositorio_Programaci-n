package org.example.Examen_UD6_Drift;

public class Inscripcion {
    private Piloto marca;
    private CategoriaDrift categoriaDrift;
    private boolean pagado;

    public Inscripcion(Piloto marca, CategoriaDrift categoriaDrift, boolean pagado) {
        this.marca = marca;
        this.categoriaDrift = categoriaDrift;
        this.pagado = pagado;
    }

    public Piloto getMarca() {
        return marca;
    }

    public void setMarca(Piloto marca) {
        this.marca = marca;
    }

    public CategoriaDrift getCategoriaDrift() {
        return categoriaDrift;
    }

    public void setCategoriaDrift(CategoriaDrift categoriaDrift) {
        this.categoriaDrift = categoriaDrift;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
}
