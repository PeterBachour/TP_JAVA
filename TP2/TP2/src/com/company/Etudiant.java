package com.company;

public class Etudiant extends Personne {

    private String promotion;
    private int nbAbsences;

    public Etudiant() {
        super();
        this.promotion = "inconnue";
        this.nbAbsences = 0;
    }

    public Etudiant(String nom, String prenom, int age, String promotion, int nbAbsences) {
        super(nom, prenom, age);
        this.promotion = promotion;
        this.nbAbsences = nbAbsences;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public int getNbAbsences() {
        return nbAbsences;
    }

    public void setNbAbsences(int nbAbsences) {
        this.nbAbsences = nbAbsences;
    }

    @Override
    public void ouMeTrouver() {
        System.out.println("Je suis en cours tous les jours, sauf les jeudis après-midis (je fais du sport, mais c’est" +
                "comme un cours car j’aime le sport).");
    }

    @Override
    public String toString() {
        String out = super.toString();
        out += "J'appartient à la promotion " + promotion + " et j'ai " +nbAbsences+" absence(s). ";
        return out;
    }
}
