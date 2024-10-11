package ru.mirea.lab5.lab5_2;

import java.awt.Graphics;
import java.awt.*;

public class Circle extends Shape {
    protected int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);  // Устанавливаем цвет
        g.fillOval(x, y, radius, radius);  // Рисуем круг
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle:\n" +
                "Radius = " + radius + "\n" +
                "Color = " + color + "\n" +
                "Area = " + getArea() + "\n" +
                "Perimeter = " + getPerimeter();
    }

}
