package ru.mirea.lab13.lab13_2;


public class Tester {
    public static void main(String[] args) {
        Person person = new Person("Samvel", "", "asd");
        Person person2 = new Person("Samvel", "фыв", "asd");
        System.out.println(person.getFullName());
        System.out.println(person2.getFullName());
    }
}
