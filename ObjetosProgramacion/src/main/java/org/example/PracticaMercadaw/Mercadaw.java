package org.example.PracticaMercadaw;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Mercadaw {
    private LinkedHashSet<Cliente>listaClientes = new LinkedHashSet<>();



    public void generarClientes(){

    }

    public Mercadaw(LinkedHashSet<Cliente> listaClientes) {
        this.listaClientes = new LinkedHashSet<>();
    }

    public Set<Cliente> getListaClientes() {
        return Collections.unmodifiableSet(this.listaClientes);
    }

    public void setListaClientes(LinkedHashSet<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
