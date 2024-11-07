package ru.mirea.lab23.lab23_2;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <x-value>");
            return;
        }
        double x;
        try {
            x = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid x value: " + args[0]);
            return;
        }

        Expression expression = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(1)
        );
        double result = expression.evaluate(x);
        System.out.println("Result: " + result);
    }
}
