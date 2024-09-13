package ru.mirea.lab4.lab4_1;


public class Seasons {
    public enum Season {
        January(-5.8),
        February(-6.1),
        March(-0.5),
        April(5.5),
        May(14.7),
        June(16f),
        July(20f);
        August(),
        September,
        October,
        November,
        December;

        private final double temp;

        Season(double temp) {
            this.temp = temp;
        }

        private int getMonthIndex() {
            return this.ordinal() + 1;
        }
    }

    public static void checkLovelySeason(Season season) {
        switch (season) {
            case June, July, August:
                System.out.println("Я люблю лето!");
                break;
            case January, February, December:
                System.out.println("Я люблю зиму!");
                break;
            case September, October, November:
                System.out.println("Я не люблю осень!");
                break;
            case March, April, May:
                System.out.println("Я немножко люблю весну!");
                break;
        }
    }

    public static void main(String[] args) {
        Season jan = Season.January;
        Season apr = Season.April;
        System.out.println(jan.getMonthIndex());
        checkLovelySeason(apr);
    }
}
