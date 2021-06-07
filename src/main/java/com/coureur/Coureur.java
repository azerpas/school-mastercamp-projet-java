package com.coureur;

public class Coureur {
    private final int id;
    private final String nom;
    private float temps;

    public Coureur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return this.id;
    }

    public String getNom() {
        return this.nom;
    }

    public float getTemps() {
        return this.temps;
    }

    public void setTemps(float temps) {
        this.temps = temps;
    }
    
}