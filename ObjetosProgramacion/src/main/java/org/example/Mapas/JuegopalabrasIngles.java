package org.example.Mapas;

import java.util.*;

public class JuegopalabrasIngles {
    static HashMap<String, String> mapa = new HashMap<>();

    public static void main(String[] args) {
        JuegopalabrasIngles juego = new JuegopalabrasIngles();
        juego.cargarDiccionario();

<<<<<<< HEAD
        traduce();
=======

        juego.traduce();
>>>>>>> f9e5cb17ec119c6cea1c072b12993873827263ec
    }

    public void nuevoPar(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Palabra en español: ");
        String esp = teclado.next();
        System.out.print("Traducción en inglés: ");
        String eng = teclado.next();
        mapa.put(esp, eng);
    }

    public static String traduce(){
        Scanner teclado = new Scanner(System.in);
<<<<<<< HEAD
        String palabra_random = palabraAleatoria();

        primeraLetraTraduccion();
        System.out.println("Indica la respuesta correcta:");
        String resupesta = teclado.next();

        if (mapa.get(palabra_random).equals(resupesta)){
            System.out.println("¡Correcto!");
        }else {
            System.out.println("ERROR! La respuesta correcta era: " + mapa.get(palabra_random));
=======
        int totalPreguntas = 0;
        int aciertos = 0;
        int errores = 0;

        while (true) {
            String palabraEsp = palabraAleatoria();
            String respuestaCorrecta = mapa.get(palabraEsp);
            String pista = respuestaCorrecta.substring(0, 1).toUpperCase();

            System.out.println(palabraEsp.substring(0, 1).toUpperCase() + palabraEsp.substring(1) + ": " + pista + "...");
            System.out.print("Indique la respuesta: ");
            String resupesta = teclado.next().toLowerCase();

            if (resupesta.equals("fin")) {
                break;
            }

            totalPreguntas++;
            if (resupesta.equals(respuestaCorrecta)){
                System.out.println("¡CORRECTO!");
                aciertos++;
            } else {
                String solucion = respuestaCorrecta.substring(0, 1).toUpperCase() + respuestaCorrecta.substring(1);
                System.out.println("¡NO! La respuesta correcta es " + solucion);
                errores++;
            }
        }

        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total preguntas: " + totalPreguntas);
        System.out.println("Total aciertos: " + aciertos);
        System.out.println("Total errores: " + errores);

        if (totalPreguntas > 0) {
            int porcentaje = (aciertos * 100) / totalPreguntas;
            System.out.println("Aciertos: " + porcentaje + "%");
>>>>>>> f9e5cb17ec119c6cea1c072b12993873827263ec
        }
        return palabra_random;
    }


    public static String palabraAleatoria(){
<<<<<<< HEAD
        ArrayList<String>claves = new ArrayList<>(mapa.keySet());
        Random aleatorio = new Random();
        String palabra_aleatoria = claves.get(aleatorio.nextInt(claves.size()));

        return palabra_aleatoria;
    }

    public static void primeraLetraTraduccion(){
        String palabraEspanyol = palabraAleatoria();
        String traduccionIngles = mapa.get(palabraEspanyol);

        if (traduccionIngles != null && !traduccionIngles.isEmpty()) {
            char primeraLetra = traduccionIngles.charAt(0);

            System.out.println(palabraEspanyol + " : " + primeraLetra + " ...");
        }
=======
        Random aleatorio = new Random();
        ArrayList<String> claves = new ArrayList<>(mapa.keySet());

        int palabraRandom = aleatorio.nextInt(claves.size());
        return claves.get(palabraRandom);
>>>>>>> f9e5cb17ec119c6cea1c072b12993873827263ec
    }

    public void cargarDiccionario() {
        mapa.put("yo", "i"); mapa.put("tu", "you"); mapa.put("el", "he"); mapa.put("ella", "she"); mapa.put("eso", "it");
        mapa.put("nosotros", "we"); mapa.put("ellos", "they"); mapa.put("mio", "mine"); mapa.put("tuyo", "yours"); mapa.put("este", "this");
        mapa.put("ese", "that"); mapa.put("aqui", "here"); mapa.put("alli", "there"); mapa.put("quien", "who"); mapa.put("que", "what");
        mapa.put("donde", "where"); mapa.put("cuando", "when"); mapa.put("porque", "why"); mapa.put("como", "how"); mapa.put("todo", "all");
        mapa.put("alguno", "some"); mapa.put("nada", "nothing"); mapa.put("pero", "but"); mapa.put("si", "if"); mapa.put("no", "no");
        mapa.put("hola", "hello"); mapa.put("adios", "goodbye"); mapa.put("gracias", "thanks"); mapa.put("por favor", "please"); mapa.put("perdon", "sorry");
        mapa.put("siempre", "always"); mapa.put("nunca", "never"); mapa.put("quiza", "maybe"); mapa.put("ahora", "now"); mapa.put("despues", "after");
        mapa.put("antes", "before"); mapa.put("muy", "very"); mapa.put("mucho", "much"); mapa.put("poco", "little"); mapa.put("bien", "well");
<<<<<<< HEAD

        // 101-300: VERBOS COMUNES
=======
>>>>>>> f9e5cb17ec119c6cea1c072b12993873827263ec
        mapa.put("ser", "be"); mapa.put("tener", "have"); mapa.put("hacer", "do"); mapa.put("decir", "say"); mapa.put("ir", "go");
        mapa.put("venir", "come"); mapa.put("ver", "see"); mapa.put("mirar", "look"); mapa.put("querer", "want"); mapa.put("dar", "give");
        mapa.put("saber", "know"); mapa.put("pensar", "think"); mapa.put("tomar", "take"); mapa.put("poner", "put"); mapa.put("comer", "eat");
        mapa.put("beber", "drink"); mapa.put("dormir", "sleep"); mapa.put("hablar", "speak"); mapa.put("leer", "read"); mapa.put("escribir", "write");
        mapa.put("correr", "run"); mapa.put("caminar", "walk"); mapa.put("abrir", "open"); mapa.put("cerrar", "close"); mapa.put("comprar", "buy");
        mapa.put("vender", "sell"); mapa.put("pagar", "pay"); mapa.put("jugar", "play"); mapa.put("cantar", "sing"); mapa.put("bailar", "dance");
        mapa.put("reir", "laugh"); mapa.put("llorar", "cry"); mapa.put("trabajar", "work"); mapa.put("estudiar", "study"); mapa.put("aprender", "learn");
        mapa.put("entender", "understand"); mapa.put("esperar", "wait"); mapa.put("llamar", "call"); mapa.put("ayudar", "help"); mapa.put("perder", "lose");
        mapa.put("ganar", "win"); mapa.put("sentir", "feel"); mapa.put("vivir", "live"); mapa.put("morir", "die"); mapa.put("traer", "bring");
        mapa.put("lunes", "monday"); mapa.put("martes", "tuesday"); mapa.put("miercoles", "wednesday"); mapa.put("jueves", "thursday");
        mapa.put("viernes", "friday"); mapa.put("sabado", "saturday"); mapa.put("domingo", "sunday");
        mapa.put("enero", "january"); mapa.put("febrero", "february"); mapa.put("marzo", "march"); mapa.put("abril", "april");
        mapa.put("mayo", "may"); mapa.put("junio", "june"); mapa.put("julio", "july"); mapa.put("agosto", "august");
        mapa.put("septiembre", "september"); mapa.put("octubre", "october"); mapa.put("noviembre", "november"); mapa.put("diciembre", "december");
        mapa.put("rojo", "red"); mapa.put("azul", "blue"); mapa.put("verde", "green"); mapa.put("amarillo", "yellow");
        mapa.put("negro", "black"); mapa.put("blanco", "white"); mapa.put("gris", "gray"); mapa.put("naranja", "orange");
        mapa.put("rosa", "pink"); mapa.put("marron", "brown"); mapa.put("morado", "purple"); mapa.put("oro", "gold");
        mapa.put("uno", "one"); mapa.put("dos", "two"); mapa.put("diez", "ten"); mapa.put("cien", "hundred"); mapa.put("mil", "thousand");
        mapa.put("casa", "house"); mapa.put("puerta", "door"); mapa.put("ventana", "window"); mapa.put("mesa", "table");
        mapa.put("silla", "chair"); mapa.put("cama", "bed"); mapa.put("cocina", "kitchen"); mapa.put("baño", "bathroom");
        mapa.put("jardin", "garden"); mapa.put("techo", "ceiling"); mapa.put("suelo", "floor"); mapa.put("llave", "key");
        mapa.put("madre", "mother"); mapa.put("padre", "father"); mapa.put("hijo", "son"); mapa.put("hija", "daughter");
        mapa.put("hermano", "brother"); mapa.put("hermana", "sister"); mapa.put("abuelo", "grandfather"); mapa.put("abuela", "grandmother");
        mapa.put("tío", "uncle"); mapa.put("tía", "aunt"); mapa.put("primo", "cousin"); mapa.put("amigo", "friend");
        mapa.put("cabeza", "head"); mapa.put("cara", "face"); mapa.put("ojo", "eye"); mapa.put("nariz", "nose");
        mapa.put("boca", "mouth"); mapa.put("oreja", "ear"); mapa.put("mano", "hand"); mapa.put("brazo", "arm");
        mapa.put("pierna", "leg"); mapa.put("pie", "foot"); mapa.put("dedo", "finger"); mapa.put("sangre", "blood");
        mapa.put("ciudad", "city"); mapa.put("calle", "street"); mapa.put("carro", "car"); mapa.put("avion", "plane");
        mapa.put("tren", "train"); mapa.put("barco", "boat"); mapa.put("bicicleta", "bike"); mapa.put("escuela", "school");
        mapa.put("hospital", "hospital"); mapa.put("banco", "bank"); mapa.put("tienda", "shop"); mapa.put("parque", "park");
        mapa.put("sol", "sun"); mapa.put("luna", "moon"); mapa.put("estrella", "star"); mapa.put("cielo", "sky");
        mapa.put("mar", "sea"); mapa.put("rio", "river"); mapa.put("montaña", "mountain"); mapa.put("bosque", "forest");
        mapa.put("flor", "flower"); mapa.put("arbol", "tree"); mapa.put("hierba", "grass"); mapa.put("tierra", "earth");
        mapa.put("perro", "dog"); mapa.put("gato", "cat"); mapa.put("pajaro", "bird"); mapa.put("caballo", "horse");
        mapa.put("vaca", "cow"); mapa.put("cerdo", "pig"); mapa.put("leon", "lion"); mapa.put("elefante", "elephant");
        mapa.put("pez", "fish"); mapa.put("araña", "spider"); mapa.put("hormiga", "ant"); mapa.put("oso", "bear");
        mapa.put("nuevo", "new"); mapa.put("viejo", "old"); mapa.put("grande", "big"); mapa.put("pequeño", "small");
        mapa.put("largo", "long"); mapa.put("corto", "short"); mapa.put("alto", "tall"); mapa.put("bajo", "short");
        mapa.put("caro", "expensive"); mapa.put("barato", "cheap"); mapa.put("caliente", "hot"); mapa.put("frio", "cold");
        mapa.put("limpio", "clean"); mapa.put("sucio", "dirty"); mapa.put("lleno", "full"); mapa.put("vacio", "empty");
        mapa.put("facil", "easy"); mapa.put("dificil", "difficult"); mapa.put("feliz", "happy"); mapa.put("triste", "sad");
        mapa.put("libro", "book"); mapa.put("boligrafo", "pen"); mapa.put("computadora", "computer"); mapa.put("reloj", "watch");
        mapa.put("camara", "camera"); mapa.put("musica", "music"); mapa.put("dinero", "money"); mapa.put("bolsa", "bag");
        mapa.put("paraguas", "umbrella"); mapa.put("fuego", "fire"); mapa.put("viento", "wind"); mapa.put("nieve", "snow");
        mapa.put("paz", "peace"); mapa.put("guerra", "war"); mapa.put("amor", "love"); mapa.put("odio", "hate");
    }
}