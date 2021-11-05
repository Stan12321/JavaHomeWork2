package com.pb.stetsuk.hw6;

public class VetClinic {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("кости", "дом");
        animals[1] = new Cat("рыба", "квартира");
        animals[2] = new Horse("сахар", "ферма");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }

    }
}
