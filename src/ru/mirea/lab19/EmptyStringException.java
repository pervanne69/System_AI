package ru.mirea.lab19;

// Исключение для случая, когда передана пустая строка
public class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}