package ru.mirea.lab4.part_1.lab4_2;

public abstract class Clothes {
    protected Size clothSize;
    protected double cost;
    protected String color;

    public Clothes(Size clothSize, double cost, String color) {
        this.clothSize = clothSize;
        this.cost = cost;
        this.color = color;
    }

    public Size getclothSize() {
        return clothSize;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}
