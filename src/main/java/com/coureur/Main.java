package com.coureur;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
    }

    public static int menu(){
        ArrayList<Integer> choices = new ArrayList<Integer>();
        System.out.println("0. Quitter le programme");
        System.out.println("1. Afficher les coureurs");
        System.out.println("2. Afficher le classement provisoire");
        System.out.println("3. Enregistrer une arrivée");
        System.out.println("4. Enregistrer un abandon");
        System.out.println("5. Enregistrer une disqualification");
        System.out.println("6. Enregistrer le temps d’arrivée d’un coureur");
        System.out.println("7. Obtenir le temps d’un coureur");
        System.out.println("8. Obtenir l’écart de temps entre deux coureurs donnés");
        int x = -1;
        Scanner scan = new Scanner(System.in); 
        while (!choices.contains(x)) {
            System.out.print("Donnez une valeur entre 0 et 8 compris: ");
            x = scan.nextInt();
        }
        scan.close();
        return x;
    }
}