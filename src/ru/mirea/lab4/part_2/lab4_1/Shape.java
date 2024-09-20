package ru.mirea.lab4.part_2.lab4_1;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape(String color, boolean fiiled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean newFilled) {
        this.filled = newFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "Figure:\n" + " Area: " + getArea() + "\n" + " Perimeter: " + getPerimeter();
    };
}
