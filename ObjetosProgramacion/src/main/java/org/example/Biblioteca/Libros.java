package org.example.Biblioteca;

public class Libros {

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;

    private static String ID_LIBRO = "LIB";
    private static int cantidadLibros = 0;
    private  static  int librosDisponible = 0;

    public Libros (String titulo, String autor, Editorial editorial){
        this.autor= autor;
        this.titulo= titulo;
        this.disponible = true;
        cantidadLibros++;
        librosDisponible++;
        this.id= ID_LIBRO;
        estudiantePrestado=null;
        this.editorial=editorial;
        editorial.anyadirlibro(this);

    }

    public void Prestar(Estudiante estudiante){
        Prestamo prestamo=null;

        if (disponible && estudiante.getLibros()==null){
            disponible = false;
            librosDisponible--;
            System.out.println("El libro " + titulo + " ha sido prestado a " + estudiantePrestado.getNombre() + " de " + estudiantePrestado.getCurso());
           // System.out.println("El libro " + titulo + " ha sido prestado.");
            estudiantePrestado=estudiante;
            estudiantePrestado.insertarlibro(this);
        }else if (estudiante.getLibros()!=null){
            System.out.println("El estudiante " + estudiante.getNombre() + "ya tiene un libro prestado");
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
            estudiantePrestado.borrarlibro(this);
            estudiantePrestado=null;
        }else {
            System.out.println("Este libro ya esta en la estanteria.");
        }

    }

    @Override
    public String toString() {
        String estado = disponible ? "Disponible" : "Prestado";

        return "LIBRO [" + id + "] " + "Título: " + titulo + " | " + "Autor: " + autor + " | " + "Estado: " + estado + " Estudiante = " + estudiantePrestado + " Editorial " + editorial;

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

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
}
