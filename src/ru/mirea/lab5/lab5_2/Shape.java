package ru.mirea.lab5.lab5_2;

import java.awt.Graphics;
import java.awt.*;

public abstract class Shape {

    protected int x, y;
    protected Color color;

    public Shape(int x, int y, Color color) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);

    public Color getColor() {
        return color;
    }

    public void setColor(Color newColor) {
        this.color = newColor;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Figure:\n" + " Area: " + getArea() + "\n" + " Perimeter: " + getPerimeter();
    }
}
