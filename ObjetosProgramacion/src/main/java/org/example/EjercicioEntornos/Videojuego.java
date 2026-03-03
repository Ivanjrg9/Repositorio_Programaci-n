package org.example.EjercicioEntornos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
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
}
