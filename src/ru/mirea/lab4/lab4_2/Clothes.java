package ru.mirea.lab4.lab4_2;

public abstract class Clothes {
    int clothSize;
    double cost;
    String color;

    public Clothes(int clothSize, double cost, String color) {
        this.clothSize = clothSize;
        this.cost = cost;
        this.color = color;
    }
}
