package ru.mirea.lab1;

public class CommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Аргументы командной строки:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("Аргументы командной строки отсутствуют.");
        }
    }
}
