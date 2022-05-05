package Cw3.Zad1;

import java.util.ArrayList;
import java.util.List;

public class RailwayStation {

    private String name;
    private int platformsNumber;
    public List<Train> trains = new ArrayList<>();

    public RailwayStation(String name) {
        setName(name);
        this.platformsNumber = 3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty())
        {
            throw new RuntimeException("name cannot be null");
        }
        this.name = name;
    }

    public int getPlatformsNumber() {
        return platformsNumber;
    }

    public void increaseTracks(int platformsNumber) {
        if(platformsNumber < 0)
        {
            throw new RuntimeException("cannot be less than 0 platforms");
        }
        this.platformsNumber += platformsNumber;
    }

    public void launchTrain(String name)
    {
        if(trains.size() < platformsNumber) {
            trains.add(new Train(name));
        }
    }


}
