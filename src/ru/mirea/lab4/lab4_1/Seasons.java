package ru.mirea.lab4.lab4_1;


public class Seasons {
    public enum Season {
        WINTER(3.6) {
            @Override
            public void getDescription() {
                System.out.println("Холодное время года");
            }
        },
        SPRING(14f) {
            @Override
            public void getDescription() {
                System.out.println("Цветущее время года");
            }
        },
        SUMMER(17f) {
            @Override
            public void getDescription() {
                System.out.println("Теплое время года");
            }
        },
        AUTUMN(11.1) {
            @Override
            public void getDescription() {
                System.out.println("Прохладное время года");
            }
        };


        private final double temp;

        Season(double temp) {
            this.temp = temp;
        }

        public double getTemp() {
            return temp;
        }

        private int getMonthIndex() {
            return this.ordinal() + 1;
        }

        public abstract void getDescription();
    }

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

        for (Season season: Season.values()) {
            System.out.printf("%s: Средняя температура - %.2f, Описание времени года - ", season, season.getTemp());
            season.getDescription();
        }
    }
}
