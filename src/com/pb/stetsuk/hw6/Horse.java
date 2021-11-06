package com.pb.stetsuk.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String color;

    public Horse(String food, String location) {
        super(food, location);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat() {
        System.out.println("Конь ест.");
    }

    public String makeNoise() {
        return "Игого";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return Objects.equals(color, horse.color);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "Horse, food " + getFood() + ", location " + getLocation();
    }
}