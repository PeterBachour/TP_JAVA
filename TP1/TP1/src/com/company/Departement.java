package com.company;

import com.company.Ville;

public class Departement {

    private String nom;
    private int numero;
    private int nbVillesSaisies;
    private int nbVilles;
    private Ville tabVilles[];

    public Departement() {
        this.nom = "inconnu";
        this.numero = 0;
        this.nbVillesSaisies = 0;
        this.nbVilles = 0;
        this.tabVilles = new Ville[nbVilles];
    }

    public Departement(String nom, int numero, int nbVilles) {
        this.nom = nom;
        this.numero = numero;
        this.nbVillesSaisies = 0;
        this.nbVilles = nbVilles;
        this.tabVilles = new Ville[nbVilles];
    }

    public void ajouterVille(Ville ville){
        if(this.nbVillesSaisies < this.nbVilles){
            tabVilles[this.nbVillesSaisies] = ville;
            this.nbVillesSaisies++;
        }else{
            System.out.println("Le département a atteint le nombre " +
                    "maximale de ville accordées. \r\nLa ville de " + ville.getNom() +
                    " ne pourra pas etre ajouter à ce département.");
        }
    }

    @java.lang.Override
    public java.lang.String toString() {
        String x=  "Villes du département " + nom + "(" + numero + ") : \r\n" ;
        for (int i = 0; i < tabVilles.length; i++) {
            x+= (i+1) + " " + tabVilles[i] + "\r\n";
        };
        return x;
    }
}
