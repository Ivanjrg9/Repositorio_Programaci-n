# Práctica Ecommerce - Sistema de Gestión de Pagos

Este proyecto implementa un sistema de validación y procesamiento de pagos para una tienda virtual, aplicando conceptos de **Programación Orientada a Objetos (POO)** en Java como herencia, polimorfismo y clases abstractas.

##  Tecnologías utilizadas
* **Lenguaje:** Java 17+
* **Documentación:** Javadoc
* **Diagramado:** PlantUML

##  Estructura del Proyecto

El sistema se basa en una jerarquía de clases donde `MetodoPago` actúa como la clase base:

1. **MetodoPago (Abstracta):** Define el atributo `importe` y el método abstracto `procesaPago`.
2. **Bizum:** Gestión de pagos mediante teléfono y un PIN aleatorio de 6 dígitos.
3. **PayPal:** Validación de cuenta de correo y comprobación de saldo (inicializado en 23€).
4. **TarjetaCredito:** Validación de formato (16 dígitos) y tipo de emisor (VISA, MASTERCARD, MAESTRO).
5. **Tienda:** Clase controladora que gestiona la interacción con el usuario y aplica el polimorfismo.

##  Diagrama de Clases (PlantUML)

```plantuml
@startuml
abstract class MetodoPago {
    - importe: double
    + {abstract} procesaPago(importe: double)
}
class Bizum {
    - telefono: String
    - pin: int
    + validarBizum(pin: int): boolean
}
class PayPal {
    - cuenta: String
    - saldo: double
    + validarPaypal(): boolean
}
class TarjetaCredito {
    - numeroTarjeta: String
    - tipoTarjeta: String
    + validarTarjeta(): boolean
}
MetodoPago <|-- Bizum
MetodoPago <|-- PayPal
MetodoPago <|-- TarjetaCredito
Tienda ..> MetodoPago
@enduml