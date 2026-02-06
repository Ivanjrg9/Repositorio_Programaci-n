# Informe de Práctica: "El Hormiguero" y "La Rebelión"

## 1. Introducción
Este proyecto consiste en una aplicación Java diseñada para gestionar y objetivizar la información de programas de televisión en competencia. Permite administrar cadenas, programas, empleados (con jerarquías) e invitados, facilitando un análisis crítico de las intervenciones televisivas y evitando la división ideológica de los espectadores.

---

## 2. Arquitectura del Código y Clases
La aplicación se ha desarrollado siguiendo un modelo de **composición y agregación** según los requisitos técnicos del enunciado.

### **Clase `Cadena`**
* **Propósito**: Representa la entidad televisiva principal.
* **Atributos**: `nombre` y una `listaProgramas` de tipo `ArrayList<Programa>.
* **Relación**: Mantiene una agregación bidireccional con la clase `Programa`, permitiendo que ambas existan de forma independiente.

### **Clase `Programa`**
**Propósito**: Núcleo de la aplicación donde interactúan empleados e invitados.
* **Lógica Destacada**:
    * Al crearse, genera automáticamente un **director** y lo añade a la lista de empleados.
    * Gestiona la relación de composición: si el programa se destruye, sus empleados e invitados asociados desaparecen.
* **Métodos Extra**: Implementa búsquedas por temporada, rastreo de invitados y comparación de fechas de visita utilizando `isBefore().

### **Clase `Empleado`**
* **Propósito**: Define al personal del programa.
* **ID Autogenerado**: Utiliza un contador para asignar códigos únicos correlativos como `EP001`, `EP002`, etc.
* **Validación de Cargo**: Solo permite valores específicos: "director", "técnico", "presentador" o "colaborador". Si el valor no es válido, se asigna "pte".
* **Jerarquía**: Si el cargo no es "director", se le asigna un superior que debe coincidir con el director del programa.

### **Clase `Invitado`**
* **Propósito**: Registra las visitas de personajes públicos al programa.
* **Gestión de Fechas**: Incluye una integración con `LocalDate` que, por defecto, usa la fecha de creación pero permite la entrada de fechas específicas a través de consola.

---



