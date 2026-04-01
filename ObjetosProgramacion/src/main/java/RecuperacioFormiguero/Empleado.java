package RecuperacioFormiguero;

/**
 * Representa un empleado de un programa de televisión.
 * Su ciclo de vida está ligado al del Programa (composición).
 */
public class Empleado {

    private static int contador = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    /**
     * Constructor de Empleado.
     * El id se autogenera con formato EP001, EP002, etc.
     * Si el cargo no es válido, se asigna "pte".
     * Si el cargo es "director", el atributo director queda a null.
     *
     * @param nombre   Nombre del empleado.
     * @param cargo    Cargo del empleado (director, técnico, presentador, colaborador).
     * @param director Director del programa al que pertenece.
     */
    public Empleado(String nombre, String cargo, Empleado director) {
        contador++;
        this.id = String.format("EP%03d", contador);
        this.nombre = nombre;
        setCargo(cargo);
        setDirector(director);
    }

    /**
     * @return ID autogenerado del empleado.
     */
    public String getId() {
        return id;
    }

    /**
     * @return Nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return Cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @return Director asociado al empleado (null si el empleado es director).
     */
    public Empleado getDirector() {
        return director;
    }

    /**
     * @param nombre Nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Asigna cargo si es uno de los valores válidos; en caso contrario lo deja como "pte".
     * @param cargo Cargo a asignar.
     */
    public void setCargo(String cargo) {
        if (cargo.equals("director") || cargo.equals("técnico")
                || cargo.equals("presentador") || cargo.equals("colaborador")) {
            this.cargo = cargo;
        } else {
            this.cargo = "pte";
        }
    }

    /**
     * Asigna el director. Si el cargo ya es "director", este atributo queda a null.
     * @param director Director a asignar.
     */
    public void setDirector(Empleado director) {
        if (this.cargo.equals("director")) {
            this.director = null;
        } else {
            this.director = director;
        }
    }

    @Override
    public String toString() {
        return "Empleado{nombre='" + nombre + "', id='" + id + "', cargo='" + cargo
                + "', director=" + director + "}";
    }
}
