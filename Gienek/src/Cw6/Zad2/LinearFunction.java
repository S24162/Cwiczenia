package Cw6.Zad2;

public class LinearFunction extends Function implements Fun{

    private double a;
    private double b;

    LinearFunction (double a, double b){
        this.a=a;
        this.b=b;
    }

    @Override
    public double f(double x) {
        return a*x + b;
    }

    @Override
    void increaseCoefficientsBy(double delta) {
                              a=a+delta;
                              b=b+delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a=a-delta;
        b=b-delta;
    }
}

class AbsoluteLinearFunction extends LinearFunction implements Fun{

    AbsoluteLinearFunction(int a, int b) {
        super(a, b);
        }

    @Override
    public double f(double x) {
        return Math.abs(super.f(x));
        }
    }

class SquareFunction extends Function implements Fun{

    private double a;
    private double b;
    private double c;

    SquareFunction (double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public double f (double x) {
        return a*x*x + b*x + c ;
    }

    @Override
    void increaseCoefficientsBy(double delta) {
        a=a+delta;
        b=b+delta;
        c=c+delta;
    }

    @Override
    void decreaseCoefficientsBy(double delta) {
        a=a-delta;
        b=b-delta;
        c=c-delta;

    }
}


