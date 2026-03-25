package org.example.PracticaMercadaw;

public class Cliente {
    private String usuario;
    private String contrasenya;
    private String direccion;
    private boolean promociones;
    private Pedido pedido;

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.direccion = "Calle falsa, 123";
        this.promociones = false;
        this.pedido = null;
    }

    /**
     * Crea una nueva instancia de Pedido para el cliente.
     */
    public void crearPedido() {
        this.pedido = new Pedido();
    }

    /**
     * Añade un producto al pedido. Si el pedido no existe, lo crea.
     */
    public void insertarProducto(Producto producto) {
        // Si el pedido es null (como al principio), lo creamos [cite: 132]
        if (this.pedido == null) {
            crearPedido();
        }
        // Llamamos al método de la clase Pedido para añadirlo [cite: 168, 169]
        this.pedido.agregarProducto(producto, 1);
    }

    public String getUsuario() { return usuario; }
    public String getContrasenya() { return contrasenya; }
    public String getDireccion() { return direccion; }
    public boolean isPromociones() { return promociones; }
    public void setPromociones(boolean promociones) { this.promociones = promociones; }
    public Pedido getPedido() { return pedido; }
}