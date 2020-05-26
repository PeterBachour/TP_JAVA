package com.company;

import java.util.ArrayList;

public class Formation {

    private ArrayList<Cours> listeCours;
    private String code_Formation;
    private String nom_Formation;

    public Formation(String code_Formation, String nom_Formation) {
        this.code_Formation = code_Formation;
        this.nom_Formation = nom_Formation;
        listeCours = new ArrayList<Cours>();
    }

    public ArrayList<Cours> getListeCours() {
        return listeCours;
    }

    public void setListeCours(ArrayList<Cours> listeCours) {
        this.listeCours = listeCours;
    }

    public void addCours(Cours cours){
        listeCours.add(cours);
    }

    public void removeCours(int index){
        listeCours.remove(index);
    }

    public String getCode_Formation() {
        return code_Formation;
    }

    public void setCode_Formation(String code_Formation) {
        this.code_Formation = code_Formation;
    }

    public String getNom_Formation() {
        return nom_Formation;
    }

    public void setNom_Formation(String nom_Formation) {
        this.nom_Formation = nom_Formation;
    }

    @Override
    public String toString() {
        String out = "La formation [" + code_Formation + "] est intitulée " + nom_Formation +
                " et est constituée des cours suivants: \r\n";
            for(Cours cours : listeCours){
                out += cours;
            }
        return out;
    }
}
