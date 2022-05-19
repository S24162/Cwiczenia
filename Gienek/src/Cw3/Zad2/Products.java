package Cw3.Zad2;

public class Products {
    private String name;
    private ProductType productType;
    private double price;
    private int quantity;

    public Products(String name,ProductType productType, double price, int quantity){
        this.name=name; this.productType=productType; this.price=price; this.quantity=quantity;
    }

//getters and setters of variables
    public String getName() {        return name;    }
    public void setName(String name) {        this.name = name;    }

    public ProductType getProductType() {        return productType;    }
    public void setProductType(ProductType productType) {        this.productType = productType;    }

    public double getPrice() {        return price;    }
    public void setPrice(double price) {        this.price = price;    }

    public int getQuantity() {        return quantity;    }
    public void setQuantity(int quantity) {        this.quantity = quantity;    }

//class methods
    public boolean isAvailable(){
        return true;
    }

    public void Sell(){}
    public void IncreaseQuantity(int quantity){}
}
