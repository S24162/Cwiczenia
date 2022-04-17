package g11c.cw1.zad3;

import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[3];

        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        if(arr[0] > arr[1] && arr[0] > arr[2])
        {
            int tmp = arr[2];
            arr[2] = arr[0];
            arr[0] = tmp;
        }
        if(arr[1] > arr[0] && arr[1] > arr[2])
        {
            int tmp = arr[2];
            arr[2] = arr[1];
            arr[1] = tmp;
        }
        if(arr[0] > arr[1])
        {
            int tmp = arr[0];
            arr[0] = arr[1];
            arr[1] = tmp;
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

    }

}
