package ru.mirea.lab4.lab4_1;


public class Seasons {
    public static void checkLovelySeason(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case AUTUMN:
                System.out.println("Я не люблю осень!");
                break;
            case SPRING:
                System.out.println("Я немножко люблю весну!");
                break;
        }
    }


    public static void main(String[] args) {
        Season winter = Season.WINTER;
        checkLovelySeason(winter);

        for (Season season : Season.values()) {
            System.out.printf("%s: Средняя температура - %.2f, Описание времени года - ", season, season.getTemp());
            season.getDescription();
        }
    }
}
