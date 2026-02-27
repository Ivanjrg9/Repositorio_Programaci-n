#  Mutxamel FC - Sistema de Gestión Deportiva

Sistema de gestión interna para el club **Mutxamel FC** desarrollado en Java. El proyecto implementa una arquitectura orientada a objetos para administrar los diferentes perfiles que integran el club, desde el cuerpo técnico hasta los familiares de los jugadores.



##  Arquitectura del Sistema

El proyecto se basa en una estructura de herencia y contratos mediante interfaces para garantizar un comportamiento coherente en todos los niveles.

### Clases Principales
* **`MutxamelFC` (Clase Abstracta):** La raíz de la jerarquía. Define los atributos básicos (`nombre`, `edad`) y obliga a cumplir el contrato de funciones básicas.
* **`Jugador`:** Gestiona la información deportiva del atleta (dorsal, posición y categoría). Incluye lógica de validación de dorsales únicos.
* **`Entrenador`:** Encargado de la estrategia. Incluye validación de formaciones tácticas mediante expresiones regulares.
* **`Acompanyante`:** Representa a los familiares vinculados a un jugador específico.

###  Interfaces
* **`FuncionesIntegrantes`:** Define comportamientos logísticos y sociales comunes:
    * `concentrarse()`, `viajar(String ciudad)`, `celebrarGol()`.
* **`AccionesDeportivas`:** Define comportamientos de campo:
    * `entrenar()`, `jugarPartido(String rival)`.

---

## Reglas de Negocio e Implementación

### 1. Gestión de Tipos con Enums
Para evitar errores de entrada y estandarizar los datos, se utilizan enumerados:
* **`Equipos`:** Categorías desde `BENJAMIN` hasta `SENIOR`.
* **`Posiciones`:** Demarcaciones como `PORTERO`, `DEFENSA`, `MEDIO` y `DELANTERO`.

### 2. Validaciones Críticas
* **Dorsales únicos:** El sistema lanza una `DorsalDuplicadoException` si se intenta asignar un número ya existente a un jugador de la misma categoría.
* **Formato Táctico:** Las formaciones de los entrenadores se validan mediante el patrón `N-N-N` (ej. `4-4-2`). Si el formato es incorrecto, lanza `FormacionCorrectaException`.



---

## Ejemplo de Funcionalidad: Captura de Datos

El sistema permite capturar objetos complejos a través de la consola, convirtiendo cadenas de texto en constantes de los Enums:

```java
// Conversión de entrada de teclado a Enum
System.out.println("Posicion (Portero, defensa, medio, delantero):");
String posicionStr = teclado.next().toUpperCase();
Posiciones posicion = Posiciones.valueOf(posicionStr);