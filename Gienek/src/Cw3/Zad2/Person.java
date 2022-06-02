package Cw3.Zad2;


import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

class Person {
    private String name , surname;
    private double moneyInCash , moneyOnCard;

    private ShoppingCart currentCart =new ShoppingCart();

    public Person ( String name, String surname, double moneyInCash, double moneyOnCard) {
        this.name=name; this.surname=surname;this.moneyInCash=moneyInCash; this.moneyOnCard=moneyOnCard;
        ShoppingCart.setLicznik();
    }

//getters and setters

    public ShoppingCart getCurrentCart(){
        return currentCart;
    }

    public void setMoneyOnCard(double moneyOnCard) {        this.moneyOnCard = moneyOnCard;    }
    public double getMoneyOnCard(){ System.out.println( name +" balance is : "+moneyOnCard); return moneyOnCard;  }

//class methods

    public void MakeOrder(StorageName name, int quantity, Storage storage) {

        double price=0;

        for (int i=0;i<storage.getProductsList().size();i++){

            if (storage.getProductsList().get(i).getName().equals(name)){
                price = storage.getProductsList().get(i).getPrice();
            };

        }

        Products order = new Products(name,quantity,price);
        order.setPrice(price);
        currentCart.getCurrentCartList().add(order);

    }

    public void buyByCard (Storage storage) {

        boolean b = checkAvailability(storage);
        if (b&&moneyOnCard>totalPrice()) {
            moneyOnCard=moneyOnCard-totalPrice();
            currentCart.Sell(storage);
            System.out.println(name + " : operation completed.");
            AddToHistory();
        }
        else System.out.println(name + " : operation could not be completed");
    }

    public void buyInCash (Storage storage) {
        boolean b = checkAvailability(storage);
        if (b&&moneyInCash>totalPrice()) {
            moneyInCash=moneyInCash-totalPrice();
            currentCart.Sell(storage);
            System.out.println(name + " : operation completed.");
            AddToHistory();
        }
        else System.out.println(name + " : operation could not be completed");
    }


    private boolean checkAvailability(Storage storage) {

        boolean b=true;
        for (int i = 0; i < currentCart.getCurrentCartList().size(); i++) {
            for (int j = 0; j < storage.getProductsList().size(); j++) {
                if (currentCart.getCurrentCartList().get(i).getName().equals(storage.getProductsList().get(j).getName())) {
                    if (currentCart.getCurrentCartList().get(i).isAvailable(currentCart.getCurrentCartList().get(i).getQuantityAll(), storage.getProductsList().get(j))) {
                    } else b = false;
                }
            }
        }
        return b;
    }

    public double totalPrice(){

        AtomicReference<Double> price = new AtomicReference<>((double) 0);
        currentCart.getCurrentCartList().forEach(Products -> price.set(price.get() + Products.getQuantityAll() * Products.getPrice()));
        return price.get();
    }

    public void infoCurrentCart(Storage storage){

        System.out.println();
        System.out.println("  Person : ");
        System.out.println(this.name + " , "+ this.surname +  " (Cart ID : " + currentCart.getId() + ")");
        System.out.println("Money on card : " + moneyOnCard + " | " + "Money in cash : " + moneyInCash);
        System.out.println("  Current cart list : ");
        currentCart.getCurrentCartList().forEach(Products -> System.out.println(Products.getName() +" | Qty : "+ Products.getQuantityAll()
                +" | Price : "+ Products.getPrice()));
        System.out.println("      Total price : " + totalPrice());
        System.out.println("      Total delivery time : " + currentCart.totalDeliveryTime(storage));
    }
    public void infoActualBalance (){
        System.out.println("---------Balance info ---------");
        System.out.println(name + " | Money on card: " + moneyOnCard + "  Money in cash: " + moneyInCash);
        System.out.println();
    }
    public void AddToHistory(){
        System.out.println("I do not know how to do copy or clone or something like ' historia zamówień Person ' and do not have enough time for self home self-studying. :( ");
        currentCart.getCurrentCartList().clear();
    }
}
