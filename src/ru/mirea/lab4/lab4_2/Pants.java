package ru.mirea.lab4.lab4_2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(int clothSize, double cost, String color) {
        super(clothSize, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Одеть штаны на мужчину");
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть штаны на женщину");
    }
}
