package org.example.Restaurante;

public class Cliente extends Persona {
    private int mesa;
    private int numerocomensales;

    public Cliente(String nombre, String dni,int mesa,int numerocomensales) {
        super(nombre, dni);
        this.mesa=mesa;
        this.numerocomensales=numerocomensales;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getNumerocomensales() {
        return numerocomensales;
    }

    public void setNumerocomensales(int numerocomensales) {
        this.numerocomensales = numerocomensales;
    }

    @Override
    public void accederBanyo() {
        System.out.println("El cliente va al baño");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "mesa=" + mesa +
                ", numerocomensales=" + numerocomensales +
                '}';
    }

    @Override
    public void mostarinfopersona() {

    }


}
