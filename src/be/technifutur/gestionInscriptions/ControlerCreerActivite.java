package be.technifutur.gestionInscriptions;

import java.util.concurrent.Callable;

public class ControlerCreerActivite implements Callable {
    
    ActivityVue av;
    ListActivityType lat;

    public void setVue(ActivityVue activityVue) {
        av = activityVue;
    }

    public void setModel(ListActivityType listActivityType) {
        lat = listActivityType;
    }

    @Override
    public Object call() throws Exception {

        String nomActivity = "";

    nomActivity = av.saisirNomActivity();
    ActivityType present = lat.get(nomActivity);

    if (present != null) {
        av.affichageDescriptifActivite(present);
        av.messageErreurDejaPresent();
    } else {
        String inscriptionActivity = av.saisirInscriptionActivity();
        boolean binscriptionActivity = false;
        if (inscriptionActivity.charAt(0) == 'O' || inscriptionActivity.charAt(0) == 'o')
            binscriptionActivity = true;
        lat.addActivityType(nomActivity, binscriptionActivity);
        av.affichageDescriptifActivite(lat.get(nomActivity));
    }
//}
        return null;
    }


}
