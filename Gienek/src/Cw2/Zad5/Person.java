package Cw2.Zad5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name,surname;
    private LocalDate dateOfBirth;
    private Adress adress=new Adress();

    private ArrayList<Book> listOfBooks=new ArrayList<>();

    public ArrayList<Book> getListOfBooks() {        return listOfBooks;    }
    public void addListOfBooks (Book book){ listOfBooks.add(book);}



    public void setPersonName(String name){ this.name=name; }
    public String getName(){return name;}
    public void setPersonSurname(String surname){ this.surname=surname; }
    public String getSurname(){return surname;}

    public void setDateOfBirth (LocalDate date){       this.dateOfBirth=date;    }
    public LocalDate getDateOfBirth(){return dateOfBirth;}

    public Adress getAdress() {        return adress;    }


    public int getAge(){
        int aktualYear=LocalDate.now().getYear();
        System.out.println(LocalDate.now());
        System.out.println(aktualYear);
        int birthYear= dateOfBirth.getYear();
        System.out.println(dateOfBirth);
        System.out.println(birthYear);
        int year = aktualYear-birthYear;
        if(this.dateOfBirth.getDayOfYear()>LocalDate.now().getDayOfYear()){
            year=year-1;
        }
        return year;
    }

    public void PublishBook (String bookName){
        System.out.println();
        System.out.println("PublishBook");
        Book name = new Book();
        name.setName(bookName);
        name.getListOfAuthor().add(this);
        name.getListOfAuthor().forEach(author -> System.out.println(author.name +" "));
        listOfBooks.add(name);
        name.setID();
        listOfBooks.forEach(book -> System.out.println(book.getName() +" "+ book.getID()));
    }

    public void personDate(){
        System.out.println(name + " " + surname + " " +dateOfBirth);
    }


}
