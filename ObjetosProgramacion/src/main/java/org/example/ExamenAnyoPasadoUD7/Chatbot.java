package org.example.ExamenAnyoPasadoUD7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chatbot {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        Map<String, String> respuestas = new HashMap<>();
        respuestas.put("hola", "Hola, ¿En qué te puedo ayudar?");
        respuestas.put("¿cómo estás?", "¡Estoy listo para ayudarte!");
        respuestas.put("adiós", "¡Hasta luego!");
        respuestas.put("gracias", "¡De nada! Que tengas un buen día.");

        System.out.println("Chatbot: Bienvenido! Escribe <salir> cuando quieras acabar la conversación...");

        String entrada = "";

        while (true) {
            System.out.print("Tú: ");

            entrada = teclado.nextLine().toLowerCase().trim();

            if (entrada.equals("salir")) {
                System.out.println("Chatbot: ¡Adiós!");
                break;
            }

            if (respuestas.containsKey(entrada)) {
                System.out.println("Chatbot: " + respuestas.get(entrada));
            } else {
                System.out.println("Chatbot: No te entiendo :(");
            }
        }
        teclado.close();
    }
}
