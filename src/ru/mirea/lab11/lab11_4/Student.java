package ru.mirea.lab11.lab11_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDate birthDate;

    public Student(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getFormattedBirthDate(String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return birthDate.format(formatter);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' + ", birthDate=" + getFormattedBirthDate("dd.MM.yyyy") + '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Иван Иванов", LocalDate.of(1995, 12, 15));
        System.out.println(student);

        System.out.println(student.getFormattedBirthDate("yyyy-MM-dd"));
        System.out.println(student.getFormattedBirthDate("dd MMMM yyyy"));
    }
}