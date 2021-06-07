package com.coureur;

public class Abandon{
    private final MOTIF motif;
    private final Coureur coureur;

    public Abandon(MOTIF motif, Coureur coureur) {
        this.motif = motif;
        this.coureur = coureur;
    }

    public MOTIF getMotif() {
        return this.motif;
    }


    public Coureur getCoureur() {
        return this.coureur;
    }
}