package org.example;

public class Libros {

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;

    private static String ID_LIBRO = "LIB";
    private static int cantidadLibros = 0;
    private  static  int librosDisponible = 0;

    public Libros (String titulo, String autor){
        this.autor= autor;
        this.titulo= titulo;
        this.disponible = true;

        cantidadLibros++;
        librosDisponible++;
        this.id= ID_LIBRO;
        estudiantePrestado=null;
    }

    public void Prestar(Estudiante estudiante){

        if (disponible){
            disponible = false;
            librosDisponible--;
            System.out.println("El libro " + titulo + " ha sido prestado a " + estudiantePrestado.getNombre() + " de " + estudiantePrestado.getCurso());
           // System.out.println("El libro " + titulo + " ha sido prestado.");
            estudiantePrestado=estudiante;
            estudiantePrestado.setLibros(this);
        }else {
            System.out.println("Error! Ya esta prestado.");
        }
    }

    public void devolver(){
        if (!disponible){
            disponible=true;
            librosDisponible++;
            System.out.println("El libro " + titulo + " ha sido devuelto por " + estudiantePrestado.getNombre() + " de " + estudiantePrestado.getCurso() );
           // System.out.println("Has devuelto " + titulo + ", Gracias!");
            estudiantePrestado.setLibros(null);
            estudiantePrestado=null;
        }else {
            System.out.println("Este libro ya esta en la estanteria.");
        }

    }

    @Override
    public String toString() {
        String estado = disponible ? "Disponible" : "Prestado";

        return "LIBRO [" + id + "] " + "Título: " + titulo + " | " + "Autor: " + autor + " | " + "Estado: " + estado + " Estudiante = " + estudiantePrestado;

    }

    private String generarId() {
        return "LIB " + cantidadLibros;
       // return "LIB-" + String.format("%03d", cantidadLibros);
    }

    public boolean estaDisponible(){
        return disponible;
    }


    public static int getCantidadLibros(){
        return cantidadLibros;

    }

    public static int getLibrosDisponible(){
        return librosDisponible;

    }

    public String getId(){
        return this.id;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }
}
