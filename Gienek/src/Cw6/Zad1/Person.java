package Cw6.Zad1;

import java.time.LocalDate;

public abstract class Person implements ComparablePerson{
    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Person(String name, String surname, LocalDate dateOfBirth) {
        setName(name);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()) {
            throw new RuntimeException("Cannot be empty");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.isEmpty()) {
            throw new RuntimeException("Cannot be empty");
        }
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth == null) {
            throw new RuntimeException("Cannot be empty");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public int getAgeInYears()
    {
        return LocalDate.now().getYear()- dateOfBirth.getYear();
    }

    @Override
    public int compareAge(Person p) {
        return getAgeInYears() - p.getAgeInYears();
    }

    @Override
    public int compareIncome(Person p){
        return (int)(getIncome() - p.getIncome());
    }

    public abstract double getIncome();
}

class Employee extends Person{

    private double salary;
    //TODO getters setters ...

    public Employee(String name, String surname, LocalDate dateOfBirth, double salary) {
        super(name, surname, dateOfBirth);
        this.salary = salary;
    }

    @Override
    public double getIncome() {
        return salary - (salary * 20 / 100);
    }
}

class Student extends Person{

    private double scholarship;
    //TODO getters setters ...

    public Student(String name, String surname, LocalDate dateOfBirth, double scholarship ) {
        super(name, surname, dateOfBirth);
        this.scholarship = scholarship;
    }

    @Override
    public double getIncome() {
        return scholarship;
    }
}


