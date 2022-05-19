package Cw3.Zad2;

import java.util.ArrayList;
import java.util.UUID;

public class ShoppingCart {
    private String id= String.valueOf(UUID.randomUUID());
    private ArrayList<Products> currentCartList=new ArrayList<>();

    public String getId() {
        return id;
    }
    public ArrayList<Products> getCurrentCartList (){
        return  currentCartList;
    }

    public void infoCurrentCartList(){
        System.out.println(" Current cart list : ");
        currentCartList.forEach(Products -> System.out.println(Products.getName() +" | Qty : "+ Products.getQuantity()) );

    }

    public double totalPrice(){

        return 0;
    }
    public int totalDeliveryTime(){
        return 0;
    }

    public void Sell(){}
}
