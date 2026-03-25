package org.example.PracticaMercadaw;

<<<<<<< HEAD
import java.util.LinkedHashSet;

public class Mercadaw {
    LinkedHashSet<Cliente>listaClientes = new LinkedHashSet<>();

    public Mercadaw(){

    }
=======
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Mercadaw {
    private LinkedHashSet<Cliente>listaClientes = new LinkedHashSet<>();


>>>>>>> 5d1a53cc90dc2872aeebe6df86ba7f595bcc3d67

    public void generarClientes(){

    }

<<<<<<< HEAD
    public LinkedHashSet<Cliente> getListaClientes() {
        return listaClientes;
=======
    public Mercadaw(LinkedHashSet<Cliente> listaClientes) {
        this.listaClientes = new LinkedHashSet<>();
    }

    public Set<Cliente> getListaClientes() {
        return Collections.unmodifiableSet(this.listaClientes);
    }

    public void setListaClientes(LinkedHashSet<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
>>>>>>> 5d1a53cc90dc2872aeebe6df86ba7f595bcc3d67
    }
}
