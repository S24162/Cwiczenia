package Cw3.Zad2;

import java.util.ArrayList;

public class Storage {
    private static int deliveryTime;
    private ArrayList<Products> productsList = new ArrayList<>();

//getters and setters

    public ArrayList<Products> getProductsList() {        return productsList;    }

//class methods

    public static int calcDeliveryTime(ArrayList<Products> currentCartList, ArrayList<Products> productsList) {
        Storage.deliveryTime=2;
        String deliveryFrom="      Send from Rzeszow";

        for (int i = 0; i < currentCartList.size(); i++) {

            for (int j = 0; j < productsList.size(); j++) {

                if(currentCartList.get(i).getName().toString().equals(productsList.get(j).getName().toString())) {

                    if (currentCartList.get(i).getQuantityAll() > productsList.get(j).getAtRZ()) {
                        deliveryTime = 7;
                        deliveryFrom = "      Send from Ramstein";
                    }
                    if (currentCartList.get(i).getQuantityAll() > productsList.get(j).getQuantityAll()) {
                        deliveryTime = 0;
                        deliveryFrom = "      That quantity is not available";
                    }
                }
            }
        }
        System.out.println(deliveryFrom);
        return deliveryTime;
    }

        public void infoProductList() {
            System.out.println();
            System.out.println("At storage :");
            productsList.forEach(Products -> System.out.println(Products.getName().toString() + " | "
                    + Products.getProductType().toString() + " | " + " Price : " + Products.getPrice() + " | quantity : "
                    + Products.getQuantityAll() + " | at Ramstein : " + Products.getAtRS() + " | at Rzeszow : " + Products.getAtRZ()));
        }
}
