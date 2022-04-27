package Cw1.Zad7;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {

        System.out.println("Enter an odd number greater than 4 ");
        Scanner sc=new Scanner(System.in);
        byte n= sc.nextByte();

        if (n<5 || n%2 != 1){
            do{
                System.out.println("You are wrong.. Again");
                n= sc.nextByte();}
            while (n<5 || n%2 != 1);
        }

        String[][] nArr=new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                nArr[i][j]="*";
            }
        }

        for(int i=1;i<=n-2;i++){
            for(int j=1;j<=n-2;j++){
                nArr[i][j]=" ";
            }
        }

        for(int i=n-2;i>0;i--){
            nArr[i][i]="*";
        }

        arrPrint(nArr);
    }
    public static void arrPrint(String[][] arr){
        for(int i=0;i< arr[0].length;i++) {
            for(int j=0;j< arr[0].length;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
