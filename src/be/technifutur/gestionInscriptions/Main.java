package be.technifutur.gestionInscriptions;

public class Main {
    public static void main(String[] args) throws Exception {
        ListActivityType listActivityType = new ListActivityType();
        ActivityVue activityVue = new ActivityVue();
        ControlerCreerActivite controleurCreerActivite = new ControlerCreerActivite();
        controleurCreerActivite.setVue(activityVue);
        controleurCreerActivite.setModel(listActivityType);
        controleurCreerActivite.call();
        ControlerModifierActivite.setVue(activityVue);
        ControlerModifierActivite.setModel(listActivityType);
        //essais

    }
}
