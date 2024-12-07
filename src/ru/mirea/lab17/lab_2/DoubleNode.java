package ru.mirea.lab17.lab_2;

public class DoubleNode {
    String name;
    int age;
    DoubleNode next;
    DoubleNode prev;

    public DoubleNode(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
        this.prev = null;
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name + ", Возраст " + age);
    }
}
