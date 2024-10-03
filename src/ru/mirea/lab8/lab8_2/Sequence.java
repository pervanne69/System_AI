package ru.mirea.lab8.lab8_2;

import java.util.Scanner;


public class Sequence {
    public static long reverse(long n, long reversed) {
        if (n == 0) {
            return reversed;
        }
        long lastDigit = n % 10;
        reversed = reversed * 10 + lastDigit;
        return reverse(n / 10, reversed);
    }

    public static void main(String[] args) {
        long n;
        long reversed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        while (!sc.hasNextInt()) {
            System.out.println("Ошибка: введите целое число!");
            sc.next(); // Пропускаем неверный ввод
        }
        n = sc.nextInt(); // Если введено целое число, сохраняем его
        System.out.printf("Число в развернутом виде: %d", reverse(n, reversed));

        sc.close();
    }
}
