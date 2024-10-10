package ru.mirea.lab10;

import java.util.Comparator;

public class SortingStudentsByGroup implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        return student2.getGroup().compareTo(student1.getGroup());
    }
}
