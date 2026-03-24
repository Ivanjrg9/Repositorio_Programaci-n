package org.example.ExamenAnyoPasadoUD7;

public class AppExcursiones {
    static void main() {

        System.out.println("*** APP EXCURSIONES ***");

        Excursion terra_mitica = new Excursion("Terra mitica","Alicante",30.0);

        terra_mitica.insertarProfesor();

        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();

        terra_mitica.verAsistentes();

        terra_mitica.eliminarPorEdad(16);
        System.out.println("Despues de eliminar los menores de 16 años:");
        terra_mitica.verAsistentes();

        System.out.println("Importe a ingresar para la actividad " + terra_mitica.getNombre_actividad() + " en " + terra_mitica.getLocalidad() + ":" +
                terra_mitica.calcularImporteIngreso() + " €.");
    }
}
