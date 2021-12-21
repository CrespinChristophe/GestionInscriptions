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

    public ActivityType get(String name) {
        return dicoActivity.get(name);
    }

    public ActivityType remove(String name) {
        return null;
    }

    @Override
    public String toString() {
        return "ListActivityType{}";
    }
}
