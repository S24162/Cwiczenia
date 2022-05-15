package Cw2.Zad5;

import java.util.Scanner;

public class Adress {
    private String country,city,street;
    private int house,flat;

    public String getCountry() {        return country;    }
    public void setCountry(String country) {        this.country = country;    }

    public String getCity() {        return city;    }
    public void setCity(String city) {        this.city = city;    }

    public String getStreet() {        return street;    }
    public void setStreet(String street) {        this.street = street;    }

    public int getHouse() {        return house;    }
    public void setHouse(int house) {        this.house = house;    }

    public int getFlat() {        return flat;    }
    public void setFlat(int flat) {        this.flat = flat;    }

    public void setAdress (){
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println(" Country city street house flat || With ENTER after every word or number");
        this.country=sc.nextLine();
        this.city=sc.nextLine();
        this.street=sc.nextLine();
        this.house= sc.nextInt();
        this.flat= sc.nextInt();
    }

    public void setAdress (String country,String city, String street,int house,int flat){
        this.country= country;
        this.city= city;
        this.street= street;
        this.house= house;
        this.flat= flat;

    }

    public void adressDate(Person person){
        System.out.println(person.getSurname());
        System.out.println(country + " " +city + " st. " + street + " " + house + "/" + flat); }

}
