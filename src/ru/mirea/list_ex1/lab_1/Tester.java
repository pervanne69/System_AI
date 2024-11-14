package ru.mirea.list_ex1.lab_1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню");
            System.out.println("1. Добавить элемент");
            System.out.println("2. Удалить элемент");
            System.out.println("3. Показать элементы");
            System.out.println("4. Очистить список");
            System.out.println("5. Проверить на пустоту");
            System.out.println("0. Выйти");
            System.out.println("Выберете опцию: ");
            while (!sc.hasNextInt()) {
                System.out.println("Такой опции не существует, пожалуйста выберете опцию, представленную в меню выше");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    singleLinkedList.addNode();
                    break;
                case 2:
                    System.out.println("Введите индекс для удаления");
                    while (!sc.hasNextInt()) {
                        System.out.println("Введите корректный индекс");
                        sc.next();
                    }
                    int index = sc.nextInt();
                    singleLinkedList.deleteNode(index);
                    break;
                case 3:
                    singleLinkedList.displayNodes();
                    break;
                case 4:
                    singleLinkedList.clearList();
                    break;
                case 5:
                    System.out.println("Список пуст: " + singleLinkedList.isEmpty());
                    break;
            }
        } while (choice != 0);

        System.out.println("Программа завершена");
    }

}
