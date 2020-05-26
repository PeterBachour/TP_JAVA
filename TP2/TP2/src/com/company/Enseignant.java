package com.company;

public class Enseignant extends Personnel {

    private String matierePrincipale;
    private String matiereSecondaire;

    public Enseignant() {
        this.matierePrincipale = "inconnu";
        this.matiereSecondaire = "inconnu";
    }

    public Enseignant(String nom, String prenom, int age, String service, String matierePrincipale, String matiereSecondaire) {
        super(nom, prenom, age, service);
        this.matierePrincipale = matierePrincipale;
        this.matiereSecondaire = matiereSecondaire;
    }

    public String getMatierePrincipale() {
        return matierePrincipale;
    }

    public void setMatierePrincipale(String matierePrincipale) {
        this.matierePrincipale = matierePrincipale;
    }

    public String getMatiereSecondaire() {
        return matiereSecondaire;
    }

    public void setMatiereSecondaire(String matiereSecondaire) {
        this.matiereSecondaire = matiereSecondaire;
    }

    @Override
    public void ouMeTrouver() {
        System.out.println("Ce n’est pas la peine de me chercher, je saurai vous trouver!");
    }

    @Override
    public String toString() {
        String out = super.toString();
        out += "J'enseigne les matieres suivantes: " + matierePrincipale + " et " + matiereSecondaire + ". ";
        return out;
    }
}
