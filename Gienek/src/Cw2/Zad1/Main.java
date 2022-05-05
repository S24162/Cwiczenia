package Cw2.Zad1;

import java.time.Clock;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Vehicle bmw=new Vehicle();
        //bmw.setName("bmw8");
        bmw.addWheels(2);
        //bmw.setCreationDate(LocalDate.now());




        System.out.println(bmw.getName()+" "+bmw.getCreationDate()+" "+ bmw.getWheels() +" "+ bmw.getBrand() +" "+bmw.getInsurance());
        //System.out.println(audi.getBrand() +" "+ audi.getName() +" "+ audi.getWheels() +" "+audi.getCreationDate());

    }

}
