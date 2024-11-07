package ru.mirea.lab23.lab23_2;

public class Multiply extends BinaryOperations{
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    protected double apply(double a, double b) {
        return a * b;
    }
}
