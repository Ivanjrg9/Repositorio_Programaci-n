package RecuperacioFormiguero;

/**
 * Clase principal de la aplicación "El Formiguero y La Rebelión".
 */
public class AppProgramas {

    public static void main(String[] args) {

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        Programa el_hormiguero = new Programa("El Hormiguero", antena3, "Director1");
        System.out.println(el_hormiguero);
        System.out.println(antena3);

        el_hormiguero.insertarEmpleado("Pablo Motos", "presentador", null);
        System.out.println(el_hormiguero);

        System.out.println(el_hormiguero.getListaEmpleados());

        el_hormiguero.insertarInvitado("Aitana", "cantante", 1);

        System.out.println(el_hormiguero.getListaInvitados());

        el_hormiguero.invitadosTemporada(1);

        el_hormiguero.rastrearInvitado("Aitana");

        System.out.println(el_hormiguero.buscarInvitado("Aitana"));
        System.out.println(el_hormiguero.buscarInvitado("Rosalía"));

        Cadena laSexta = new Cadena("La Sexta");
        Programa la_rebelion = new Programa("La Rebelión", laSexta, "DirectorR");
        la_rebelion.insertarInvitado("Aitana", "cantante", 1);

        el_hormiguero.invitadoAntes("Aitana", la_rebelion);
    }
}
