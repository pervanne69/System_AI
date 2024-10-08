package ru.mirea.lab4.part_1.lab4_1;

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