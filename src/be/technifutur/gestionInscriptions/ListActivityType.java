package be.technifutur.gestionInscriptions;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class ListActivityType implements Serializable {

    //Map<String, String> activityMap;

    public ActivityType addActivityType (String name, boolean registrationRequired ) {

        Map<String, String> activityMap = new TreeMap<>();

        return at;
    }

    public ActivityType get(String name) {
        return this.name;
    }

    public ActivityType remove(String name) {
        return this.name;
    }

    @Override
    public String toString() {
        return "ListActivityType{}";
    }
}
