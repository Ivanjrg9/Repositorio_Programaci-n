package org.example.PruebaExcepciones;

import java.util.Scanner;

public class CuentaBancaria {
    private int saldo;


    public CuentaBancaria(int saldo){
        this.saldo=saldo;
    }

    public int ingresarDienro(int saldo) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que cantidad quieres ingresar?");
        int cantidadIngresar= teclado.nextInt();
        if (cantidadIngresar>3000){
            throw new LimiteDiario("Has sobrepasado el limite de ingreso diario (3000)");
        }
        int saldoacual = saldo+cantidadIngresar;
        System.out.println("Tu saldo actual es de " + saldoacual);
        return saldoacual;
    }

    public int retirarDinero(int saldo){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que cantidad quieres retiar?");
        int retirada = teclado.nextInt();
        if (retirada!=saldo){
            throw new SaldoInsuficiente("No tienes saldo suficiente...");
        }
        int saldoactual = saldo - retirada;
        System.out.println("Te quedan " + saldoactual + " € " + " en la cuenta" );
        return saldoactual;
    }

    public void consultarSlado(int saldo){
        if (saldo<0){
            throw new SaldoInsuficiente("Tienes saldo insuficiente en tu cuenta");
        }
        System.out.println("Dispones de " + saldo + " en tu cuenta:");


    }


    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
