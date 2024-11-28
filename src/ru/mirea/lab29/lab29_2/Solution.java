package ru.mirea.lab29.lab29_2;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Random;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.solve();
    }

    public void solve() {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        Random rand = new Random();


        printWriter.println("Введите количество городов:");
        printWriter.flush();


        while (!scanner.hasNextInt()) {
            printWriter.println("Ошибка! Введите корректное значение для количества городов");
            printWriter.flush();
            scanner.next();
        }

        int N = scanner.nextInt();
        int[][] roads = new int[N][N];
        int result = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                roads[i][j] = rand.nextInt(0, 2);
                printWriter.print(roads[i][j] + " ");
            }
            printWriter.println();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (roads[i][j] == 1) {
                    result += 1;
                }
            }
        }

        printWriter.println("Количество дорог: " + result);
        printWriter.flush();
        scanner.close();
        printWriter.close();

    }
}
