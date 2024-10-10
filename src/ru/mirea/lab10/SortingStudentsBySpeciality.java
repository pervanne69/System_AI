package ru.mirea.lab10;

import java.util.Comparator;

public class SortingStudentsBySpeciality implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getSpeciality().compareTo(student2.getSpeciality());
    }
}
