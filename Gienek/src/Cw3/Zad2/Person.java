package Cw3.Zad2;


import java.util.ArrayList;

public class Person {
    private String name , surname;
    private double moneyInCash , moneyOnCard;

    public Person ( String name, String surname, double moneyInCash, double moneyOnCard) {
        this.name=name; this.surname=surname;this.moneyInCash=moneyInCash; this.moneyOnCard=moneyOnCard;
    }

    private ArrayList<ShoppingCart> historyCartList = new ArrayList<>();
    public ArrayList<ShoppingCart> getHistoryCartList(){
        return historyCartList;
    }

    private ShoppingCart currentCart =new ShoppingCart();
    public ShoppingCart getCurrentCart(){
        return currentCart;
    }

    public void makeOrder(Products name,int quantity){
        currentCart.getCurrentCartList().add(name);
        currentCart.getCurrentCartList().get(currentCart.getCurrentCartList().size()-1).setQuantity(quantity);

    }

    public void BuyByCard(){}
    public void BuyInCash(){}

}
