package Cw3.Zad1;

public class Car {

    private int weight;
    private Car car;

    public Car(int weight) {
        setWeight(weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight < 0)
        {
            throw new RuntimeException("weight cannot be negative");
        }
        this.weight = weight;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", car=" + car +
                '}';
    }
}
