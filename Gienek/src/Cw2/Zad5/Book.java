package Cw2.Zad5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Book {
    private Long ID;
    private String name;
    private Genre genre;
    private Lang language;
    private LocalDate publishDate;
    private int borrowCount;
    private boolean isAvailable=true;

    private Person borrower;

    private ArrayList<Person> listOfAuthor=new ArrayList<>();

    public ArrayList<Person> getListOfAuthor() {        return listOfAuthor;    }

    public void getBorrowed() {
        System.out.println(borrower);
    }
    public void setBorrower(Person name){ borrower =name;  }

    public Long getID() {return ID;}
    public void setID() {
        Long ID = Long.valueOf(UUID.randomUUID().hashCode());
        ID = Math.abs(ID);
        int id=ID.toString().length();
        while (id!=10){
            ID=ID*2;
            id=ID.toString().length();
        }
        this.ID=ID;
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public Genre getGenre() {return genre;}
    public void setGenre(Genre genre) {this.genre = genre;}

    public Lang getLang() {return language;}
    public void setLang(Lang lang) {this.language = lang;}

    public LocalDate getPublishDate(){ return publishDate; }
    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setPublishDate (int a,int b,int c){
        Scanner sc=new Scanner(System.in);
        //System.out.println("Give a year : ");
        //int a=sc.nextInt();
        //System.out.println("Give a month : ");
        //int b=sc.nextInt();
        //System.out.println("Give a day : ");
        //int c=sc.nextInt();
        this.publishDate=LocalDate.of(a,b,c);
    }

    public int getAge(){
        int aktualYear=LocalDate.now().getYear();
        System.out.println(LocalDate.now());
        System.out.println(aktualYear);
        int birthYear= publishDate.getYear();
        System.out.println(publishDate);
        System.out.println(birthYear);
        int year = aktualYear-birthYear;
        if(this.publishDate.getDayOfYear()>LocalDate.now().getDayOfYear()){
            year=year-1;
        }
        return year;
    }

    public int getBorrowCount(){ return borrowCount;}
    public void addBorrowCount(){ borrowCount=borrowCount+1;}

    public void setAvailable() {isAvailable = true;}
    public void setNotAvailable() {isAvailable = false;}
    public void getAvailable() {
        if(isAvailable==true)
        System.out.println("Book ||" + this.name + "|| is AVAILABLE");
        else System.out.println("Book ||" + this.name + "|| is NOT AVAILABLE");
    }

    public void borrowBook(Person borrower){

        System.out.println(borrower.getName() +"  is borrowBook " +this.name);
        addBorrowCount();
        isAvailable=false;
        this.borrower = borrower;
        borrower.addListOfBooks(this);
        System.out.println(borrower.getSurname() +" borowed books list : ");
        borrower.getListOfBooks().forEach(book ->System.out.println(book.name));
        System.out.println("-------------------------------------");

    }

    public void placeBack(){

        System.out.println();
        System.out.println(borrower.getName() +"  is placeBook " + this.name);
        System.out.println("Book `" +this.name+"` is returned to the Libery. ");
        isAvailable=true;
        borrower.getListOfBooks().remove(this);
        System.out.println(borrower.getSurname() +" borowed books list : ");
        borrower.getListOfBooks().forEach(book ->System.out.println(book.name));
        System.out.println("-------------------------------------");
    }

    public void bookInfo(){
        System.out.println("ID : "+ID + " | name " + name +" |  "+ genre +" " + language);
        System.out.println(publishDate + " Takened " + borrowCount + " times " +"Available : "+isAvailable);
        if (borrower !=null)
        System.out.println("Borrower : "+ borrower.getName() +" "+ borrower.getSurname());
        else System.out.println("Not borrow");
    }


}
