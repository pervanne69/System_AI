package ru.mirea.lab5.lab5_2;

import java.awt.Graphics;
import java.awt.*;

public class Rectangle extends Shape {
    protected int width;
    protected int length;

    public Rectangle(int x, int y, int width, int length, Color color) {
        super(x, y, color);
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);  // Устанавливаем цвет
        g.fillRect(x, y, width, length);  // Рисуем прямоугольник
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth) {
        this.width = newWidth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle:\n" +
                "Width = " + width + " Length = " + length + "\n" +
                "Color = " + color + "\n" +
                "Area = " + getArea() + "\n" +
                "Perimeter = " + getPerimeter();
    }

}
