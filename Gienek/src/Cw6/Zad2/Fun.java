package Cw6.Zad2;

import java.util.ArrayList;
import java.util.Collections;

public interface Fun {

    double f (double x);

    static double minimum (Fun func, double a, double b, double alpha){
        ArrayList<Double> list = new ArrayList<>();
        for (double i = a; i<=b; i = i+alpha){
            list.add(func.f(i));
        }
        Collections.sort(list);

        if (alpha==1)
            System.out.println(list.get(0));
        return list.get(0);
    }
}
