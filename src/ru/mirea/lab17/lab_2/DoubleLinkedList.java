package ru.mirea.lab17.lab_2;

public class DoubleLinkedList {
    private DoubleNode head;
    private DoubleNode tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addNode(String name, int age) {
        DoubleNode newNode = new DoubleNode(name, age);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void deleteNode(String name) {
        if (isEmpty()) {
            System.out.println("Список пуст, удаление невозможно.");
            return;
        }

        DoubleNode current = head;
        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }

        if (current != null) {
            if (current == head) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            } else if (current == tail) {
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                }
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            System.out.println("Элемент с именем " + name + " удален.");
        } else {
            System.out.println("Элемент с именем " + name + " не найден.");
        }
    }

    public void displayNode() {
        DoubleNode current = head;
        while (current != null) {
            current.displayAttributes();
            current = current.next;
        }
    }

    public void clearList() {
        head = null;
        tail = null;
    }
}
