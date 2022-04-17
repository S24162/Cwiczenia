package g11c.cw1.Zad4;

public class Zad4 {

    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10)
        {
            System.out.println("Hello world!" + (counter+1));
            counter++;
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!" + (i+1));
        }

        System.out.println();
        counter = 0;
        do {
            System.out.println("Hello world!" + (counter+1));
//            counter++;
        }while (counter++ < 9);

    }

}
