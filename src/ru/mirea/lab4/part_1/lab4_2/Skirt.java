package ru.mirea.lab4.part_1.lab4_2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size clothSize, double cost, String color) {
        super(clothSize, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка [размер: " + clothSize.getDescription() + ", евроразмер: " +
                clothSize.getEuroSize() + ", цена: " + cost + ", цвет: " + color + "]");
    }
}
