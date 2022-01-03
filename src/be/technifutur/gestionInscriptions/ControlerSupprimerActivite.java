package be.technifutur.gestionInscriptions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class ControlerSupprimerActivite implements Callable {

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

        for ( Map.Entry<String, ActivityType> temp : lat.getDicoActivity().entrySet()) {
            av.affichageNomActivite(temp.getKey());
        }

        String nomActivity = av.saisirNomActivity();
        ActivityType present = lat.get(nomActivity);

        if (present != null) {
            av.affichageSuppression(lat.remove(present.getName()));
        } else {
            av.affichageErreurPasPresent(present.getName());
        }

        return null;
    }
}
