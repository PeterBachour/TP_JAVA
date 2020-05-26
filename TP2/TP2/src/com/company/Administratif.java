package com.company;

public class Administratif extends Personnel {

    private String fonction;

    public Administratif() {
        super();
        this.fonction = "inconnu";
    }

    public Administratif(String nom, String prenom, int age, String service, String fonction) {
        super(nom, prenom, age, service);
        this.fonction = fonction;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    @Override
    public void ouMeTrouver() {
        System.out.println("Le plus facile c’est de passer à mon bureau.");
    }

    @Override
    public String toString() {
        String out = super.toString();
        out += "Ma fonction est " + fonction + ". ";
        return out;
    }
}
