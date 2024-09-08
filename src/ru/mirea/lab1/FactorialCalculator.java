package ru.mirea.lab1;

public class FactorialCalculator {


    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        int number = 5;
        long result = calculateFactorial(number);

        System.out.println("Факториал числа " + number + " = " + result);
    }
}
