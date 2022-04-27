package Gienek.Cw1.Zad6;

import java.util.Random;

public class Zad6 {
    public static void main(String[] args) {

        int[] arr=new int[10];

        for (int i=0;i< arr.length;i++){
            Random randomNum = new Random();
            arr[i] =100 + randomNum.nextInt(19)*50 ;
        }

        System.out.println();
        System.out.println("Random array:");
        arrPrint(arr);

        int[] arrSort=new int[arr.length];
        arrSort=sortedArr(arr);

        System.out.println();
        System.out.println("Sorted array:");
        arrPrint(arrSort);
    }

    public static void arrPrint(int[] array){
        for(int i=0;i< array.length;i++)
            System.out.print(array[i]+" ");
        System.out.println();
    }

    public static  int[] sortedArr (int[] arrIn){
        for(int i=0;i< arrIn.length;i++){

            for(int j=i+1;j < arrIn.length;j++){
                int tmp = 0;

                if (arrIn[i] > arrIn[j]) {
                    tmp = arrIn[i];
                    arrIn[i] = arrIn[j];
                    arrIn[j] = tmp;
                }
            }
        }
        return arrIn;
    }

}
