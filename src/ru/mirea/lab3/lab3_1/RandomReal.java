package ru.mirea.lab3.lab3_1;


import java.util.Scanner;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


import java.util.Arrays;
import java.util.Collections;

public class RandomReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int n;

        do {
            System.out.println("Input the correct number of array's values:");
            s = scanner.nextLine();
        } while (!s.matches("-?\\d+"));

        n = Integer.parseInt(s);

        double[] arr1 = new double[n];
        double[] arr2 = new double[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = ThreadLocalRandom.current().nextDouble();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = Math.random();
        }

        System.out.println("Array 1 before sorting: ");

        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);

        System.out.println("Array 1 after sorting: ");

        System.out.println(Arrays.toString(arr1));


        System.out.println("Array 2 before sorting: ");

        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr2);

        System.out.println("Array 2 after sorting: ");

        System.out.println(Arrays.toString(arr2));

    }
}
