package ru.mirea.lab23.lab23_2;

public class Divide extends BinaryOperations{
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    protected double apply(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }
}
