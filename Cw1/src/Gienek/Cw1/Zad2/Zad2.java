package g11c.cw1.zad2;

import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt(),
                b = scan.nextInt(),
                c = scan.nextInt();

        System.out.println(a + " " + b + " " + c);

        if(a > b && a > c)
        {
            int tmp = c;
            c = a;
            a = tmp;
        }
        if(b > a && b > c)
        {
            int tmp = c;
            c = b;
            b = tmp;
        }
        if(a > b)
        {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(a + " " + b + " " + c);

    }

}
