package ru.mirea.lab13.lab13_1;

public class StringLearning {

    public static void printString(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s = "I like Java!!!";
        printString(s);

        // Последний символ строки
        System.out.println(s.charAt(s.length() - 1));

        // endsWith
        System.out.println(s.endsWith("!!!"));

        // startsWith
        System.out.println(s.startsWith("I like"));

        // contains
        System.out.println(s.contains("Java"));

        // indexOf
        System.out.println(s.indexOf("Java"));

        // replace
        System.out.println(s.replace("a", "o"));

        // toUpperCase
        System.out.println(s.toUpperCase());

        // toLowerCase
        System.out.println(s.toLowerCase());

        // substring

        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("Java") + 4));

    }
}
