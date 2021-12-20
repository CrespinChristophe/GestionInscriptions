package be.technifutur.gestionInscriptions;

public class ActivityType {

    private String name;
    private boolean registration;

    public ActivityType (String name, boolean inscription) {
        this.name = name;
        this.registration = inscription;
    }

    public String getName() {
        return this.name;
    }

    public boolean isRegistrationRequired() {
        return b;
    }

    public void setName (String name) {
        this.name = name;
    }

}
