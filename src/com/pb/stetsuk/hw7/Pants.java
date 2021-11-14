package com.pb.stetsuk.hw7;

public class Pants extends Clothes implements ManClothes, WomanClothes {
    Pants(Size size, int price, String color) {

        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цена: " + price + " USD, " + " Цвет: " + color + ".");
    }

    @Override
    public void dressWoman() {
        System.out.println("Штаны, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цена: " + price + " USD, " + " Цвет: " + color + ".");
    }
}
