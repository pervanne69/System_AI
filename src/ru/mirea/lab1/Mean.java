package ru.mirea.lab1;

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i;
        int total = 0;
        System.out.println("Введите количество элементов массива: ");
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не целое число");
            System.out.println("Введите количество элементов массива:");
            sc.next();
        }
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        System.out.println("Количество элементов массива:");
        System.out.println(n);

        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.format("Введите %s элемент массива: ", i + 1);
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Вы ввели не целое число");
                System.out.format("Введите %s элемент массива: ", i + 1);

            }
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.print("Элементы массива: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }

        System.out.format("\nСумма элементов массива = %s\n", total);
        System.out.format("Среднее арифметическое элементов массива = %s", total / n);
        sc.close();
    }
}
