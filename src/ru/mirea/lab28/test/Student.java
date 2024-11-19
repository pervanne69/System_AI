package ru.mirea.lab28.test;

import java.util.Objects;

public class Student {
    private int number;
    private String name;
    private int age;

    public Student(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;

        if (age != student.age) {
            return false;
        }
        if (number != student.number) {
            return false;
        }
        if (!Objects.equals(name, student.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = number;

        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name=" + name + "\n" +
                ", age=" + age + "}";
    }
}

