package com.company;

public class Execution {

    public static void main(String[] args) {

        Etudiant alice = new Etudiant("Dupont", "Alice", 21, "Pascal", 2);
        Etudiant benjamin = new Etudiant("Dujardin", "Benjamin", 22, "Ohm", 3);
        Etudiant anonyme1 = new Etudiant();
        Etudiant anonyme2 = new Etudiant();

        Administratif beatrice = new Administratif("Dupont", "Béatrice", 19,"inconnue",
                "secrétaire");

        Enseignant boris = new Enseignant("Machin", "Boris", 36,"inconnue",
                "informatique", "electronique");


//        alice.ouMeTrouver();
//        anonyme1.ouMeTrouver();
//        beatrice.ouMeTrouver();
//        boris.ouMeTrouver();

        Personne[] Esirem = {alice, beatrice, benjamin, boris, anonyme1, anonyme2};

        for (Personne personne : Esirem) {
//            personne.ouMeTrouver();
        }


        anonyme1.setNom("Bachour");
        anonyme1.setPrenom("Peter");
        anonyme1.setAge(22);
        anonyme1.setPromotion("Quantum");

        anonyme2.setNom("Doe");
        anonyme2.setPrenom("John");
        anonyme2.setAge(24);
        anonyme2.setPromotion("Yen");


        for (Personne personne : Esirem) {
            System.out.println(personne.toString());
        }
    }
}