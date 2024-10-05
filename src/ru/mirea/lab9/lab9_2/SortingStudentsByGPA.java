package ru.mirea.lab9.lab9_2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.gpa, student2.gpa);
    }

    public static void quickSort(Student[] students, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pivotIndex = partition(students, low, high, comparator);

            quickSort(students, low, pivotIndex - 1, comparator);
            quickSort(students, pivotIndex + 1, high, comparator);
        }
    }

    private static int partition(Student[] students, int low, int high, Comparator<Student> comparator) {
        Student pivot = students[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(students[j], pivot) >= 0) {
                i++;

                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.9),
                new Student("Bob", 3.5),
                new Student("Charlie", 4.0),
                new Student("David", 3.2)
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        quickSort(students, 0, students.length - 1, sorter);

        for (Student student : students) {
            System.out.println("Student: " + student.name + ", GPA: " + student.gpa);
        }
    }
}
