package com.pb.stetsuk.hw7;

public class Tie extends Clothes implements ManClothes {
    Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук, " + clothesSize + " (" + clothesSize.getEuroSize() + ") " + clothesSize.getDescription()
                + " Цена: " + price + " USD, " + " Цвет: " + color + ".");
    }
}
