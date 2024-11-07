package ru.mirea.lab23.lab23_2;

import java.util.Map;

public class Const implements Expression {
    private final double value;

    public Const(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(double x) {
        return value;
    }

}
