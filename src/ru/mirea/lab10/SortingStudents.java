package ru.mirea.lab10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import java.util.Scanner;


public class SortingStudents {
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

    public static void mergeSort(Student[] students, Comparator<Student> comparator) {
        if (students.length > 1) {
            int mid = students.length / 2;

            Student[] left = Arrays.copyOfRange(students, 0, mid);
            Student[] right = Arrays.copyOfRange(students, mid, students.length);

            mergeSort(left, comparator);
            mergeSort(right, comparator);

            merge(students, left, right, comparator);
        }
    }

    private static void merge(Student[] students, Student[] left, Student[] right, Comparator<Student> comparator) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (comparator.compare(left[i], right[j]) >= 0) {
                students[k++] = left[i++];
            } else {
                students[k++] = right[j++];
            }
        }

        while (i < left.length) {
            students[k++] = left[i++];
        }

        while (j < right.length) {
            students[k++] = right[j++];
        }
    }

    public static Student[] setArray(int n) {
        Random random = new Random();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student("FirstName" + i, "LastName" + i, "Speciality" + i,
                    random.nextInt(4) + 1, "Group" + i);
        }

        return students;
    }

    public static void outArray(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Main метод
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input count of students: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error! Input correct count of students");
            sc.next();
        }
        int n = sc.nextInt();
        Student[] students = setArray(n);

        System.out.println("Before Sorting:");
        outArray(students);

        Comparator<Student> scomp = new
                SortingStudentsByCourse().thenComparing(new
                SortingStudentsByName()).thenComparing(new
                SortingStudentsByLastname()).thenComparing(new
                SortingStudentsBySpeciality()).thenComparing(new
                SortingStudentsByGroup());
        quickSort(students, 0, students.length - 1, scomp);

        System.out.println("\nAfter QuickSort (By Course):");
        outArray(students);

        mergeSort(students, scomp);

        System.out.println("\nAfter MergeSort (By Course):");
        outArray(students);
    }
}