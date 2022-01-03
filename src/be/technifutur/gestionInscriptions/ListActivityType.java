package be.technifutur.gestionInscriptions;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class ListActivityType implements Serializable {

    private Map<String, ActivityType> dicoActivity = new TreeMap<>();

    public ActivityType addActivityType (String name, boolean registrationRequired ) {
        ActivityType activityType = new ActivityType(name, registrationRequired);
        dicoActivity.put(name, activityType);
        return activityType;
    }

    public Map<String, ActivityType> getDicoActivity() {
        return dicoActivity;
    }

    public ActivityType get(String name) {
        return dicoActivity.get(name);//renvoit la value d'après la clé
    }

    public ActivityType remove(String name) {
        ActivityType at = dicoActivity.get(name);
        dicoActivity.remove(name);
        return at;
    }

    @Override
    public String toString() {
        return "ListActivityType{}";
    }
}
