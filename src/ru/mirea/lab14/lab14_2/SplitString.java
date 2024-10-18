package ru.mirea.lab14.lab14_2;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        String[] words;
        System.out.println("Введите слова через пробел в одну строчку");
        input = sc.nextLine();
        words = input.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
