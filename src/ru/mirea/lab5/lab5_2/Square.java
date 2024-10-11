package ru.mirea.lab5.lab5_2;

import java.awt.Graphics;
import java.awt.*;

public class Square extends Shape {
    protected int side;

    public Square(int x, int y, int side, Color color) {
        super(x, y, color);
        this.side = side;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);  // Устанавливаем цвет
        g.fillRect(x, y, side, side);  // Рисуем прямоугольник
    }

    public int getSide() {
        return side;
    }

    public void setSide(int newSide) {
        this.side = newSide;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square:\n" +
                "side = " + side + "\n" +
                "Color = " + color + "\n" +
                "Area = " + getArea() + "\n" +
                "Perimeter = " + getPerimeter();
    }
}
