package Cw4.Zad2;

import java.util.Stack;

class Matrix {

    static int r;
    static int c;
    int columsNumber;
    int rowsNumber;
    static int nextRow=0;
    static  int[][] arr;

    private int[][] matrix = new int[r][c];

    private Matrix(){}

    public int[][] getMatrix() {return matrix;}
//    Creation

    static void setUpMatrix(int rowCount, int columnCount){

       r=rowCount;
       c=columnCount;
       arr= new int[r][c];
    }

    static void insertRow(int[] row){

        for (int column = 0; column < row.length; column++) {
            arr[nextRow][column] = row[column];
        }
        nextRow++;
    }

    public static Matrix create(){

        Matrix temp= new Matrix();
        temp.columsNumber=c;
        temp.rowsNumber=r;
        for(int i=0;i<r;i++)
            for (int j = 0; j < c; j++ )
                temp.matrix[i][j] = arr[i][j];
        nextRow=0;
       return temp;
    }

//    Operations

    public void print(){

        for(int i=0;i<r;i++) {
           System.out.print("| ");
           for (int j = 0; j < c; j++)
               System.out.print(matrix[i][j] + " ");
           System.out.print("|");
           System.out.println();
       }
    }

    public Matrix add(Matrix m){
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                matrix[i][j]=matrix[i][j] + m.matrix[i][j];
        return this;
    }

    public static Matrix add(Matrix m1,Matrix m2){
        Matrix m3=new Matrix();
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                m3.matrix[i][j]=m1.matrix[i][j] + m2.matrix[i][j];
        return m3;
    }

    public Matrix subtract(Matrix m){
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                matrix[i][j]=matrix[i][j] - m.matrix[i][j];
        return this;
    }

    public static Matrix subtract(Matrix m1, Matrix m2){
        Matrix m3=new Matrix();
        for(int i=0; i<r; i++)
            for(int j=0; j<c; j++)
                m3.matrix[i][j]=m1.matrix[i][j] - m2.matrix[i][j];
        return m3;
    }

    //        trying to catch +5

    public static Matrix multiply(Matrix m1, int n){
        setUpMatrix(m1.rowsNumber, m1.columsNumber);
        Matrix m2=new Matrix();
        for(int i=0; i< m1.rowsNumber; i++)
            for(int j=0; j<m1.columsNumber; j++)
                m2.matrix[i][j]=m1.matrix[i][j]*n;
        return m2;
    }

    public static Matrix multiply(Matrix m1, Matrix m2){
        setUpMatrix(m2.rowsNumber,m2.columsNumber);
        Matrix m3=Matrix.create();
        if (m1.columsNumber == m2.getMatrix().length) {
            int a = 0;
            for (int x = 0; x < m2.columsNumber; x++) {
                for (int y = 0; y < m1.columsNumber;y++ ) {
                    for (int z = 0; z < m2.rowsNumber; z++)
                        a = a + m1.matrix[y][z] * m2.matrix[z][x];
                    m3.matrix[y][x] = a;
                }
            }
        }
        else System.out.println(" Multiplying is impassible ");
        return m3;
    }
}

public class Main {
    public static void main(String[] args) {

        Matrix.setUpMatrix(3,3);
        Matrix.insertRow(new int[]{1,2,3});
        Matrix.insertRow(new int[]{4,5,6});
        Matrix.insertRow(new int[]{7,8,9});
        Matrix matrixA = Matrix.create();
        System.out.println("Matrix A:");
        matrixA.print();

        Matrix.setUpMatrix(3,3);
        Matrix.insertRow(new int[]{9,8,7});
        Matrix.insertRow(new int[]{6,5,4});
        Matrix.insertRow(new int[]{3,2,1});
        Matrix matrixB = Matrix.create();
        System.out.println("Matrix B:");
        matrixB.print();

        matrixA.add(matrixB);
        System.out.println("Matrix A after adding B");
        matrixA.print();

        matrixA.subtract(matrixB);
        System.out.println("Matrix A after subtracting B");
        matrixA.print();

        Matrix.setUpMatrix(3,3);
        Matrix.insertRow(new int[]{6,3,2});
        Matrix.insertRow(new int[]{14,5,7});
        Matrix.insertRow(new int[]{27,5,15});
        Matrix matrixC= Matrix.create();
        System.out.println("Matrix (A+B)-C+(A-C)");
        Matrix.add(matrixA,matrixB)
                .subtract(matrixC)
                .add(matrixA.subtract(matrixC))
                .print();

//        trying to catch +5

        System.out.println();
        System.out.println("Trying to catch +5");
        System.out.println();

        Matrix.setUpMatrix(3,3);
        Matrix.insertRow(new int[]{1,2,3});
        Matrix.insertRow(new int[]{4,5,6});
        Matrix.insertRow(new int[]{7,8,9});
        Matrix matrixD = Matrix.create();
        System.out.println("Matrix D:");
        matrixD.print();

        Matrix.setUpMatrix(3,2);
        Matrix.insertRow(new int[]{1,2});
        Matrix.insertRow(new int[]{3,4});
        Matrix.insertRow(new int[]{5,6});
        Matrix matrixF = Matrix.create();
        System.out.println("Matrix F:");
        matrixF.print();

        System.out.println(" Matrix D after multiplying by 2: ");
        Matrix.multiply(matrixD,2).print();

        System.out.println(" Multipyling FxD : ");
        Matrix.multiply(matrixD,matrixF).print();
    }
}
