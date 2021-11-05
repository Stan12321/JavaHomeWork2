package com.pb.stetsuk.hw6;

import java.util.Objects;

public abstract class Animal {
    private String food;
    private String location;

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void eat() {
        System.out.println("еда");
    }

    public String makeNoise() {
       return "звук";
    }

    public void sleep() {
        System.out.println("Животное спит.");
    }

    public boolean equals(Object a) {
        if (this == a) return true;
        if (a == null || getClass() != a.getClass()) return false;

        Animal animal = (Animal) a;

        if (!Objects.equals(food, animal.food)) return false;
        return Objects.equals(location, animal.location);
    }

    public int hashCode() {
        int result = food != null ? food.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}