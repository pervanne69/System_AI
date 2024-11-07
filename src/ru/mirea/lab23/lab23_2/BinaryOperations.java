package ru.mirea.lab23.lab23_2;

public abstract class BinaryOperations implements Expression {
    protected final Expression left;
    protected final Expression right;

    public BinaryOperations(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    protected abstract double apply(double a, double b);

    @Override
    public double evaluate(double x) {
        return apply(left.evaluate(x), right.evaluate(x));
    }

}
