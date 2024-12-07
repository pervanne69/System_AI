package ru.mirea.lab17.lab_1;

public class Node {
    String name;
    int age;
    Node next;

    public Node(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name + " Возраст " + age);
    }
}
