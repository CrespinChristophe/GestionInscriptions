package be.technifutur.gestionInscriptions;

public class Main {
    public static void main(String[] args) throws Exception {
        ListActivityType listActivityType = new ListActivityType();
        ActivityVue activityVue = new ActivityVue();
        ControlerCreerActivite controlerCreerActivite = new ControlerCreerActivite();
        controlerCreerActivite.setVue(activityVue);
        controlerCreerActivite.setModel(listActivityType);
        controlerCreerActivite.call();
        ControlerModifierActivite.setVue(activityVue);
        ControlerModifierActivite.setModel(listActivityType);

    }
}
