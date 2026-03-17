package org.example.ReservaPistas;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Tenis extends Pista{
    private String superficie;

    public Tenis(int id, String techado, String superficie) {
        super(id, techado);
        this.superficie=superficie;
    }
}
