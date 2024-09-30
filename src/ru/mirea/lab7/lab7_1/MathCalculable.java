package ru.mirea.lab7.lab7_1;

public interface MathCalculable {
    double PI = 3.14;

    static double pow(double element, double n) {
        return Math.pow(element, n);
    }


    static double absComplexNumber(int x, int y) {
        return MathCalculable.pow(x * x + y * y, 0.5);
    }

}
