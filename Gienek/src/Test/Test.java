package Test;

public class Test {
    double a;
    double b;
    double x1;
    double x2;
    Test( double a, double b, double x1, double x2 ){
        this.a=a;
        this.b=b;
        this.x1=x1;
        this.x2=x2;
    }


    double y (){
        return  a*x2 +b;
    }
}
