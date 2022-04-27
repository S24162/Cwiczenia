package Cw2.Zad1;

public class Insurance {

    private String name;
    private int number;

    public Insurance(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //TODO checks
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        //TODO checks
        this.number = number;
    }
}
