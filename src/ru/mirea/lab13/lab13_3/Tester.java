package ru.mirea.lab13.lab13_3;

public class Tester {
    public static void main(String[] args) {
        // Примеры использования
        NumberFormat phone1 = new NumberFormat("+79175655655");
        NumberFormat phone2 = new NumberFormat("89175655655");
        NumberFormat phone3 = new NumberFormat("+104289652211");

        System.out.println(phone1.formatPhoneNumber()); // Вывод: +7 917-565-5655
        System.out.println(phone2.formatPhoneNumber()); // Вывод: +7 917-565-5655
        System.out.println(phone3.formatPhoneNumber()); // Вывод: +1 042-896-52211
    }
}
