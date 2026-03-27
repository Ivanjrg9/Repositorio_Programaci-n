package org.example.Lamdas;

import java.util.List;
import java.util.stream.Stream;

public class PruebaStreams {
    static void main() {
        Stream<String> pruebaStream = Stream.of("Gatos","Leones","Tigre","Guepardo")
                .filter(felinos -> felinos.endsWith("s"))
                .filter(felinos->felinos.contains("e"))
                .map(String::toUpperCase);
                //.anyMatch(felinos->felinos.equals("Leones")); Devuelve un booleano, necesita boolean...
                //.count(); necesita la palabra long para funcionar...

        List<String>felinos = pruebaStream.toList();
        System.out.println(felinos);
    }
}
