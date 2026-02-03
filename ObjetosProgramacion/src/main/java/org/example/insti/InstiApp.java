package org.example.insti;

public class InstiApp {
    static void main() {

        Instituto figueras = new Instituto();
        Instituto lloixa = new Instituto("lloisa", "Alicante");
        lloixa.setpoblcion(null);
        System.out.println(lloixa.getPoblacion());
    }
}
