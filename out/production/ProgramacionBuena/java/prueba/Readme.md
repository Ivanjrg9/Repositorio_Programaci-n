# Informe de Práctica: MERCADAW 

## 1. Introducción
Este proyecto consiste en el desarrollo de una aplicación de compra online para el supermercado **MERCADAW**. El objetivo es permitir que los clientes se autentiquen y realicen pedidos a domicilio desde una interfaz de consola, gestionando productos, cantidades y descuentos.

## 2. Estructura del Sistema
La aplicación se ha construido siguiendo el diagrama de clases UML proporcionado, organizando la lógica de la siguiente manera:

* **`Producto` (Enum)**: Contiene el listado de artículos disponibles (Manzanas, Pan, Arroz, Pollo, Leche, Aceite, Huevos, Tomates y Pasta) con sus respectivos precios unitarios.
* **`Pedido`**: Gestiona el carrito mediante un `HashMap<Producto, Integer>`. Se encarga de calcular el importe total y aplicar las promociones de la tienda (3x2 y 10% de descuento).
* **`Cliente`**: Almacena la información del usuario, su contraseña, dirección ("Calle falsa, 123") y el estado de sus promociones para evitar que se apliquen dos veces.
* **`Mercadaw`**: Actúa como el almacén de datos central, generando clientes con credenciales aleatorias de 8 caracteres para las pruebas.
* **`AppZonaClientes`**: Es la clase principal que controla todo el flujo: el sistema de autenticación, el bucle de selección de productos y la gestión del menú final de compra.

## 3. Funcionamiento de la Aplicación

### Autenticación de Usuarios 
* El sistema valida las credenciales introducidas contra la lista de clientes generada por la clase `Mercadaw`.
* El usuario tiene un máximo de **3 intentos** para loguearse correctamente.
* Si se superan los intentos sin éxito, el programa muestra un error de autenticación y se cierra automáticamente.

### Gestión del Pedido 
* **Selección**: Se muestran los productos disponibles y sus precios. El usuario introduce el nombre del producto por teclado.
* **Validación**: Si el producto no es reconocido, el sistema lanza un aviso ("Producto no reconocido") y permite intentarlo de nuevo sin interrumpir la compra.
* **Acumulación**: Al añadir un producto, el sistema incrementa la cantidad en el pedido del cliente. Se informa del precio del producto añadido y del importe total acumulado en ese momento.

### Promociones y Cierre 
Al finalizar la selección de productos, el cliente accede a un menú con tres opciones:
1. **Aplicar Promos**: Calcula automáticamente el ahorro por el **3x2** (se regala una unidad por cada tres) y aplica un **10% de descuento adicional** sobre el total restante.
2. **Mostrar Resumen**: Muestra el carrito detallado con las unidades de cada producto, sus precios individuales y el importe total actualizado.
3. **Terminar pedido**: Finaliza la ejecución con un mensaje de despedida que confirma el envío a la dirección registrada del cliente.

## 4. Conclusión
La aplicación cumple con todos los requisitos solicitados, integrando correctamente el uso de colecciones de Java (Sets y HashMaps) para gestionar una lógica de negocio realista y robusta.

## 5. Diagrama de Clases (PlantUML)
```mermaid
classDiagram
    class Mercadaw {
        -Set~Cliente~ clientes
        +generarClientes()
        +getClientes()
    }
    class Cliente {
        -String usuario
        -String contrasenya
        -Pedido pedido
        +crearPedido()
        +insertarProducto()
    }
    class Pedido {
        -HashMap~Producto, Integer~ pedido
        -double importeTotal
        +aplicarPromo3x2()
        +aplicarPromo10()
    }
    Mercadaw *-- Cliente
    Cliente *-- Pedido