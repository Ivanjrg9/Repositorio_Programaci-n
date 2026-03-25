package org.example.PracticaMercadaw;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AppZonaClientes {
    private static Cliente cliente;

    public static void main(String[] args) {
        Mercadaw tienda = new Mercadaw();
        tienda.generarClientes();

        autenticacion(tienda.getClientes());

        if (cliente != null) {
            iniciarCompra();
        }
    }

    public static void autenticacion(Set<Cliente> clientes) {
        Scanner teclado = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.println("=== COMPRA ONLINE EN MERCADAW ===");
            System.out.print("usuario: ");
            String userLog = teclado.nextLine();
            System.out.print("contraseña: ");
            String passLog = teclado.nextLine();

            for (Cliente cliente1 : clientes) {
                if (cliente1.getUsuario().equals(userLog) && cliente1.getContrasenya().equals(passLog)) {
                    cliente = cliente1;
                    System.out.println("Bienvenido, " + cliente.getUsuario());
                    return;
                }
            }

            intentos--;
            if (intentos > 0) {
                System.out.println("Credenciales no válidas. Intentos: " + intentos);
            }
        }
        System.out.println("ERROR DE AUTENTICACIÓN");
    }

    public static void iniciarCompra() {
        System.out.println("Creando nuevo pedido...");
        cliente.crearPedido();

        Scanner teclado = new Scanner(System.in);
        String continuar = "S";

        while (continuar.equalsIgnoreCase("S")) {
            imprimirProductos();
            System.out.print("Elige un producto: ");
            String nombreProducto = teclado.nextLine().toUpperCase();

            try {
                Producto producto = Producto.valueOf(nombreProducto);
                cliente.insertarProducto(producto);
                System.out.println("Has añadido " + producto + " con un precio de " + producto.getPrecio() + "€");
                System.out.println("Importe total del pedido: " + cliente.getPedido().getImporteTotal() + "€");
            } catch (IllegalArgumentException e) {
                System.out.println("Producto no reconocido. Elige otro...");
            }

            System.out.print("¿Quieres añadir más productos (S/N)? ");
            continuar = teclado.nextLine();
        }
        mostrarOpciones();
    }

    public static void imprimirProductos() {
        System.out.println("Elige un producto de la lista...");
        for (Producto producto : Producto.values()) {
            System.out.println(producto + ": " + producto.getPrecio() + "€");
        }
    }

    public static void mostrarOpciones() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            imprimirResumen();
            System.out.println("¿Qué desea hacer?");
            System.out.println("[1]. Aplicar promos.");
            System.out.println("[2]. Mostrar resumen ordenado por uds.");
            System.out.println("[3]. Terminar pedido.");
            System.out.print("Elección: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    if (!cliente.isPromociones()) {
                        cliente.getPedido().aplicarPromo3x2();
                        cliente.getPedido().aplicarPromo10();
                        cliente.setPromociones(true);
                        System.out.println("PROMO 3x2 y 10% DESC. APLICADAS");
                    } else {
                        System.out.println("Ya has aplicado tus promos anteriormente.");
                    }
                    break;
                case 2:
                    System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");
                    for (Map.Entry<Producto, Integer> entrada : cliente.getPedido().getPedido().entrySet()) {
                        System.out.println(entrada.getValue() + " " + entrada.getKey() + " " + entrada.getKey().getPrecio());
                    }
                    System.out.println("IMPORTE TOTAL: " + cliente.getPedido().getImporteTotal() + "€");
                    break;
                case 3:
                    imprimirDespedida();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 3);
    }

    public static void imprimirResumen() {
        System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA ===");

        Pedido elPedido = cliente.getPedido();

        for (Map.Entry<Producto, Integer> fila : elPedido.getPedido().entrySet()) {
            Producto producto = fila.getKey();
            Integer cantidad = fila.getValue();
            System.out.println(cantidad + " " + producto + " " + producto.getPrecio());
        }
        System.out.println("IMPORTE TOTAL: " + elPedido.getImporteTotal() + "€");
    }

    public static void imprimirDespedida() {
        System.out.println("=== GRACIAS POR SU PEDIDO ==="); // [cite: 303]
        System.out.println("Lo recibirá en unos días en la dirección " + cliente.getDireccion()); // [cite: 304]
    }
}