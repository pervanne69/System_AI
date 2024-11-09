package ru.mirea.lab24.patterns.factory;

public class Tester {
    public static void main(String[] args) {
        PC pc = new PC();
        System.out.println(pc.getCpu());
        System.out.println(pc.getRam());
        System.out.println(pc.getHdd());
    }
}
