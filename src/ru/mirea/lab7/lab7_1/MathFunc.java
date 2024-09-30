package ru.mirea.lab7.lab7_1;

public class MathFunc implements MathCalculable {

    public static double pow(double element, double n) {
        // Если степень 0, возвращаем 1
        if (n == 0) {
            return 1;
        }
        boolean isNegative = n < 0;
        if (isNegative) {
            element = 1 / element;
            n = -n;
        }

        int integerPart = (int) n;
        double fractionalPart = n - integerPart;

        double result = 1;
        for (int i = 0; i < integerPart; i++) {
            result *= element;
        }

        if (fractionalPart != 0) {
            result *= Math.exp(fractionalPart * Math.log(element));
        }

        return result;
    }

    static public double absComplexNumber(int x, int y) {
        return MathFunc.pow(x * x + y * y, 0.5);
    }
}
