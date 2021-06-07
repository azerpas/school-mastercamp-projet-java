package com.coureur;

public class Arrivee{
    private final float temps;
    private final Coureur coureur;

    public Arrivee(float temps, Coureur coureur) {
        this.temps = temps;
        this.coureur = coureur;
    }

    public float getTemps() {
        return this.temps;
    }

    public Coureur getCoureur() {
        return this.coureur;
    }
}