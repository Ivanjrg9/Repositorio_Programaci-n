package prueba;

import java.util.HashSet;
import java.util.Collections;
import java.util.Set;

/**
 * Clase que gestiona el conjunto de clientes del supermercado.
 * Permite la generación de usuarios aleatorios y el acceso seguro a los mismos.
 */
public class Mercadaw {
    private Set<Cliente> clientes;

    /**
     * Genera clientes con usuario y contraseña aleatorios de 8 caracteres.
     * Muestra la lista por consola para facilitar las pruebas de acceso.
     */
    public Mercadaw() {
        this.clientes = new HashSet<>();
    }

    public void generarClientes() {
        clientes.add(new Cliente("pepe", "1234"));
        clientes.add(new Cliente("ana", "5678"));

    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(this.clientes);
    }
}