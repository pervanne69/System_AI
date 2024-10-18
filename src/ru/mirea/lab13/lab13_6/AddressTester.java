package ru.mirea.lab13.lab13_6;

public class AddressTester {
    public static void main(String[] args) {
        System.out.println("Тестирование разделением по запятой:");
        String address1 = "Россия, Московская область, Москва, Красная площадь, 1, 1А, 101";
        String address2 = "США, Калифорния, Сан-Франциско, Маркет-стрит, 2, B, 202";

        Address addr1 = new Address(address1);
        Address addr2 = new Address(address2);

        System.out.println(addr1);
        System.out.println(addr2);

        System.out.println("\nТестирование разделением по любому из символов , . ; -:");
        String address3 = "Канада, Онтарио, Торонто, Бэй-стрит, 3, C, 303";
        String address4 = "Франция; Иль-де-Франс; Париж; Елисейские поля; 4; D; 404";
        String address5 = "Германия; Северный Рейн-Вестфалия; Кёльн; Hauptstrasse; 5; E; 505";
        String address6 = "Италия-Лацио-Рим-Виа-дель-Корсо-6-F-606";

        Address addr3 = new Address(address3, ",.;-");
        Address addr4 = new Address(address4, ",.;-");
        Address addr5 = new Address(address5, ",.;-");
        Address addr6 = new Address(address6, ",.;-");

        System.out.println(addr3);
        System.out.println(addr4);
        System.out.println(addr5);
        System.out.println(addr6);
    }
}