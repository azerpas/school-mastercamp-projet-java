package com.coureur;

import java.util.Arrays;

public class Utils {
    public static void init(Course course){
        System.out.println("Pour chaque ligne, donnez le nom du coureur ou entrez 'q' pour quitter:");
        String x = "";
        int i = 1;
        Scanner scan = new Scanner(System.in); 
        while (x.trim() != "q") {
            x = scan.next();
            if(x.trim() != "q"){
                Coureur c = new Coureur(i, x.trim());
                course.addCoureur(c);
            }
            i++;
        }
        scan.close();
        if(course.getCoureurs().isEmpty()){
            System.out.println("⚠️ Ajoutez au moins un coureur");
            init(course);
        }
    }

    public static int menu(){
        ArrayList<Integer> choices = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8));
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