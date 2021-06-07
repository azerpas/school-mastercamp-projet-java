package com.coureur;

import java.util.List;

public class Course {
    /**
     * Liste des coureurs ordonnée en fonction du classement provisoire
     */
    private List<Coureur> coureurs;
    private List<Arrivee> arrivees;
    private List<Abandon> abandons;

    public float getEcart(Coureur c1, Coureur c2){
        return Math.abs(c1.getTemps() - c2.getTemps());
    }


    public List<Coureur> getCoureurs() {
        return this.coureurs;
    }

    public void setCoureurs(List<Coureur> coureurs) {
        this.coureurs = coureurs;
    }

    public void addCoureur(Coureur coureur) {
        this.coureurs.add(coureur);
    }

    public List<Arrivee> getArrivees() {
        return this.arrivees;
    }

    public void setArrivees(List<Arrivee> arrivees) {
        this.arrivees = arrivees;
    }

    public List<Abandon> getAbandons() {
        return this.abandons;
    }

    public void setAbandons(List<Abandon> abandons) {
        this.abandons = abandons;
    }

}