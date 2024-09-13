package ru.mirea.lab4.lab4_2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(int clothSize, double cost, String color) {
        super(clothSize, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеть юбку на женщину");
    }
}
