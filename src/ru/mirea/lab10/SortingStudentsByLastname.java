package ru.mirea.lab10;

import java.util.Comparator;


public class SortingStudentsByLastname implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getLastname().compareTo(student2.getLastname());
    }
}
