package Cw4.Zad1.zd1a;

import java.util.ArrayList;
import java.util.List;

public class Kalkulator {

    public int multiplier;
    public static int stmultiplier;

    public Kalkulator(int mult)
    {
        multiplier = mult;
    }

    public int add(int a, int b, int c) {
        return (a + b + c)*multiplier;
    }

    public String add(String a, String b, String c)
    {
        return a + b + c + multiplier;
    }

    public static int add(int a, int b) {
       return a + b  * stmultiplier;
    }

    public static double add(double a, double b)
    {
        return a + b;
    }

    public static String add(String a, String b)
    {
        return a + b;
    }

    public static String add(int a, String b)
    {
        return a + b;
    }
}


class Main
{
    public static void main(String[] args) {

        List<Kalkulator> kalkulators = new ArrayList<>();
        for (int q = 0; q < 20; q++) {
            kalkulators.add(CreateKalk(q));
        }
        Kalkulator.stmultiplier = 2;
        for (int i = 0; i < 20; i++) {
            if(i == 10)
            {
                Kalkulator.stmultiplier = 5;
            }
            System.out.println(
                            kalkulators.get(i).add(1,1,1) + " " +
                            kalkulators.get(i).add(kalkulators.get(i).add(1,1),1)
            );
        }

/*        Kalkulator kalkulator = new Kalkulator(2);
        System.out.println(kalkulator.add(1,1,1));
        System.out.println(kalkulator.add("a","b","c"));



        Kalkulator kalkulator2 = new Kalkulator(4);
        System.out.println(kalkulator2.add(1,1,1));
        System.out.println(kalkulator2.add("a","b","c"));

        System.out.println(Kalkulator.add(2,2));
        System.out.println(Kalkulator.add(2.5,2.5));
        System.out.println(Kalkulator.add("Hello ","world"));
        System.out.println(Kalkulator.add(2, " words"));*/

    }

    public static Kalkulator CreateKalk(int mult)
    {
        Kalkulator kalkulator = new Kalkulator(mult);
        return kalkulator;
    }
}
