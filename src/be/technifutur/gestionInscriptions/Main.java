package be.technifutur.gestionInscriptions;

public class Main {
    public static void main(String[] args) throws Exception {
        ListActivityType listActivityType = new ListActivityType();
        ControlerCreerActivite controleurCreerActivite = new ControlerCreerActivite();
        ActivityVue activityVue = new ActivityVue();
        controleurCreerActivite.setVue(activityVue);
        controleurCreerActivite.setModel(listActivityType);
        controleurCreerActivite.call();
        ControlerModifierActivite.setVue(activityVue);
        ControlerModifierActivite.setModel(listActivityType);

    }
}
