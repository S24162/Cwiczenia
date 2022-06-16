package Cw5.Zad1;

import java.util.ArrayList;
import java.util.List;

public class Figura {

    protected String name;
    public Figura(String name)
    {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            throw new RuntimeException("cannot be empty");
        }

        this.name = name;
    }

    public double getArea()
    {
        return 0;
    }

    public double getPerimeter()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return name;
    }
}

class Prostokat extends Figura
{
    private double a;
    private double b;
    public Prostokat(String name, double a, double b)
    {
        super(name);
        setA(a);
        setB(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a < 0)
        {
            throw new RuntimeException("Cannot be lower than 0");
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b < 0)
        {
            throw new RuntimeException("Cannot be lower than 0");
        }
        this.b = b;
    }

    @Override
    public double getArea()
    {
        return a*b;
    }

    @Override
    public double getPerimeter()
    {
        return 2*(a+b);
    }

    @Override
    public String toString()
    {
        return super.toString() + " " + a + " " + b;
    }
}

class Kolo extends Figura
{
    private double promien;
    public Kolo(String name, double promien)
    {
        super(name);
        setPromien(promien);
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        if(promien < 0)
        {
            throw new RuntimeException("Cannot be lower than 0");
        }
        this.promien = promien;
    }

    @Override
    public double getArea()
    {
        return Math.PI*promien*promien;
    }

    @Override
    public double getPerimeter()
    {
        return Math.PI*2*promien;
    }

    @Override
    public String toString()
    {
        return super.toString() + " " + promien;
    }
}

class Main
{
    public static void main(String[] args) {
        List<Figura> figuraList = new ArrayList<>();
        figuraList.add(new Figura("figura1"));
        figuraList.add(new Prostokat("prostokat1",2,3));
        figuraList.add(new Kolo("kolo1",2));

        for (Figura f: figuraList) {
            System.out.println(f.name + ": odwod = " + f.getPerimeter() + " powierzchnia = " + f.getArea());
        }
    }
}
