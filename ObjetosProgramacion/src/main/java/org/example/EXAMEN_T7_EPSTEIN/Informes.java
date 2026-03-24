package org.example.EXAMEN_T7_EPSTEIN;

import java.util.ArrayList;

public interface Informes {

    static void verPoliticos(Famoso famoso){
        ArrayList<Famoso>listapoliticos =new ArrayList<>();
        System.out.println("Identificando clase politica...");
        if (famoso.getProfesion().equals("Politico")){
            listapoliticos.add(famoso);
        }

        for (Famoso famosos : listapoliticos){
            System.out.println(listapoliticos);
        }
    }

    static void informeJuzgado(){

    }

    static void verRanking(){

    }

}
