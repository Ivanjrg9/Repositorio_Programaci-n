package org.example.Biblioteca;

public class Estudiante {

   private static int contadorEstudiantes =0;

    private String nombre;
    private String curso;
    private  int nia;
    private String email;
    private Libros libros;

    public Estudiante(String nombre, String curso, String email){
         this.nombre = nombre;
         this.curso=curso;
         this.email=email;
         nia = ++contadorEstudiantes;
    }

    public Estudiante(String nombre){
         this(nombre,"","");

    }


    public static boolean validarcorreo(String email){
        if (email.matches("^[A-Za-z0-9+_.-]+@alu.edu.gva.es$")){
            return true;
        }else {
            return false;
        }
    }
    public static int getContadorEstudiantes(){
        return contadorEstudiantes++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", nia=" + nia +
                ", email='" + email + '\'' +
                ", libro= " + libros +
                '}';
    }




}
