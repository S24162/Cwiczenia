package Cw7;

import java.util.ArrayList;

public class Orphanage {
    String name;
    private Location location;
    private ArrayList<Child> woolsOrphanage = new ArrayList<>();

//Getters and Setters

    public Location getLocation() {
        return location;
    }


//Methods

    public Orphanage (String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public void addChild (Child child) {
        woolsOrphanage.add(child);
        child.location = Location.London;
    }

}
