package Cw4.Zad2;

class Matrix{

    static int r;
    static int c;
    private int[][] list;

    private Matrix(){}

     static void setUpMatrix(int rowCount, int columnCount){
        r=rowCount;
        c=columnCount;
        Matrix list =new Matrix();
    }

    static void insertRow(int[] row){
        for (int a : row) {

        }

    }

    static Matrix Create(){
        Matrix m=new Matrix();
        return m;
    }

//operations

    public void  print(){

    }

    public Matrix add(Matrix m){
        return this;
    }

    public Matrix add(Matrix m1,Matrix m2){
        Matrix m3=new Matrix();
        return m3;
    }

    public Matrix subtract(Matrix m){
        return this;
    }

    public Matrix subtract(Matrix m1, Matrix m2){
        Matrix m3=new Matrix();
        return m3;
    }

}

public class Main {
    public static void main(String[] args) {

        Matrix.setUpMatrix(3,3);
        Matrix.setUpMatrix(4,4);
        Matrix.insertRow(new int[]{1,2,3});
        Matrix.insertRow(new int[]{4,5,6});
        Matrix.insertRow(new int[]{7,8,9});
        //Matrix matrixA = Matrix.create();
        //System.out.println("Matrix A:");
        //matrixA.print();

        System.out.println(Matrix.r +" "+Matrix.c);

    }
}
