package be.technifutur.gestionInscriptions;

import java.util.Scanner;

public class ActivityVue {

    public String saisirNomActivity() {
        System.out.println("Entrez le nom d'une activité : ");
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();

        return nom;
    }


    public String saisirInscriptionActivity() {
        System.out.println("Faut-il s'inscrire pour participer à cette activité ?");
        Scanner sc = new Scanner(System.in);
        String nom = sc.nextLine();
        return nom;
    }
}
