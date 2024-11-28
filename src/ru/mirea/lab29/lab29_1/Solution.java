package ru.mirea.lab29.lab29_1;

import java.util.Scanner;
import java.io.PrintWriter;

public class Solution {
    private static final int INF = 1000 * 1000 * 1000;


    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.solve();
    }

    private void solve() {
        Scanner sc = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(System.out);

        // считываем число вершин графа
        int vertexCount = sc.nextInt();

        // Граф будем хранить в матрице смежности
        int[][] g = new int[vertexCount][vertexCount];

        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {

                // считываем вес ребра между вершинами
                // i и g соответственно
                g[i][j] = sc.nextInt();

                // По условию если g[i][j] = 0, то это
                // означает, что дуги из i в j нет;
                // в этом случае расстояние между этими
                // вершинами бесконечно валеко

                if (g[i][j] == 0) {
                    g[i][j] = INF;
                }
            }
        }

        // Согласно алгоритму будем обоновлять
        // ответ для каждой пары вершин i и j
        // перебирая промежуточную вершину k

        for (int k = 0; k < vertexCount; k++) {
            for (int i = 0; i < vertexCount; i++) {
                for (int j = 0; j < vertexCount; j++) {
                    g[i][j] = Math.min(g[i][j], g[i][k] + g[k][j]);
                }
            }
        }

        // Для каждой пары вершин выведем величину
        // кратчайшего пети от i до j, или 0,
        // если j не достижима из i
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                if (g[i][j] == INF) {
                    pw.print(0 + " ");
                } else {
                    pw.print(g[i][j] + " ");
                }
            }
            pw.println();
        }

        sc.close();
        pw.close();
    }
}
