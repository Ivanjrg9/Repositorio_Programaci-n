package org.example.prueba;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import prueba.Cliente;
import prueba.Mercadaw;
import prueba.Pedido;
import prueba.Producto;

import static org.junit.jupiter.api.Assertions.*;

public class MercadawTest {
    private Pedido pedido;
    private Cliente cliente;
    private Mercadaw mercadaw;

    @BeforeEach
    void setUp() {
        pedido = new Pedido();
        cliente = new Cliente("pepe", "1234");
        mercadaw = new Mercadaw();
        mercadaw.generarClientes();
    }

    @Test
    void testInsercionDeProducto() {
        pedido.agregarProducto(Producto.PAN, 1);
        assertEquals(1, pedido.getPedido().get(Producto.PAN));
    }

    @Test
    void testInsercionMismoProductoAcumulaUnidades() {
        pedido.agregarProducto(Producto.PAN, 2);
        pedido.agregarProducto(Producto.PAN, 3);
        assertEquals(5, pedido.getPedido().get(Producto.PAN));
    }

    @Test
    void testProductoInexistente() {
        assertThrows(IllegalArgumentException.class, () -> {
            Producto.valueOf("PRODUCTO_QUE_NO_EXISTE");
        });
    }

    @Test
    void testCalculoImporte() {
        pedido.agregarProducto(Producto.PAN, 2);
        pedido.agregarProducto(Producto.LECHE, 1);
        assertEquals(3.30, pedido.getImporteTotal(), 0.01);
    }

    @Test
    void testPromo3x2() {
        pedido.agregarProducto(Producto.PAN, 3);
        pedido.aplicarPromo3x2();
        assertEquals(2.0, pedido.getImporteTotal(), 0.01);
    }

    @Test
    void testPromo3x2SinAlcanzarMinimo() {
        pedido.agregarProducto(Producto.PAN, 2);
        pedido.aplicarPromo3x2();
        assertEquals(2.0, pedido.getImporteTotal(), 0.01);
    }

    @Test
    void testDescuento10() {
        pedido.agregarProducto(Producto.ARROZ, 1);
        pedido.aplicarPromo10();
        assertEquals(3.15, pedido.getImporteTotal(), 0.01);
    }

    @Test
    void testPromocionesCombinadasen() {
        pedido.agregarProducto(Producto.PAN, 3);
        pedido.aplicarPromo3x2();
        pedido.aplicarPromo10();
        assertEquals(1.80, pedido.getImporteTotal(), 0.01);
    }

    @Test
    void testInsertarProductoEnCliente() {
        cliente.crearPedido();
        cliente.insertarProducto(Producto.MANZANAS);
        assertEquals(1, cliente.getPedido().getPedido().get(Producto.MANZANAS));
    }

    @Test
    void testInsertarProductoCreaPedidoSiEsNull() {
        assertNull(cliente.getPedido());
        cliente.insertarProducto(Producto.LECHE);
        assertNotNull(cliente.getPedido());
    }

    @Test
    void testPromocionesInicialesEnFalse() {
        assertFalse(cliente.isPromociones());
    }

    @Test
    void testSetPromociones() {
        cliente.setPromociones(true);
        assertTrue(cliente.isPromociones());
    }

    @Test
    void testAutenticacionCorrecta() {
        boolean encontrado = false;
        for (Cliente c : mercadaw.getClientes()) {
            if (c.getUsuario().equals("pepe") && c.getContrasenya().equals("1234")) {
                encontrado = true;
                break;
            }
        }
        assertTrue(encontrado);
    }

    @Test
    void testAutenticacionContrasenyaIncorrecta() {
        boolean encontrado = false;
        for (Cliente c : mercadaw.getClientes()) {
            if (c.getUsuario().equals("pepe") && c.getContrasenya().equals("wrongpass")) {
                encontrado = true;
                break;
            }
        }
        assertFalse(encontrado);
    }

    @Test
    void testAutenticacionUsuarioInexistente() {
        boolean encontrado = false;
        for (Cliente c : mercadaw.getClientes()) {
            if (c.getUsuario().equals("usuarioFalso") && c.getContrasenya().equals("1234")) {
                encontrado = true;
                break;
            }
        }
        assertFalse(encontrado);
    }

    @Test
    void testMercadawTieneClientes() {
        assertFalse(mercadaw.getClientes().isEmpty());
    }
}