package org.example;

public class Libros {

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;


    private static int cantidadLibros = 0;
    private  static  int librosDisponible = 0;

    public Libros (String titulo, String autor){

        this.autor= autor;
        this.titulo= titulo;
        this.disponible = true;

        cantidadLibros++;
        librosDisponible++;
        this.id= "LIB00" + cantidadLibros;
    }

    public void Prestar(){
        if (disponible){
            disponible = false;
            librosDisponible--;
            System.out.println("El libro " + titulo + " ha sido prestado.");
        }else {
            System.out.println("Error! Ya esta prestado.");
        }

    }


}
