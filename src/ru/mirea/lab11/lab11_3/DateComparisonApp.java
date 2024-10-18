package ru.mirea.lab11.lab11_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparisonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Введите дату в формате yyyy-MM-dd:");
        String userInput = scanner.nextLine();

        try {
            LocalDate inputDate = LocalDate.parse(userInput, formatter);
            LocalDate currentDate = LocalDate.now();

            if (inputDate.isBefore(currentDate)) {
                System.out.println("Введенная дата раньше текущей даты.");
            } else if (inputDate.isAfter(currentDate)) {
                System.out.println("Введенная дата позже текущей даты.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Ошибка: неправильный формат даты. Введите дату в формате yyyy-MM-dd.");
        }

        scanner.close();
    }
}