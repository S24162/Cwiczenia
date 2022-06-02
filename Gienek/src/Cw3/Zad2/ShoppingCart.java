package Cw3.Zad2;

import java.time.LocalDate;
import java.util.ArrayList;


public class ShoppingCart implements Cloneable{

    private int id=licznik;
    private static int licznik = LocalDate.now().getDayOfYear()*1000;

    private ArrayList<Products> currentCartList = new ArrayList<>();

//getters and setters of variables

    public int getId() {        return id;    }
    public static void setLicznik() {licznik++;}

    public ArrayList<Products> getCurrentCartList() {        return currentCartList;    }

    //class methods


    public int totalDeliveryTime(Storage storage){
        return (Storage.calcDeliveryTime(currentCartList,storage.getProductsList()));
    }

    public void Sell(Storage name){
        for(int i=0;i<currentCartList.size();i++) {
            for (int j=0; j<name.getProductsList().size();j++) {
                if (currentCartList.get(i).getName().equals(name.getProductsList().get(j).getName())) {
                    currentCartList.get(i).Sell(currentCartList.get(i).getQuantityAll(),name.getProductsList().get(j));
                }
            }
        }
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
