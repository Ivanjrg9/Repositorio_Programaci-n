package org.example.EjercicioEntornos;

public class Calculadora {
   private int primernumero ;
   private int segundonumero;

    public Calculadora(int primernumero, int segundonumero) {
        this.primernumero = primernumero;
        this.segundonumero = segundonumero;
    }

    public int getPrimernumero() {
        return primernumero;
    }

    public void setPrimernumero(int primernumero) {
        this.primernumero = primernumero;
    }

    public int getSegundonumero() {
        return segundonumero;
    }

    public void setSegundonumero(int segundonumero) {
        this.segundonumero = segundonumero;
    }

    public int suma (){
        int resultado = primernumero+segundonumero;
        return resultado;
    }
    public int resta (){
        int resultado = primernumero-segundonumero;
        return resultado;
    }

    public int multipliar (){
        int resultado = primernumero*segundonumero;
        return resultado;
    }

    public int dividir (){
        int resultado = primernumero/segundonumero;
        return resultado;
    }
}
