package Cw3.Zad2;


public class Main {
    public static void main(String[] args) {
        // Declare of products and persons

        Products howitzer_m777=new Products("Howitzer", ProductType.Entertainment,1000,90);
        Products shell_M107=new Products("Standard High Explosive",ProductType.Consumable,15,1000);
        Products shell_M549=new Products("High-Explosive Rocket Assisted",ProductType.Consumable,20,1000);
        Products shell_M982=new Products("Excalibur",ProductType.Consumable,10,1000);

        Person facet=new Person("Ukrainian","Zły",10000, 50000);

        // Operatons

        facet.makeOrder(howitzer_m777,2);
        facet.makeOrder(shell_M107,50);
        facet.makeOrder(shell_M982,20);



        // Testing out

        facet.getCurrentCart().infoCurrentCartList();

        System.out.println("______________");
        System.out.println(facet.getCurrentCart().getCurrentCartList().size());
        facet.getCurrentCart().getCurrentCartList().forEach(products -> System.out.println(products.getName() + products.getQuantity()));
        System.out.println(facet.getCurrentCart().getCurrentCartList().get(0).getName());

    }
}
