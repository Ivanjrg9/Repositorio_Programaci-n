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
        this.pedido=null;
        this.direccion="Calle Falsa 123";
        this.promociones=false;
    }

    public void crearPedido(){

    }
    public void insertarProducto(Producto producto){

    }

<<<<<<< HEAD


=======
>>>>>>> 5d1a53cc90dc2872aeebe6df86ba7f595bcc3d67
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isPromociones() {
        return promociones;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
