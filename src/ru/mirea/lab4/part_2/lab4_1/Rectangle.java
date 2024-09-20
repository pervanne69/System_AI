package ru.mirea.lab4.part_2.lab4_1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double newWidth) {
        this.width = newWidth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newLength) {
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
