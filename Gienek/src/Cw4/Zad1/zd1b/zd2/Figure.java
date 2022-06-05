package Cw4.Zad1.zd1b.zd2;

import java.util.ArrayList;
import java.util.List;

public class Figure {
    protected String name;

    public Figure(String name) {
        System.out.println("Creating figure " + name);
        this.name = name;
    }

    public Figure()
    {}

    public double getArea()
    {
        return 0;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Rect extends Figure{

    public double a;
    public double b;

    public Rect(String name, int a, int b) {
        //super(name);
        this.a = a;
        this.b = b;
        this.name = name;
        System.out.println("Creating rect " + this.name);
    }

    public double getArea()
    {
        return a * b;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "name='" + name + '\'' +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}

class Circle extends Figure{
    public double r;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
        System.out.println("Creating circle " + this.name);
    }

    public double getArea()
    {
        return Math.PI * r* r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", r=" + r +
                '}';
    }
}

class Test
{
    public static void main(String[] args) {
        Figure f1 = new Figure("fig1");
        Rect r1 = new Rect("rect1", 2,3);
        Circle c1 = new Circle("circ1",2);

        Figure r2 = new Rect("rect2", 2,3);

        List<Figure> figures = new ArrayList<>();
        figures.add(f1);
        figures.add(r1);
        figures.add(c1);
        figures.add(r2);

        for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i) + " " + figures.get(i).getArea());
        }
    }
}
