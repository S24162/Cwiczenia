package Cw3.Zad2;


public class Main {
    public static void main(String[] args) {
// Declare of products and persons

        Storage storage= new Storage();

        Products howitzer_m777=new Products(StorageName.Howitzer_M777, ProductType.Entertainment,1000,90,61);
        Products shell_M107=new Products(StorageName.shell_M107,ProductType.Consumable,10,1000,700);
        Products shell_M549=new Products(StorageName.shell_M549,ProductType.Consumable,20,1000,100);
        Products shell_M982=new Products(StorageName.shell_M982,ProductType.Consumable,100,900,1000);

        storage.getProductsList().add(howitzer_m777);
        storage.getProductsList().add(shell_M107);
        storage.getProductsList().add(shell_M549);
        storage.getProductsList().add(shell_M982);

        Person facet1=new Person("Ukrainian","Zły",50000, 300000);
        Person facet2=new Person("Moskal", "Głupi", 1300000, 150000);


// Operatons

        facet1.MakeOrder(StorageName.Howitzer_M777,70,storage);
        facet1.MakeOrder(StorageName.shell_M107,100,storage);
        facet1.MakeOrder(StorageName.shell_M549,200,storage);
        //facet1.MakeOrder(StorageName.shell_M982,300,storage);

        facet2.MakeOrder(StorageName.Howitzer_M777,90,storage);


// Testing out

        storage.infoProductList();

        //storage.infoProductList();
        facet1.infoCurrentCart(storage);
        facet1.buyByCard(storage);
        //shell_M982.IncreaseQuantity(1000,StorageName.Ramstein);

        facet1.infoCurrentCart(storage);

        facet2.buyInCash(storage);
        howitzer_m777.IncreaseQuantity(100,StorageName.Rzeszow);
        facet2.buyInCash(storage);
        facet2.infoActualBalance();

        //facet1.infoCurrentCart(storage);
        //facet1.MakeOrder(StorageName.Howitzer_M777,70,storage);
        //facet1.infoCurrentCart(storage);
        //facet1.buyInCash(storage);
        //buyByCard(storage);

        storage.infoProductList();
        facet1.infoCurrentCart(storage);

        //storage.infoProductList();
        //facet1.getMoneyOnCard();
        //facet2.getMoneyOnCard();
        //facet3.infoCurrentCart(storage);
        //facet3.getMoneyOnCard();

    }
}
