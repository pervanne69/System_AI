package ru.mirea.lab3.lab3_2;

import java.util.Random;
import java.util.Arrays;

public class AscendingSequence {

    public static boolean ascSequence(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] < arr[i + 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10, 100);
        }

        System.out.println("Array: " + Arrays.toString(arr));

        if (ascSequence(arr)) {
            System.out.println("The sequence is strictly ascending");
        } else {
            System.out.println("The sequence is not strictly ascending");
        }

    }
}
