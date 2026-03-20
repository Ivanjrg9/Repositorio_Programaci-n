package org.example.SringBuilder;

public class PruebaSB {
    static void main() {

        StringBuilder sb = new StringBuilder();

        sb.append("Es el vecino ");
        sb.append(" el que elige ").append(" al alcalde ");
        sb.insert(13," alcalde");
        sb.replace(20,24,"vecinos");
        sb.delete(13,17);
        sb.reverse();

        System.out.println(sb);
    }
}
