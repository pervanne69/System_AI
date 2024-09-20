package ru.mirea.lab4.part_1.lab4_2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size clothSize, double cost, String color) {
        super(clothSize, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Галстук [размер: " + clothSize.getDescription() + ", евроразмер: " +
                clothSize.getEuroSize() + ", цена: " + cost + ", цвет: " + color + "]");
    }

}
