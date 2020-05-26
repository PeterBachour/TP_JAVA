package com.company;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Formation formation = new Formation("Formation", "Formation");

        Cours cours1 = new Cours("cours1", "cours1", 12.75);
        Cours cours2 = new Cours("cours2", "cours2", 12.75);
        Cours cours3 = new Cours("cours3", "cours3", 12.75);
        Cours cours4 = new Cours("cours4", "cours4", 12.75);
        Cours cours5 = new Cours("cours5", "cours5", 12.75);
        Cours cours6 = new Cours("cours6", "cours6", 12.75);
        Cours cours7 = new Cours("cours7", "cours6", 12.75);

        formation.addCours(cours1);
        formation.addCours(cours4);
        formation.addCours(cours5);
        formation.addCours(cours6);
        formation.addCours(cours2);
        formation.addCours(cours3);
        formation.addCours(cours7);
        System.out.println(formation.toString());

        formation.removeCours(1);
        System.out.println(formation.toString());
        Collections.sort(formation.getListeCours());
        System.out.println(formation.toString());

    }
}
