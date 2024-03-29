package com.pb.stetsuk.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String color;

    public Cat(String food, String location) {
        super(food, location);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("Кот ест.");
    }

    public String makeNoise() {
        return "Мяу";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return Objects.equals(color, cat.color);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "Cat, food " + getFood() + ", location " + getLocation();
    }
}