package ru.mirea.lab8.lab8_1;


import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        word = sc.nextLine();
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
        sc.close();
    }
}

