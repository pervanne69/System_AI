package ru.mirea.lab17.lab_1;

public class SingleLinkedList {
    private Node head;

    public SingleLinkedList() {
        this.head = null;
    }

    public void deleteNode(String name) {
        if (isEmpty()) return;

        if (head.name.equals(name)) {
            head = head.next;
        } else {
            Node current = head;
            while (current.next != null && current.next.name.equals(name)) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    }

    public void addNode(String name, int age) {
        Node newNode = new Node(name, age);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            current.displayAttributes();
            current = current.next;
        }
    }

    public void clearList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
