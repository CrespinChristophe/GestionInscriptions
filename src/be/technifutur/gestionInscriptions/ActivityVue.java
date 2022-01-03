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

    public void messageErreurDejaPresent () {
        System.out.println("Cette activité existe déjà !!!");
    }

    public void affichageDescriptifActivite (ActivityType at) {
        System.out.println(at);
    }

    public void affichageNomActivite (String s) {
        System.out.println(s);
    }

    public void affichageSuppression (ActivityType at) {
        System.out.println("L'activité " + at.getName() + " a été supprimée...");
    }

    public void affichageErreurPasPresent(String s) {
        System.out.println("L'activité " + s + " n'est pas présente...");
    }

}
