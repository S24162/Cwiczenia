package Cw7;

import java.util.ArrayList;

abstract public class Character {
    protected String name ;
    protected Location location;
    String action;
    protected int health = 100;
    public static ArrayList<Character> statusList = new ArrayList<>();
    {statusList.add(this);}



    abstract Location getLocation();

//Methods

    public static void MoveAllTo(Location newLocation, Character name1, Character name2) {
        name1.location = newLocation;
        name2.location = newLocation;
    }
    
    public void moveTo (Location location){
        this.location = location;
    }

    public void moveTo (Orphanage orphanage){
        this.location = orphanage.getLocation();
    }
    
    public void introduce(){
        System.out.println("Hello, I am " + name);
    }
    
    public void say (String message, Character messageTo){
        System.out.println(this.name + " to " + messageTo.name);
        System.out.println("    " + message);
    }

    public void doSth (String action) {
        this.action = action;
        System.out.println("I am " + this.name +", I am " + this.action);
    }

    public static void doSth (String action, Character name1, Character name2, Character name3) {
        name1.action = action;
        name2.action = action;
        name3.action = action;
        System.out.println("I am " + name1.name + ", I am " + name1.action);
        System.out.println("I am " + name2.name + ", I am " + name2.action);
        System.out.println("I am " + name3.name + ", I am " + name3.action);
    }

    public static void status () {
        System.out.println("====Status====");
        for (Character ch : statusList)
            System.out.println(ch.name + " : " + ch.health);
        System.out.println("==============");
    }
}


abstract class Child extends Character {
    
    public Child() {}
    
    public Child (String name, Location location) {
        this.name= name;
        this.location = location;
    }
    
    @Override
    public Location getLocation() {
        return location;
    }
}

class Riddle extends Child {
    public Riddle (String name, Location location) {
        super(name, location);
    }
}

class Potter extends Child {
    public Potter (String name, Location location) {
        super(name, location);
    }
}

class Dumbledore extends Character{
    public Dumbledore (String name, Location location){
        this.name = name;
        this.location = location;
    }
    
    @Override
    public Location getLocation() {
        return location;
    }
}

class Voldemort extends Character {
    private int horcruxes;
    private ArrayList<Character> targets = new ArrayList<>();

    protected void target (Character character) {
        targets.add(character);
    }

    protected void castSpell (Spell name) {
        if (name == Spell.AvadaKedavra);
        for (int i=0; i<targets.size(); i++) {
            if (targets.get(i).name != "Harry"){
                targets.get(i).health = 0;
                System.out.println(targets.get(i).name + " died.");
            }
            else {
                this.health=0;
                System.out.println(targets.get(i).name + " goes LOL...");
                System.out.println(this.name + " died.");
            };
        }
    }

    public Voldemort (Character character){
        statusList.remove(character);
        this.name = "Lord Voldemort";
        this.location = character.location;

    }

    public void createHorcruxes (int numberOfHorcruxes) {
        horcruxes = horcruxes + numberOfHorcruxes;
    }
    public void printHorcruxes () {
        System.out.println("Created horcruxes:");
        for (int i=0; i<horcruxes; i++)
            System.out.println("    horcrux " + (i+1));
    }

    @Override
    Location getLocation() {
        return location;
    }
}

