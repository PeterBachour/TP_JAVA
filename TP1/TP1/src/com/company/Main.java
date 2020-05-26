package com.company;

public class Main {

    public static void main(String[] args) {
        Ville dijon = new Ville("Dijon", 40.41, 375831);
        Ville quetigny = new Ville("Quetigny",  8.19 , 9690);
        Ville beaune = new Ville("Beaune", 31.3, 52741);
        Ville macon = new Ville("Mâcon", 27.0, 100172);
        Ville chalon = new Ville("Chalon-sur-Saône", 15.22, 133557);

        Departement coteDor = new Departement("Côte d’or", 21, 3);
        Departement saoneEtLoire = new Departement("Saône-et-Loire", 71, 2);

        coteDor.ajouterVille(dijon);
        coteDor.ajouterVille(quetigny);
        coteDor.ajouterVille(beaune);


        saoneEtLoire.ajouterVille(macon);
        saoneEtLoire.ajouterVille(chalon);
        System.out.println(" ");System.out.println(" ");
        System.out.println(coteDor);
        System.out.println(" ");
        System.out.println(saoneEtLoire);


        System.out.println(     dijon.estIdentiqueA(macon));
        System.out.println(     Ville.sontIdentiques(dijon, macon));
    }
}
