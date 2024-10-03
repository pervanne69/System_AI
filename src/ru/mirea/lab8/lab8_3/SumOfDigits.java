package ru.mirea.lab8.lab8_3;

import java.util.Scanner;

public class SumOfDigits {
    public static int countOfNumbers(int number, int k, int s, int result) {
        if (number >= Math.pow(10, k)) {
            return result;
        }
        int kTmp = number;
        int total = 0;
        while (kTmp != 0) {
            total += kTmp % 10;
            kTmp /= 10;
        }
        if (total == s) {
            result += 1;
        }
        return countOfNumbers(number + 1, k, s, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, s;
        int result = 0;
        System.out.println("Введите количество знаков в числе: ");
        while (!sc.hasNextInt()) {
            System.out.println("Ошибка, Вы ввели не число");
            sc.next();
        }
        k = sc.nextInt();

        System.out.println("Введите число, которому должна равняться сумма цифр k-значного числа");
        while (!sc.hasNextInt()) {
            System.out.println("Ошибка, вы ввели не число");
            sc.next();
        }
        s = sc.nextInt();

        System.out.printf("Количество %d-значных чисел, сумма цифр которых = %d: %d\n",
                k, s, countOfNumbers((int) Math.pow(10, k - 1), k, s, result));
        sc.close();

    }
}
