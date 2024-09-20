package ru.mirea.lab4.part_2.lab4_1;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(6f, "red", false);
        Rectangle rectangle = new Rectangle(4, 5, "blue", true);
        Square square = new Square(5, "green", true);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
