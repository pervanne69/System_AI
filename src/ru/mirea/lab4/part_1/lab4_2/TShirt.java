package ru.mirea.lab4.part_1.lab4_2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size clothSize, double cost, String color) {
        super(clothSize, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Футболка [размер: " + clothSize.getDescription() + ", евроразмер: " +
                clothSize.getEuroSize() + ", цена: " + cost + ", цвет: " + color + "]");
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка [размер: " + clothSize.getDescription() + ", евроразмер: " +
                clothSize.getEuroSize() + ", цена: " + cost + ", цвет: " + color + "]");
    }
}
