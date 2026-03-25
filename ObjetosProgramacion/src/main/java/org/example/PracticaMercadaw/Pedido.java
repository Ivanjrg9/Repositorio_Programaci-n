package org.example.PracticaMercadaw;

import java.util.HashMap;
import java.util.Map;

/**
 * Gestiona los productos seleccionados por el usuario y el cálculo de costes.
 */
public class Pedido {
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

    /**
     * Aplica la promoción 3x2: por cada tres unidades de un producto, se regala una.
     * Actualiza el importe total tras el recálculo.
     */
    public void aplicarPromo3x2() {
        double descuentoTotal = 0;

        for (Map.Entry<Producto, Integer> entrada : listaCompra.entrySet()) {
            Producto producto = entrada.getKey();
            int cantidadComprada = entrada.getValue();

            if (cantidadComprada >= 3) {
                int unidadesGratis = cantidadComprada / 3;
                descuentoTotal += unidadesGratis * producto.getPrecio();
            }
        }
        this.importeTotal -= descuentoTotal;
        System.out.println("Aplicada promo 3x2. Ahorro: " + descuentoTotal + "€");
    }

    /**
     * Aplica un descuento del 10% sobre el importe total actual del pedido.
     */
    public void aplicarPromo10() {
        double diezPorCiento = this.importeTotal * 0.10;
        this.importeTotal -= diezPorCiento;
        System.out.println("Aplicado descuento del 10%. Ahorro: " + diezPorCiento + "€");
    }


    public double getImporteTotal() {
        return importeTotal;
    }

    public HashMap<Producto, Integer> getPedido() {
        return listaCompra;
    }
}