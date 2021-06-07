package com.coureur;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Course course = new Course();
        Utils.init(course);
        int choix = Utils.menu();
        switch (choix) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println(course.getCoureurs().toString());
                break;
            case 2:
                System.out.println(course.getCoureurs().toString());
                break;
            case 3: 
                int x = -1;
                Scanner scan = new Scanner(System.in);
                System.out.println("Entrez le numéro du dossard du coureur: ");

            default:
                break;
        }
    }

    
}