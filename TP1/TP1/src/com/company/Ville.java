package com.company;

public class Ville {

    private String nom;
    private double superficie;
    private int population;

    public Ville() {
        this.nom = "inconnu";
        this.superficie = 0;
        this.population = 0;
    }

    public Ville(String nom, double superficie, int population) {
        this.nom = nom;
        this.superficie = superficie;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean estIdentiqueA(Ville ville){
        if(this.nom == ville.nom &&
                this.population == ville.population &&
                this.superficie == ville.superficie )
            return true;
        return false;
    }
    public static boolean sontIdentiques(Ville ville1, Ville ville2){
        if(ville1.nom == ville2.nom &&
                ville1.population == ville2.population &&
                ville1.superficie == ville2.superficie )
            return true;
        return false;
    }

    @Override
    public String toString() {
        return nom + ", " +
                superficie + " kilomètres carrés, pour " +
                population + " habitants.";
    }
}
