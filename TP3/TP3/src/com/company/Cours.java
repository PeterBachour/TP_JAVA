package com.company;

public class Cours implements Comparable {

    private String code;
    private String intitule;
    private Double nbHeure;

    public Cours(String code, String intitule, Double nbHeure) {
        this.code = code;
        this.intitule = intitule;
        this.nbHeure = nbHeure;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return intitule;
    }

    public void setNom(String nom) {
        this.intitule = nom;
    }

    public Double getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(Double nbHeure) {
        this.nbHeure = nbHeure;
    }

    @Override
    public String toString() {
        return "Le cours [" + code + "] est intitulé \r\n" +
                code + " et consiste de " +
                nbHeure + " nombre d'heures. \r\n";
    }

    @Override
    public int compareTo(Object o) {
        String intitule = ((Cours)o).getNom();
        return this.intitule.compareTo(intitule);
    }
}
