package ru.mirea.lab4.part_2.lab4_1;

public class Square extends Shape {
    protected double side;

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double newSide) {
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
