package Cw2.Zad5;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Every communist MUST die  v1.0");
        System.out.println();

        //creating books and persons

        Person Nietzsche=new Person();
        Nietzsche.setPersonName("Friedrich");
        Nietzsche.setPersonSurname("Nietzsche");
        Nietzsche.setDateOfBirth(LocalDate.of(1834,12,12));
        Nietzsche.getAdress().setCountry("Germany");
        Nietzsche.getAdress().setCity("Bavaria");
        Nietzsche.getAdress().setStreet("Plagues");
        Nietzsche.getAdress().setHouse(12);
        Nietzsche.getAdress().setFlat(3);

        Person Cornholio=new Person();
        Cornholio.setPersonName("Holy");
        Cornholio.setPersonSurname("Cornholio");
        Cornholio.setDateOfBirth(LocalDate.of(1979,10,28));
        Cornholio.getAdress().setCountry("USA");
        Cornholio.getAdress().setCity("Highland");
        Cornholio.getAdress().setStreet("some Street");
        Cornholio.getAdress().setHouse(12);
        Cornholio.getAdress().setFlat(1);

        Book Zaratustra=new Book();
        Zaratustra.setName("Thus Spoke Zarathustra");
        Zaratustra.setID();
        Zaratustra.setGenre(Genre.Fantasy);
        Zaratustra.setLang(Lang.English);
        Zaratustra.setPublishDate(2000,12,12);

        Book Nihilism=new Book();
        Nihilism.setName("Existential nihilism");
        Nihilism.setID();
        Nihilism.setGenre(Genre.Fantasy);
        Nihilism.setLang(Lang.English);
        Nihilism.setPublishDate(1887,3,4);

        //operations

        Zaratustra.borrowBook(Cornholio);
        Nihilism.borrowBook(Cornholio);
        Zaratustra.placeBack();
        Cornholio.PublishBook();
        Cornholio.PublishBook();


    }
}
