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
}