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
        String nomActivity = av.saisirNomActivity();
        System.out.println("Bonjour" + nomActivity);
        String inscriptionActivity = av.saisirInscriptionActivity();
        boolean binscriptionActivity = false;
        if(inscriptionActivity.charAt(0) == 'O' || inscriptionActivity.charAt(0) == 'o')
            binscriptionActivity = true;




        return null;
    }


}
