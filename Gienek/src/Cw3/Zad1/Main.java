package Cw3.Zad1;

public class Main {

    public static void main(String[] args) {
        RailwayStation rs = new RailwayStation("name");
        rs.launchTrain("train1");
        rs.launchTrain("train2");
        rs.trains.get(0).AddCar(1);
        rs.trains.get(0).AddCar(1);
        rs.trains.get(0).AddCar(1);
        rs.trains.get(0).AddCar(1);

        System.out.println(rs.trains.toString());
        System.out.println(rs.trains.get(0).getWeight());
    }

}
