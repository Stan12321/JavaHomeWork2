package com.pb.stetsuk.hw7;

public class Skirt extends Clothes implements WomanClothes {
    Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Юбка, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цена: " + price + " USD, " + " Цвет: " + color + ".");
    }
}
