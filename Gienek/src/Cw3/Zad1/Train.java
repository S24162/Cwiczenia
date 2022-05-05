package Cw3.Zad1;

public class Train {

    private String name;
    private Car car;

    public Train(String name) {
        setName(name);
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

    public void AddCar(int weight) {

        if(car == null)
        {
            car = new Car(weight);
            return;
        }

        Car current = car;
        while (current.getCar() != null) {
            current = current.getCar();
        }
        current.setCar(new Car(weight));
    }

    public int getWeight() {
        if(car == null) {
            return 0;
        }
        int result = 0;
        Car current = car;
        while (current.getCar() != null) {
            result += current.getWeight();
            current = current.getCar();
        }
        result += current.getWeight();
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
