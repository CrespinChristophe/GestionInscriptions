package be.technifutur.gestionInscriptions;

import java.util.concurrent.Callable;

public class ControlerModifierActivite implements Callable {

    private ActivityVue av;
    private ListActivityType lat;

    public void setVue(ActivityVue activityVue) {
        av = activityVue;
    }

    public void setModel(ListActivityType listActivityType) {
        lat = listActivityType;
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
