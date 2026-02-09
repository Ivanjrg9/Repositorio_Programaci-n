package org.example.RedesSociales;

public class Streamer extends Usuario{

    private int numerodecolaboraciones;
    private int horasDirecto;

    public Streamer(String nombre, int edad, int seguidores, String nombreUsuario,int horasDirecto, int numerodecolaboraciones) {
        super(nombre, edad, seguidores, nombreUsuario);
        this.horasDirecto=horasDirecto;
        this.numerodecolaboraciones=numerodecolaboraciones;
    }

    public int getNumerodecolaboraciones() {
        return numerodecolaboraciones;
    }

    public void setNumerodecolaboraciones(int numerodecolaboraciones) {
        this.numerodecolaboraciones = numerodecolaboraciones;
    }

    public int getHorasDirecto() {
        return horasDirecto;
    }

    public void setHorasDirecto(int horasDirecto) {
        this.horasDirecto = horasDirecto;
    }

    @Override
    public String toString() {
        return "Streamer{" +
                "numerodecolaboraciones=" + numerodecolaboraciones +
                ", horasDirecto=" + horasDirecto +
                '}';
    }
}
