package org.example.PracticaMercadaw;

import java.util.HashMap;
import java.util.Map;

public class Pedido {
    // He dejado 'listaCompra' porque es más claro, pero ojo al getter de abajo
    private HashMap<Producto, Integer> listaCompra;
    private double importeTotal;

    public Pedido() {
        this.listaCompra = new HashMap<>();
        this.importeTotal = 0.0;
    }

    public void agregarProducto(Producto productoSeleccionado, int cantidad) {
        if (listaCompra.containsKey(productoSeleccionado)) {
            int cantidadActual = listaCompra.get(productoSeleccionado);
            listaCompra.put(productoSeleccionado, cantidadActual + cantidad);
        } else {
            listaCompra.put(productoSeleccionado, cantidad);
        }

        double costeAnadido = productoSeleccionado.getPrecio() * cantidad;
        actualizarImporteTotal(costeAnadido);
    }

    public void actualizarImporteTotal(double importe) {
        this.importeTotal += importe;
    }

    public void aplicarPromo3x2() {
        double descuentoTotal = 0;

        for (Map.Entry<Producto, Integer> entrada : listaCompra.entrySet()) {
            Producto producto = entrada.getKey();
            int cantidadComprada = entrada.getValue();

            if (cantidadComprada >= 3) {
                int unidadesRegaladas = cantidadComprada / 3;
                descuentoTotal += unidadesRegaladas * producto.getPrecio();
            }
        }
        this.importeTotal -= descuentoTotal;
        System.out.println("Aplicada promo 3x2. Ahorro: " + descuentoTotal + "€");
    }

    public void aplicarPromo10() {
        double diezPorCiento = this.importeTotal * 0.10;
        this.importeTotal -= diezPorCiento;
        System.out.println("Aplicado descuento del 10%. Ahorro: " + diezPorCiento + "€");
    }


    public double getImporteTotal() {
        return importeTotal;
    }

    // He cambiado el nombre del método para que coincida con el UML
    public HashMap<Producto, Integer> getPedido() {
        return listaCompra;
    }
}