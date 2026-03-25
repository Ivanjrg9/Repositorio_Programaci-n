package org.example.PracticaMercadaw;

import java.util.HashSet;
import java.util.Collections;
import java.util.Set;

public class Mercadaw {
    private Set<Cliente> clientes;

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