package ru.mirea.lab17.lab_1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
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
                    singleLinkedList.addNode(name, age);
                    break;
                case 2:
                    System.out.print("Введите имя для удаления: ");
                    name = sc.next();
                    singleLinkedList.deleteNode(name);
                    break;
                case 3:
                    singleLinkedList.displayList();
                    break;
                case 4:
                    singleLinkedList.clearList();
                    break;
                case 5:
                    System.out.println("Список пуст: " + singleLinkedList.isEmpty());
                    break;
            }
        } while (choice != 6);

        System.out.println("Программа завершена");
    }

}
