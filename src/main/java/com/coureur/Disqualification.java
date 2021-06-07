package com.coureur;

public class Disqualification{
    private final MOTIF motif;
    private final Coureur coureur;

    public Disqualification(MOTIF motif, Coureur coureur) {
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