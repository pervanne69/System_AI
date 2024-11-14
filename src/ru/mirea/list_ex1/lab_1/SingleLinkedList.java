package ru.mirea.list_ex1.lab_1;

import java.util.LinkedList;

public class SingleLinkedList {
    LinkedList<Node> list = new LinkedList<Node>();

    public void deleteNode(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove();
            System.out.println("Элемент удален");
        } else {
            System.out.println("Элемент не найден");
        }
    }

    public void addNode() {
        Node node = new Node();
        node.readAttributes();
        list.add(node);
    }

    public void displayNodes() {
        for (Node node: list) {
            node.displayAttributes();
        }
    }

    public void clearList() {
        list.clear();
        System.out.println("Список очищен");
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
