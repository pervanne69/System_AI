package ru.mirea.lab4.lab4_2;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 25.99, "Синий"),
                new Pants(Size.L, 49.99, "Черный"),
                new Skirt(Size.S, 35.99, "Красный"),
                new Tie(Size.XS, 15.99, "Зеленый")
        };

        Atelier atelier = new Atelier();

        System.out.println("Женская одежда:");
        atelier.dressWomen(clothes);

        System.out.println("\nМужская одежда:");
        atelier.dressMen(clothes);
    }
}
