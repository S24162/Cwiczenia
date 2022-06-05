package Cw4.Zad1.zd1a;

public class Figure {

    public String name;

    public int getArea()
    {
        return 0;
    }

}

class Rect extends Figure
{
    public int a,b;

    public int getArea()
    {
        return a*b;
    }
}

class Circle extends Figure
{
    public int r;
}


class Test {
    public static void main(String[] args) {

        Figure f = new Figure();
        Rect r = new Rect();
        r.a = 1;
        r.b = 2;
        Circle c = new Circle();

        Figure r2 = new Rect();
        Figure c2 = new Circle();

        System.out.println(f.getArea());
        System.out.println(r2.getArea());
        System.out.println(r.getArea());

    }
}


