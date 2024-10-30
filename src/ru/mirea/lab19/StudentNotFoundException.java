package ru.mirea.lab19;

// Исключение для случая, когда студент не найден
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
