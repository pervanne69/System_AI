package ru.mirea.lab1;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n = 10;
        double harmonicSum = 0.0;
        System.out.printf("First %d number of harmonic series\n", n);
        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
            System.out.printf("Harmonic number %d = %.4f\n", i, harmonicSum);
        }
    }
}
