package org.example.ExamenPizza;

public enum CartaPizzas {
    BBQ(9),CARBONARA(8),JAMON_YORK(6),ATUN(5),HAWAIANA(7),VEGGIE(10);

    public final double precio;

    CartaPizzas(double precio) {
        this.precio = precio;
    }
}
