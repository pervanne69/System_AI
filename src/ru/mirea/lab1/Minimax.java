package ru.mirea.lab1;

import java.util.Scanner;

public class Minimax {
    public static int count_min(int[] arr) {
        int result = 10000;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static int count_max(int[] arr) {
        int result = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static int get_total_while(int[] arr) {
        int total = 0;
        int i = 0;
        while (i <= arr.length - 1) {
            total += arr[i];
            i += 1;
        }
        return total;
    }

    public static int get_total_do_while(int[] arr) {
        int total = 0;
        int i = 0;
        do {
            total += arr[i];
            i += 1;
        } while (i <= arr.length - 1);
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i;
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
        i = 0;
        System.out.print("Элементы массива: ");
        while (i <= n - 1) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.format("\nСумма элементов массива через цикл while = %s\n", get_total_while(arr));
        System.out.format("Сумма элементов массива через цикл do while = %s\n", get_total_do_while(arr));
        System.out.format("Максимальный элемент массива = %s\n", count_max(arr));
        System.out.format("Минимальный элемент массива = %s\n", count_min(arr));
        sc.close();


    }
}
