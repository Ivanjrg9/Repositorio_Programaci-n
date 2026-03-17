package org.example.ReservaPistas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ReservaApp {
    static Scanner teclado = new Scanner(System.in);
    static HashMap<Usuario, LinkedHashSet<Reserva>> mapa = new HashMap<>();

    static void main() {

    }
    public static void eliminarReserva(LinkedHashSet<Reserva> listaReservas){
        Iterator<Reserva> it = listaReservas.iterator();
        System.out.println("Cual borramos");
        String opcion = teclado.next().toUpperCase();

        while (it.hasNext()){
            Reserva reserva = it.next();
            if (opcion.equals("PADEL") && reserva.getPista() instanceof Padel){
                it.remove();
            } else if (opcion.equals("TENIS") && reserva.getPista() instanceof Tenis) {
                it.remove();
            }
        }
    }
    public static LinkedHashSet<Reserva> obtenerReservas (Usuario usuario){
        return mapa.get(usuario);
    }
    public static void crearResrva(Usuario usuario, Pista pista) {
        Reserva reserva = new Reserva(usuario, pista);

        LinkedHashSet<Reserva> listaReservas = obtenerReservas(usuario);
        if (listaReservas.contains(reserva)) {
            throw new ExcepcionReservaDuplicada();
        } else {
            listaReservas.add(reserva);
            mapa.put(usuario, listaReservas);
        }
    }
}
