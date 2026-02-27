package org.example.Examen_UD6_Drift;

public class Mecanico extends Participante{
    private Piloto piloto;

    public Mecanico(String nombre, String pais,Piloto piloto) {
        super(nombre, pais);
        this.piloto=piloto;
    }

    public void revisarVehiculo(){
        System.out.println("Revisando el vehiculo de " + piloto.getNombre() + " para dejarlo a punto...");

    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
