package RecuperacioFormiguero;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Representa un programa de televisión.
 * Tiene relación de agregación bidireccional con Cadena, y composición con Empleado e Invitado.
 */
public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    /**
     * Constructor de Programa.
     * Crea el director automáticamente, lo añade a la listaEmpleados y registra
     * el programa en la cadena indicada.
     *
     * @param nombre         Nombre del programa.
     * @param cadena         Cadena a la que pertenece.
     * @param nombreDirector Nombre del director del programa.
     */
    public Programa(String nombre, Cadena cadena, String nombreDirector) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();

        this.director = new Empleado(nombreDirector, "director", null);
        listaEmpleados.add(this.director);

        cadena.agregarPrograma(this);
    }

    /**
     * @return Nombre del programa.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return Cadena a la que pertenece.
     */
    public Cadena getCadena() {
        return cadena;
    }

    /**
     * @return Número de temporadas.
     */
    public int getTemporadas() {
        return temporadas;
    }

    /**
     * @return Lista de empleados del programa.
     */
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * @return Lista de invitados del programa.
     */
    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    /**
     * @return Director del programa.
     */
    public Empleado getDirector() {
        return director;
    }

    /**
     * @param nombre Nuevo nombre del programa.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Cambia la cadena del programa actualizando la relación bidireccional.
     * @param cadena Nueva cadena.
     */
    public void setCadena(Cadena cadena) {
        this.cadena.eliminarPrograma(this);
        this.cadena = cadena;
        cadena.agregarPrograma(this);
    }

    /**
     * @param temporadas Número de temporadas.
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    /**
     * Crea un Empleado y lo añade al programa.
     * @param nombre   Nombre del empleado.
     * @param cargo    Cargo del empleado.
     * @param director Director asociado (si es null se asigna el director del programa).
     */
    public void insertarEmpleado(String nombre, String cargo, Empleado director) {
        Empleado emp;
        if (director == null) {
            emp = new Empleado(nombre, cargo, this.director);
        } else {
            emp = new Empleado(nombre, cargo, director);
        }
        listaEmpleados.add(emp);
    }

    /**
     * Elimina un empleado de la lista.
     * @param empleado Empleado a eliminar.
     */
    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    /**
     * Crea un Invitado (solicitando la fecha al usuario) y lo añade al programa.
     * @param nombre    Nombre del invitado.
     * @param profesion Profesión del invitado.
     * @param temporada Temporada en la que acude.
     */
    public void insertarInvitado(String nombre, String profesion, int temporada) {
        Invitado inv = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(inv);
    }

    /**
     * Elimina un invitado de la lista.
     * @param invitado Invitado a eliminar.
     */
    public void eliminarInvitado(Invitado invitado) {
        listaInvitados.remove(invitado);
    }

    /**
     * Muestra cuántos invitados han acudido al programa en una temporada concreta,
     * junto con sus nombres y profesiones.
     * @param temporada Temporada a consultar.
     */
    public void invitadosTemporada(int temporada) {
        int count = 0;
        for (Invitado inv : listaInvitados) {
            if (inv.getTemporada() == temporada) {
                System.out.println(inv.getNombre() + " - " + inv.getProfesion());
                count++;
            }
        }
        System.out.println("Total invitados en temporada " + temporada + ": " + count);
    }

    /**
     * Devuelve las veces que un invitado ha acudido al programa.
     * @param nombre Nombre del invitado.
     * @return Número de apariciones.
     */
    public int vecesInvitado(String nombre) {
        int veces = 0;
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                veces++;
            }
        }
        return veces;
    }

    /**
     * Muestra cuántas veces ha acudido un invitado al programa, en qué fechas y temporadas.
     * @param nombre Nombre del invitado.
     */
    public void rastrearInvitado(String nombre) {
        int veces = vecesInvitado(nombre);
        System.out.println(nombre + " ha acudido " + veces + " vez/veces.");
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Fecha: " + inv.getFecha_visita() + " | Temporada: " + inv.getTemporada());
            }
        }
    }

    /**
     * Indica si un invitado ha acudido alguna vez al programa.
     * @param nombre Nombre del invitado.
     * @return true si ha acudido, false en caso contrario.
     */
    public boolean buscarInvitado(String nombre) {
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Compara en qué programa ha estado antes un invitado entre este y otro programa.
     * Usa buscarInvitado para verificar que el invitado estuvo en ambos programas.
     * @param nombre Nombre del invitado.
     * @param otro   Otro programa donde buscar al mismo invitado.
     */
    public void invitadoAntes(String nombre, Programa otro) {
        boolean enEste = this.buscarInvitado(nombre);
        boolean enOtro = otro.buscarInvitado(nombre);

        if (!enEste || !enOtro) {
            System.out.println(nombre + " no ha estado en ambos programas.");
            return;
        }

        LocalDate fechaEste = null;
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                if (fechaEste == null || inv.getFecha_visita().isBefore(fechaEste)) {
                    fechaEste = inv.getFecha_visita();
                }
            }
        }

        LocalDate fechaOtro = null;
        for (Invitado inv : otro.getListaInvitados()) {
            if (inv.getNombre().equalsIgnoreCase(nombre)) {
                if (fechaOtro == null || inv.getFecha_visita().isBefore(fechaOtro)) {
                    fechaOtro = inv.getFecha_visita();
                }
            }
        }

        if (fechaEste.isBefore(fechaOtro)) {
            System.out.println(nombre + " estuvo antes en " + this.nombre + " (" + fechaEste + ")");
        } else if (fechaOtro.isBefore(fechaEste)) {
            System.out.println(nombre + " estuvo antes en " + otro.getNombre() + " (" + fechaOtro + ")");
        } else {
            System.out.println(nombre + " acudió el mismo día a ambos programas.");
        }
    }

    @Override
    public String toString() {
        return "Programa{nombre='" + nombre + "', cadena=" + cadena.getNombre()
                + ", director=" + director
                + ", temporadas=" + temporadas
                + ", listaEmpleados=" + listaEmpleados
                + ", listaInvitados=" + listaInvitados + "}";
    }
}
