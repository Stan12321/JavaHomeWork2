package com.pb.stetsuk.hw7;

public class Tshirt extends Clothes implements ManClothes, WomanClothes {
    Tshirt(Size size, int price, String color) {

        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цена: " + price + " USD," + " Цвет: " + color + ".");
    }

    @Override
    public void dressWoman() {
        System.out.println("Футболка, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цена: " + price + " USD, " + " Цвет: " + color + ".");
    }
}
