package Cw5.Zad2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

class Elixir {
    private String name;
    private boolean isCreated;
    private int power;

    private List<Ingredient> ingredients = new ArrayList<>();



    Elixir (String name){
        this.name=name;
    }
    void elixirInfo() {
        if (isCreated) {
            System.out.println("     Already mixed !");
            System.out.println("Elixir '" + this.name + "' with Power " +this.power);
            for (Ingredient i : ingredients)
                System.out.println(i.getName() + "  " + i.getReagent());
        }
        else {
            System.out.println("     This elixir is not mixed yet ! ");
            for (Ingredient i : ingredients)
                System.out.println(i.getName() + "  " + i.getReagent());
        }

    }

    void Create(){
        Water dissolvent = Water.waterCreate(LiquidName.Dissolvent);
        dissolvent.setName("Empty");
        dissolvent.dissolubility=10;

        for (Ingredient ing : ingredients){
            if (ing instanceof Water){
                dissolvent.setName(ing.getName());
                dissolvent.dissolubility=100;
            }
        }
        if (!dissolvent.isDistilated())
            for (Ingredient ing : ingredients) {
                if (ing instanceof Water && ((Water) ing).isDistilated()) {
                    dissolvent.setDistilated(true);
                    dissolvent.setName(ing.getName());
                }
            }

        if (!isCreated){
            ingredients.removeIf(next -> next instanceof Water);
            isCreated=true;

            for (Ingredient i : ingredients)
                power=power+i.getReagent();
            power=power*dissolvent.getReagent()/100;
        System.out.println("Elixir is created ");
        }
    }

    public void addIngredient ( Ingredient ingredient ){
        if (!this.isCreated)
        this.ingredients.add(ingredient);
        else throw new RuntimeException(" This elixir is already mixed ! ");
    }

    void removeIngredient ( Ingredient ingredient ){
        if (!this.isCreated){
            ingredients.removeIf(next -> next.getName().equals(ingredient.getName()));
        }
        else throw new RuntimeException(" This elixir is already mixed ! ");
    }
}


//Ingredients
abstract class Ingredient{
    private String name;
    protected static final int baseReagent=1;

    abstract int getReagent();
    void info () {
        System.out.println(name +  " | Toxicity or Power or Dissolubility : " + getReagent());
    }


    static Ingredient newFlower (PlantName name){
        Ingredient temp = Flower.flowerCreate(name);
        return temp;
    }

    static Ingredient newRoot (PlantName name){
        Ingredient temp = Root.rootCreate(name);
        return temp;
    }

    static Ingredient newOre (MineralName name){
        Ingredient temp = Ore.oreCreate(name);
        return temp;
    }

    static Ingredient newCrystal (MineralName name){
        Ingredient temp = Crystal.crystalCreate(name);
        return temp;
    }

    static Ingredient newWater (LiquidName name){
        Ingredient temp = Water.waterCreate(name);
        return temp;
    }

    static Ingredient newAlcohol (LiquidName name){
        Ingredient temp = Alcohol.alcoholCreate(name);
        return temp;
    }

//Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//Liquids
abstract class Liquid extends Ingredient {
    protected int dissolubility=100;

    abstract int getReagent();
}

class Water extends Liquid{
    private boolean distilated;

    private Water (){}
    public Water (String name){}

    static Water waterCreate (LiquidName name){
        Water temp = new Water();
        temp.setName(name.toString());

        if (name==LiquidName.WaterLaboratory)
            temp.distilated=true;

        return temp;
    }

    int getReagent(){
        if (!this.distilated)
            return dissolubility/2;
        else return dissolubility;
    }

    public boolean isDistilated() {
        return distilated;
    }

    public void setDistilated(boolean distilated) {
        this.distilated = distilated;
    }
}

class Alcohol extends Liquid{
    private int percent;

    private Alcohol (){}

    static Alcohol alcoholCreate (LiquidName name){

        Alcohol temp = new Alcohol();
        temp.setName(name.toString());

        if (name==LiquidName.Nemiroff) {
            temp.percent =  60 ;
        }
        if (name==LiquidName.Putinka) {
            temp.percent =  40 ;
        }

        return temp;
    }
    int getReagent(){
        return percent*dissolubility/100;
    }
}

//Minerals
abstract class Mineral extends Ingredient {
    private int power=10;

    abstract int getReagent();

//Getters and Setters

    public int getPower() {
        return power;
    }
}

class Ore extends Mineral{
    boolean metallic;

    private Ore(){}

    static Ore oreCreate(MineralName name){
        Ore temp = new Ore();
        temp.setName(name.toString());

        if (name==MineralName.OreDark)
            temp.metallic=true;

        return temp;
    }

    int getReagent(){
        if (!this.metallic)
        return getPower()/2;
        else return getPower();
    }

}

class Crystal extends Mineral{
    int magicPower;

    private Crystal (){}

    static Crystal crystalCreate(MineralName name){
        Crystal temp = new Crystal();
        temp.setName(name.toString());

        if (name==MineralName.CristalRed)
            temp.setMagicPower(9);
        if (name==MineralName.CrystalYellow)
            temp.setMagicPower(6);

        return temp;
    }

    int getReagent(){
        return getPower() + magicPower;
    }

//Getters and Setters

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
}


//Plants
abstract class Plants extends  Ingredient {
    private int toxicity;

//Getters and Setters

    public void setToxicity(int toxicity) {
        this.toxicity = toxicity;
    }

    public int getToxicity() {
        return toxicity;
    }
}

class Flower extends Plants {

    private  Flower(){}

    static Flower flowerCreate (PlantName name){
        Flower temp = new Flower();
        temp.setName(name.toString());

        if (name==PlantName.Rose)
            temp.setToxicity(10);
        if (name==PlantName.Phirna)
            temp.setToxicity(6);

        return temp;
    }

    @Override
    int getReagent(){
        return baseReagent * this.getToxicity() * 2;
    }
}

class Root extends Plants {

    private Root(){}

    static Root rootCreate (PlantName name){
        Root temp = new Root();
        temp.setName(name.toString());

        if (name==PlantName.Rose)
            temp.setToxicity(10);
        if (name==PlantName.Phirna)
        temp.setToxicity(6);

        return temp;
    }

    @Override
    int getReagent(){
        return baseReagent * this.getToxicity() / 2;
    }
}


class Main {
    public static void main (String[] args) {
        Ingredient roseFlower = Flower.newFlower(PlantName.Rose);
        Ingredient roseRoot = Root.newRoot(PlantName.Rose);
        Ingredient phirnaFlower = Ingredient.newFlower(PlantName.Phirna);
        Ingredient phirnaRoot = Root.newRoot(PlantName.Phirna);

        Ingredient crystalY = Crystal.newCrystal(MineralName.CrystalYellow);
        Ingredient crystalR = Crystal.newCrystal(MineralName.CristalRed);
        Ingredient moonStone = Ore.newOre(MineralName.OreMoon);
        Ingredient darkOre = Crystal.newOre(MineralName.OreDark);

        Ingredient waterLaboratory = Water.waterCreate(LiquidName.WaterLaboratory);
        Ingredient waterBrook = Water.waterCreate(LiquidName.WaterBrook);
        Ingredient nemiroff = Alcohol.alcoholCreate(LiquidName.Nemiroff);
        Ingredient putinka = Alcohol.alcoholCreate(LiquidName.Putinka);

//        roseFlower.info();
//        roseRoot.info();
//        phirnaFlower.info();
//        phirnaRoot.info();

//        crystalY.info();
//        crystalR.info();
//        moonStone.info();
//        darkOre.info();

//        waterLaboratory.info();
//        waterBrook.info();
//        nemiroff.info();
//        putinka.info();

        Elixir BluePortion = new Elixir("BluePortion");
        BluePortion.addIngredient(roseRoot);
        BluePortion.addIngredient(darkOre);
        BluePortion.addIngredient(waterBrook);
        BluePortion.addIngredient(waterLaboratory);
        BluePortion.addIngredient(darkOre);
        BluePortion.addIngredient(crystalR);

        BluePortion.elixirInfo();

        BluePortion.removeIngredient(darkOre);

        System.out.println("----------------------");
        BluePortion.Create();
        BluePortion.elixirInfo();
    }
}
