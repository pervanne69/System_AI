package ru.mirea.list_ex1.lab_2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;
        String name;
        do {
            System.out.println("Меню");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Показать элементы");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить на пустоту");
            System.out.println("6. Выход");
            System.out.println("Выберете опцию: ");
            while (!sc.hasNextInt()) {
                System.out.println("Такой опции не существует, пожалуйста выберете опцию, представленную в меню выше");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите имя:");
                    name = sc.next();
                    System.out.println("Введите возраст:");
                    while (!sc.hasNextInt()) {
                        System.out.println("Введите корректное значение! ");
                        sc.next();
                    }
                    int age = sc.nextInt();
                    doubleLinkedList.addNode(name, age);
                    break;
                case 2:
                    System.out.print("Введите имя для удаления: ");
                    name = sc.next();
                    doubleLinkedList.deleteNode(name);
                    break;
                case 3:
                    doubleLinkedList.displayNode();
                    break;
                case 4:
                    doubleLinkedList.clearList();
                    break;
                case 5:
                    System.out.println("Список пуст: " + doubleLinkedList.isEmpty());
                    break;
            }
        } while (choice != 6);

        System.out.println("Программа завершена");
    }

}
