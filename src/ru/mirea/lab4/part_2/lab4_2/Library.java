package ru.mirea.lab4.part_2.lab4_2;

import java.time.LocalDate;

public class Library {
    public static void main(String[] args) {
        Reader reader = new Reader("Петров В. В.", "12345", "Филология",
                LocalDate.of(2006, 11, 1), "123-456-7890");

        // Пример использования перегруженных методов
        reader.takeBook(3);
        reader.takeBook("Приключения", "Словарь", "Энциклопедия");

        Book book1 = new Book("Приключения", "Иванов И. И.");
        Book book2 = new Book("Словарь", "Петров П. П.");
        Book book3 = new Book("Энциклопедия", "Сидоров С. С.");

        reader.takeBook(book1, book2, book3);

        reader.returnBook(3);
        reader.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader.returnBook(book1, book2, book3);
    }
}
