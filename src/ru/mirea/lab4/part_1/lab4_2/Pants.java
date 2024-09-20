package ru.mirea.lab4.part_1.lab4_2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    public Pants(Size clothSize, double cost, String color) {
        super(clothSize, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Штаны [размер: " + clothSize.getDescription() + ", евроразмер: " +
                clothSize.getEuroSize() + ", цена: " + cost + ", цвет: " + color + "]");
    }

    @Override
    public void dressWomen() {
        System.out.println("Штаны [размер: " + clothSize.getDescription() + ", евроразмер: " +
                clothSize.getEuroSize() + ", цена: " + cost + ", цвет: " + color + "]");
    }
}
