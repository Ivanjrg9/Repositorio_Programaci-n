package org.example.PracticaEcomerce;

import java.util.Scanner;
/**
 * Clase principal que actúa como interfaz de usuario para gestionar los pagos.
 */
public class Tienda {
    /**
     * Método principal del flujo. Solicita el método de pago y los datos necesarios.
     */
    public static void iniciarPago() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué método de pago quieres usar? [Bizum, Paypal, Tarjeta]");
        String opcion = teclado.nextLine().toLowerCase();

        switch (opcion) {
            case "tarjeta":
                System.out.println("Introduce los datos de tu tarjeta:");
                String numerotarjeta = teclado.nextLine();
                System.out.println("Selecciona el tipo de tarjeta [VISA, MAESTRO, MASTERCARD]:");
                String tipotajeta = teclado.nextLine().toUpperCase();

                TarjetaCredito tarjeta1 = new TarjetaCredito(0, numerotarjeta, tipotajeta);

                System.out.println("Validando tarjeta...");
                if (tarjeta1.validarTarjeta()) {
                    realizarPago(tarjeta1);
                } else {
                    System.out.println("Los datos de tu tarjeta no son correctos.");
                }
                break;

            case "bizum":
                System.out.println("Introduce tu numero de telefono:");
                String numerotelf = teclado.next();
                Bizum bizum1 = new Bizum(0, numerotelf);

                System.out.println("Introduce tu PIN:");
                int pin = teclado.nextInt();

                System.out.println("Validando PIN...");
                if(bizum1.validarBizum(pin)){
                    realizarPago(bizum1);
                }else {
                    System.out.println("Solicitud de bizum rechazada");
                }

                break;

            case "paypal":

                System.out.println("Introduce tu correo de Paypal");
                String correoPaypal = teclado.next();
                System.out.println("Introduce el importe de la compra:");
                double importe = teclado.nextDouble();
                PayPal paypal1 = new PayPal(importe,correoPaypal);

                if (paypal1.validarPaypal()){
                    realizarPago(paypal1);
                }else {
                    System.out.println("Error con el pago via PayPal");
                }

                break;

            default:
                System.out.println("El método de pago no existe.");
                break;
        }
    }
    /**
     * Método polimórfico que ejecuta el cobro final.
     * @param metodoPago Objeto de tipo MetodoPago (Bizum, PayPal o Tarjeta).
     */
    public static void realizarPago(MetodoPago metodoPago) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el importe a pagar:");
        double importe = teclado.nextDouble();

        metodoPago.procesaPago(importe);

        System.out.println("Pago aceptado. Muchas gracias.");
    }


}


