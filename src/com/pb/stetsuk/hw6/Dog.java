package com.pb.stetsuk.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String name;

    public Dog(String food, String location) {
        super(food, location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Собака ест.");
    }

    public String makeNoise() {
        return "Гав";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;

        Dog dog = (Dog) o;

        return Objects.equals(name, dog.name);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "Dog food " + getFood() +", location " + getLocation();
    }
}