package be.technifutur.gestionInscriptions;

public class Main {
    public static void main(String[] args) throws Exception {
        ListActivityType listActivityType = new ListActivityType();
        ActivityVue activityVue = new ActivityVue();
        ControlerCreerActivite controlerCreerActivite = new ControlerCreerActivite();
        controlerCreerActivite.setVue(activityVue);
        controlerCreerActivite.setModel(listActivityType);
        controlerCreerActivite.call();
        ControlerSupprimerActivite controlerSupprimerActivite = new ControlerSupprimerActivite();
        controlerSupprimerActivite.setVue(activityVue);
        controlerSupprimerActivite.setModel(listActivityType);
        controlerSupprimerActivite.call();
        ControlerModifierActivite controlerModifierActivite = new ControlerModifierActivite();
        controlerModifierActivite.setVue(activityVue);
        controlerModifierActivite.setModel(listActivityType);
        controlerModifierActivite.call();

    }
}
