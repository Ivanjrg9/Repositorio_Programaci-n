package org.example.EjercicioEntornos;

import java.time.LocalDate;


public class Videojuego {
    private String titulo;
    private String genero;
    private String plataforma;
    private int precio;
    private int stock;
    private LocalDate anyoLanzamiento;

    public Videojuego(String titulo, String genero, int precio, String plataforma, int stock, LocalDate anyoLanzamiento) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.plataforma = plataforma;
        this.stock = stock;
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public void anyadirvideojuego(){

    }

    public void eliminarVideojuegos(){

    }

    public void consultarVidejouegosplataformas(){

    }

    public void modificarInfo(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LocalDate getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(LocalDate anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", anyoLanzamiento=" + anyoLanzamiento +
                '}';
    }
}
