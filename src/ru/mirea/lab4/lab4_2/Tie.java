package ru.mirea.lab4.lab4_2;

public class Tie extends Clothes implements MenClothing {
    public Tie(int clothSize, double cost, String color) {
        super(clothSize, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Одеть мужчине галстук");
    }

}
