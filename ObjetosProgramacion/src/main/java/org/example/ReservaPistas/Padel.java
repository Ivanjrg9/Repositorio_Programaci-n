package org.example.ReservaPistas;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Padel extends Pista{
    private String paredes;

    public Padel(int id, String techado, String paredes) {
        super(id, techado);
        this.paredes=paredes;
    }
}
