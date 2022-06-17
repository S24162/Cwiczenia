package Cw6.Zad2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {

        List<Function> functions = new ArrayList<>();

        functions.add(new LinearFunction(2,4));
        functions.add(new SquareFunction(2,0,-2.5));
        functions.add(new AbsoluteLinearFunction(2,4));

        List<Fun> funList = new ArrayList<>(functions);

        System.out.println("Original functions");
        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));
        functions.forEach(f -> f.increaseCoefficientsBy(1.2));

        System.out.println("Functions increased by 1.2");
        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));
        functions.forEach(f -> f.decreaseCoefficientsBy(1.2));

        System.out.println("Functions decreased by 1.2");
        funList.forEach(f ->
                System.out.println(df.format(Fun.minimum(f,-4,0,0.1))));

//        Test without implementation by class
        System.out.println();
        System.out.println("Test");

        System.out.println(Fun.minimum(functions.get(0),2,4,0.1));

//      ja wydobył wynik działania przez System.out dzięnki temu że statyczne metody możliwo używać without making klass.
//      I`m access the static method directly thrue Interface name and choose interface static
//      metod "minimum" , give already made object from list of functions, give a , b , alpha . metod
//      "mimimum" take from list of functions first element , which is  class LinearFunction
//       y=ax+b with a=2 and b=4, drove him through itself, calculate smallest Y and return it into System.out.

        System.out.println("--------");

//      Here i added If into interfaces metod "minimum" , whitch is react alpha = 1 and print function minimum
//      result by himself.

        Fun.minimum(functions.get(0),1,4,1);
    }
}
