package ru.mirea.lab1;

import java.util.Scanner;

public class FactorialCalculator {


    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = -1;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Введите целое неотрицательное число: ");

            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Число не должно быть отрицательным. Попробуйте снова.");
                }
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
                sc.next();
            }
        }
        long result = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " = " + result);

        sc.close();
    }
}
