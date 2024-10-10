package ru.mirea.lab10;

import java.util.Comparator;


public class SortingStudentsByCourse implements Comparator<Student>{
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getCourse(), student1.getCourse());
    }
}
