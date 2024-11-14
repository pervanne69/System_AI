package ru.mirea.list_ex1.lab_1;

import java.util.Scanner;

public class Node {
    String name;
    int age;

    public void readAttributes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        name = sc.nextLine();
        System.out.println("Введите возраст: ");
        while (!sc.hasNextInt()) {
            System.out.println("Ошибка! Введите корректное значение для возраста:");
            sc.next();
        }
        age = sc.nextInt();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name + " Возраст " + age);
    }
}
