package ru.mirea.lab23.lab23_2;

public class Subtract extends BinaryOperations {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    protected double apply(double a, double b) {
        return a - b;
    }
}
