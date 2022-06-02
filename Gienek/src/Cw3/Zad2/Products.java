package Cw3.Zad2;

import java.util.ArrayList;

public class Products {
    private StorageName name;
    private ProductType productType;
    private double price;
    private int quantityAll;
    private int atRS,atRZ;

    private ArrayList<Products> productsList = new ArrayList<>();

    public ArrayList<Products> getProductsList() {
        return productsList;
    }

    public Products(StorageName name, ProductType productType, double price, int atRS, int atRZ) {
        this.name=name; this.productType=productType; this.price=price; this.atRS=atRS; this.atRZ=atRZ;
        this.quantityAll=atRS+atRZ;

        //
        productsList.add(this);
    }

    public Products(StorageName name,int quantity, double price){
        this.name=name; this.quantityAll=quantity;
    }


//getters and setters


    public ProductType getProductType() {        return productType;    }

    public StorageName getName() {        return name;    }

    public double getPrice() {        return price;    }
    public void setPrice(double price) {        this.price = price;    }

    public int getQuantityAll() {        return quantityAll;    }
    public void setQuantityAll(int newQuantity){
        this.quantityAll=newQuantity;
    }

    public int getAtRS() {        return atRS;    }
    public void setAtRS(int atRS) {        this.atRS = atRS;    }

    public int getAtRZ() {        return atRZ;    }
    public void setAtRZ(int atRZ) {        this.atRZ = atRZ;    }

    //class methods

    public boolean isAvailable( int quantity,Products name){
        if (quantity>name.quantityAll) {
            System.out.println(name.name.toString() + " in the amount of "+ quantity + " is not available");
            return false;}
        else return true;

    }

    public void Sell(int quantity,Products name) {

        if (quantity < name.atRZ) {;
            name.atRZ = name.atRZ - quantity;
            name.quantityAll = name.quantityAll - quantity;
        }
        else
        if (quantity > atRZ) {
            name.atRZ=0;
            name.atRS = name.quantityAll - quantity;
            name.quantityAll = name.quantityAll - quantity;
        }
    }

    public void IncreaseQuantity(int quantity,StorageName name){
        if (name.equals(StorageName.Rzeszow)){
        setAtRZ(getAtRZ()+quantity);
        setQuantityAll(getAtRZ()+getAtRS());
        }
        else {
            setAtRS(getAtRS()+quantity);
            setQuantityAll(getAtRZ()+getAtRS());
        }
    }


}
