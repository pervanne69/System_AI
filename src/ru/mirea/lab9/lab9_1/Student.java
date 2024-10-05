package ru.mirea.lab9.lab9_1;

import java.util.Scanner;
import java.util.Random;

public class Student implements Comparable<Student> {
    private final int iDNumber;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(current) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }
    }

    @Override
    public String toString() {
        return "Student with Student id: " + iDNumber;
    }

    public static void main(String[] args) {
        int n;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество студентов");

        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели не число!");
            sc.next();
        }
        n = sc.nextInt();

        Student[] students = new Student[n];

        System.out.println("Случайно сгенерированный набора студентов");
        for (int i = 0; i < n; i++) {
            Student student = new Student(Math.abs(rand.nextInt(10, 100)));
            students[i] = student;
            System.out.println(students[i]);
        }

        insertionSort(students);

        System.out.println("Отсортированный массив студентов");

        for (Student student : students) {
            System.out.println(student);
        }

        sc.close();

    }

}
