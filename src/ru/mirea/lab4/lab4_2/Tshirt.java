package ru.mirea.lab4.lab4_2;

public class Tshirt extends Clothes implements MenClothing, WomenClothing {
    public Tshirt(int clothSize, double cost, String color) {
        super(clothSize, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Одеть футболку на мужчину");
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть футболку на женщину");
    }
}
