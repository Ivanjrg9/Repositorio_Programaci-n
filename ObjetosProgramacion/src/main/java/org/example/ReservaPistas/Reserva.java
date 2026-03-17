package org.example.ReservaPistas;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Reserva {
    private Usuario usuario;
    private Pista pista;
    private LocalDateTime fecha_hora;

    public Reserva(Usuario usuario, Pista pista) {
        this.usuario = usuario;
        this.fecha_hora = LocalDateTime.now();
        this.pista = pista;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(usuario, reserva.usuario) && Objects.equals(pista, reserva.pista) && Objects.equals(fecha_hora, reserva.fecha_hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, pista, fecha_hora);
    }


}
