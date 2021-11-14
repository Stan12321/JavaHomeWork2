package com.pb.stetsuk.hw7;

interface ManClothes {

    void dressMan();
}
interface WomanClothes {

    void dressWoman();
}

public class Atelier {
    public static void main(String[] args) {
        Tshirt tshirt1 = new Tshirt(Size.XXS, 30, "чорный");
        Tshirt tshirt2 = new Tshirt(Size.L, 45, "красный");
        Pants pants1 = new Pants(Size.M, 180, "синий");
        Pants pants2 = new Pants(Size.XS, 100, "хаки");
        Skirt skirt1 = new Skirt(Size.S, 50, "черный");
        Skirt skirt2 = new Skirt(Size.M, 60, "красный");
        Tie tie1 = new Tie(Size.L, 10, "черный");
        Tie tie2 = new Tie(Size.XS, 15, "серо-зелёный");

        Clothes[] clothes = {tshirt1, tshirt2, pants1, pants2, skirt1, skirt2, tie1, tie2};

        System.out.println("Мужская одежда: ");
        dressMan(clothes);

        System.out.println("Женская одежда: ");
        dressWoman(clothes);
    }

    static void dressMan(Clothes[] clothes) {
        for (Clothes i: clothes) {
            if (i instanceof ManClothes) {
                ((ManClothes) i).dressMan();
            }

        }
    }
    static void dressWoman(Clothes[] clothes){
        for (Clothes i: clothes){
            if(i instanceof WomanClothes){
                ((WomanClothes) i).dressWoman();
            }
        }
    }
}
