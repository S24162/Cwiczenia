package Cw2.Zad1;

import Cw2.exception.ValidationException;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Vehicle {
    private static Set<Vehicle> extent = new HashSet<>();

    private String name;
    private LocalDate creationDate;
    private List<Integer> wheels;
    private Brand brand;
    private Insurance insurance;

    public Vehicle(String name, LocalDate creationDate, int wheel1, int wheel2, Brand brand, Insurance insurance) {
        setName(name);
        setCreationDate(creationDate);
        this.wheels = new ArrayList<>();
        addWheels(wheel1);
        addWheels(wheel2);
        setBrand(brand);
        setInsurance(insurance);
        extent.add(this);
    }

    public Vehicle(String name, int wheel1, int wheel2, Brand brand,Insurance insurance) {
        setName(name);
        this.wheels = new ArrayList<>();
        addWheels(wheel1);
        addWheels(wheel2);
        setBrand(brand);
        setInsurance(insurance);
        extent.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new ValidationException("Name must not be empty");
        }
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public List<Integer> getWheels() {
        return Collections.unmodifiableList(wheels);
    }

    public void addWheels(int number) {
        wheels.add(number);
    }

    public void removeWheels(int number) {
        if (wheels.size() <= 2) {
            throw new ValidationException("Wheels size should be > 2");
        }
        wheels.remove(number);
    }

    public Period getAge() {
        if (creationDate == null) {
            throw new ValidationException("Creation date is null");
        }
        return Period.between(creationDate, LocalDate.now());
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        //TODO checks
        this.brand = brand;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        //TODO checks
        this.insurance = insurance;
    }

    public static Set<Vehicle> getExtent() {
        return Collections.unmodifiableSet(extent);
    }

    public static void removeVehicle(Vehicle vehicle)
    {
        //remove vehicle from extent
    }

    public static List<Vehicle> findByName(String name)
    {
        return extent.stream().filter(e -> e.name.equals(name)).collect(Collectors.toList());
    }

}
