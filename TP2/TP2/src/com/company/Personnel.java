package com.company;

public class Personnel extends Personne {

    private String service;

    public Personnel() {
        super();
        this.service = "inconnu";
    }

    public Personnel(String nom, String prenom, int age, String service) {
        super(nom, prenom, age);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void afficherAge() {
        System.out.println("Ce personnel a " + age + " an(s)");
    }

    public void afficherPrenom() {
        System.out.println("Ce personnel s'appelle: " + prenom);
    }


    @Override
    public String toString() {
        String out = super.toString();
        out += "Mon service est " + service + ". ";
        return out;
    }
}
