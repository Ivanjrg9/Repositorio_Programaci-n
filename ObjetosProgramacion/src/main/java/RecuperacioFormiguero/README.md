# Practica 1 - El Formiguero y La Rebelion

## Descripcion

Esta practica consiste en crear una aplicacion en Java que gestiona programas de television y sus empleados e invitados. Se basa en los programas "El Hormiguero" y "La Rebelion".

## Clases

### Cadena
Representa una cadena de television. Tiene un nombre y una lista de programas. Cuando se crea un programa nuevo se añade automaticamente a la lista de la cadena.

### Programa
Representa un programa de television. Pertenece a una cadena y tiene una lista de empleados y una lista de invitados. Cuando se crea el programa se crea tambien el director y se añade a la lista de empleados.

### Empleado
Representa a un trabajador del programa. El id se genera automaticamente en formato EP001, EP002, etc. El cargo solo puede ser director, tecnico, presentador o colaborador. Si se pone otro valor se queda como "pte". Si el cargo es director, el atributo director queda a null.

### Invitado
Representa a una persona que acude al programa. Cuando se crea un invitado el programa pide por consola el año, mes y dia en que va a acudir.

### AppProgramas
Es la clase principal con el metodo main donde se prueba todo.

## Relaciones entre clases

- Cadena y Programa tienen una relacion bidireccional, se conocen la una a la otra y pueden existir por separado.
- Empleado e Invitado tienen composicion con Programa, si el programa desaparece desaparecen tambien sus empleados e invitados.

## Metodos principales de Programa

- `insertarEmpleado(nombre, cargo, director)` - crea un empleado y lo añade al programa
- `eliminarEmpleado(empleado)` - elimina un empleado de la lista
- `insertarInvitado(nombre, profesion, temporada)` - crea un invitado pidiendo la fecha al usuario y lo añade
- `eliminarInvitado(invitado)` - elimina un invitado de la lista
- `invitadosTemporada(temporada)` - muestra los invitados de una temporada concreta
- `vecesInvitado(nombre)` - devuelve cuantas veces ha acudido un invitado
- `rastrearInvitado(nombre)` - muestra las fechas y temporadas en que ha acudido un invitado
- `buscarInvitado(nombre)` - devuelve true si el invitado ha estado alguna vez en el programa
- `invitadoAntes(nombre, otraPrograma)` - compara en que programa estuvo antes un invitado

## Tests

Se han hecho pruebas unitarias con JUnit 5 en la clase `ProgramaTest`. Para simular la entrada del usuario en los tests se usa `ByteArrayInputStream` para redirigir el System.in.

Los tests comprueban:

- Que al crear un programa se registra en la cadena correctamente
- Que los cargos invalidos se quedan como "pte"
- Que el director tiene el atributo director a null
- Que los ids de empleados se autogeneran y son distintos
- Que `vecesInvitado` cuenta bien las apariciones
- Que `buscarInvitado` encuentra o no al invitado segun corresponda
- Que el director se añade a la lista de empleados al crear el programa
- Que al cambiar de cadena se actualiza la relacion en ambos lados
- Que la fecha del invitado se guarda correctamente

## Como ejecutarlo

Abrir el proyecto en IntelliJ IDEA, ir a la clase `AppProgramas` y ejecutar el metodo main. El programa ira pidiendo por consola los datos de los invitados que se vayan creando.
