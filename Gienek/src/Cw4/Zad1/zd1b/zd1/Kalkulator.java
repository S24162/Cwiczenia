package Cw4.Zad1.zd1b.zd1;

public class Kalkulator {

    public int multiplier;
    public static int staticMultiplier;

    public static int add(int a, int b) {
        return (a + b) * staticMultiplier;
    }

    public static double add(double a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static String add(int a, String b) {
        return a + b;
    }


        public static void main(String[] args) {
            //
            Kalkulator kalkulator = new Kalkulator();
            kalkulator.multiplier = 5;
            System.out.println(kalkulator.add(2, 2));
            System.out.println(kalkulator.add(2.5, 2.5));
            System.out.println(kalkulator.add("Hello", " world"));
            System.out.println(kalkulator.add(2, " words"));
            System.out.println();
            Kalkulator kalkulator2 = new Kalkulator();
            kalkulator2.multiplier = 10;
            System.out.println(kalkulator2.add(2, 2));
            //
            Kalkulator.staticMultiplier = 5;
            System.out.println();
            System.out.println(Kalkulator.add(2, 2));
            System.out.println(Kalkulator.add(2.5, 2.5));
            System.out.println(Kalkulator.add("Hello", " world"));
            System.out.println(Kalkulator.add(2, " words"));
        }

    }


