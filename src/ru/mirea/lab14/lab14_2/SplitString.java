package ru.mirea.lab14.lab14_2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SplitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введение строки пользователем
        System.out.print("Введите строку для разбивки: ");
        String input = scanner.nextLine();

        // Введение регулярного выражения пользователем
        System.out.print("Введите регулярное выражение для разбивки строки: ");
        String regex = scanner.nextLine();

        // Попытка создания шаблона регулярного выражения
        try {
            Pattern.compile(regex);  // Проверяем корректность регулярного выражения
        } catch (PatternSyntaxException e) {
            System.out.println("Некорректное регулярное выражение. Попробуйте снова.");
            return;
        }

        // Разделение строки по регулярному выражению
        String[] elements = input.split(regex);

        // Вывод результатов
        System.out.println("Результат разбиения строки:");
        for (String element : elements) {
            System.out.println(element.isEmpty() ? "(пустой элемент)" : element);
        }

        scanner.close();
    }
}