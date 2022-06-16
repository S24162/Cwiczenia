package Cw6.Zad1;

public interface ComparablePerson {

    int compareAge(Person p);
    int compareIncome(Person p);

    static Person compareAge(Person p1, Person p2) {
        return p1.compareAge(p2) >= 0 ? p1 : p2;
    }

    static Person compareIncome(Person p1, Person p2) {
        return p1.compareIncome(p2) >= 0 ? p1 : p2;
    }

}
