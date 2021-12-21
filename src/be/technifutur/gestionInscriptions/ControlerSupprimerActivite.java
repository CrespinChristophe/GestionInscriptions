package be.technifutur.gestionInscriptions;

import java.util.concurrent.Callable;

public class ControlerSupprimerActivite implements Callable {

    private ActivityVue av;
    private ListActivityType lat;

    public ActivityVue getAv() {
        return av;
    }

    public void setAv(ActivityVue av) {
        this.av = av;
    }

    @Override
    public Object call() throws Exception {

        return null;
    }
}
