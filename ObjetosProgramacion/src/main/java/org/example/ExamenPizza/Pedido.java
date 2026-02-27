package org.example.ExamenPizza;

import java.util.ArrayList;

public class Pedido extends PizzaExpress{
    private Cliente cliente;
    private ArrayList<CartaPizzas>listapizzas;
    private EstadoPedido estadoPedido;

    public Pedido(Cliente cliente, EstadoPedido estadoPedido) {
        this.cliente = cliente;
        this.estadoPedido = estadoPedido;
        listapizzas = new ArrayList<>();
    }

    @Override
    public void obtenerDetalles() {

    }

    public void aplicarDescuento(){

    }

    public ArrayList<CartaPizzas> getListapizzas() {
        return listapizzas;
    }

    public void setListapizzas(ArrayList<CartaPizzas> listapizzas) {
        this.listapizzas = listapizzas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
}
