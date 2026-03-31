package org.example.ExamenParkingAñoPasado;

import java.util.List;
import java.util.Random;

public class Parking {
    private String ciudad;
    private int plazas_totales;
    private double precio_minuto;
    private List<Ticket> clientesActuales;

    public Parking(String ciudad, int plazas_totales, double precio_minuto, List<Ticket> clientesActuales) {
        this.ciudad = ciudad;
        this.plazas_totales = plazas_totales;
        this.precio_minuto = precio_minuto;
        this.clientesActuales = clientesActuales;
    }

    public void generarClientesAleatorios(){
        Random random = new Random();
        int cantidadClientes = random.nextInt(8)+1;

        for (int i = 0; i < cantidadClientes; i++) {
            Ticket nuevoTicket = new Ticket("", 0, Estado.PENDIENTE);
            String matricula;

            boolean duplicado;

            do {
                duplicado = false;
                nuevoTicket.setMatricula("");
                matricula = nuevoTicket.getMatricula();

                for (Ticket ticket : clientesActuales){
                    if (ticket.getMatricula().equalsIgnoreCase(matricula)){
                        duplicado = true;
                        break;
                    }
                }
            } while (duplicado);

            int minutos = random.nextInt(120)+1;
            nuevoTicket.setMatricula(matricula);
            nuevoTicket.setMinutos(minutos);
            nuevoTicket.setEstado(Estado.RECOGIDO);
            anyadirCliente(nuevoTicket);
        }
    }

    public void mostrarClientesActuales(){

    }

    public void anyadirCliente(Ticket ticket){
        clientesActuales.add(ticket);

    }

    public Ticket validarTicket(String matricula){
        for (Ticket ticket : clientesActuales){
            if (ticket.getMatricula().equalsIgnoreCase(matricula)){
                return ticket;
            }
        }
        return null;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPlazas_totales() {
        return plazas_totales;
    }

    public void setPlazas_totales(int plazas_totales) {
        this.plazas_totales = plazas_totales;
    }

    public double getPrecio_minuto() {
        return precio_minuto;
    }

    public void setPrecio_minuto(double precio_minuto) {
        this.precio_minuto = precio_minuto;
    }

    public List<Ticket> getClientesActuales() {
        return clientesActuales;
    }

    public void setClientesActuales(List<Ticket> clientesActuales) {
        this.clientesActuales = clientesActuales;
    }
}
