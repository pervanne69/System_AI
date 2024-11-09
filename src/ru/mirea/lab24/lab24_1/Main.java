package ru.mirea.lab24.lab24_1;

public class Main {
    public static void main(String[] args) {
        AbstractChairFactory chairFactory = new ChairFactory();

        Client client = new Client();

        // Создание и использование VictorianChair
        VictorianChair victorianChair = chairFactory.createVictorianChair(100);
        client.setChair(victorianChair);
        client.sit();

        // Создание и использование MagicChair
        MagicChair magicChair = chairFactory.createMagicianChair();
        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();

        // Создание и использование FunctionalChair
        FunctionChair functionalChair = chairFactory.createFunctionalChair();
        client.setChair(functionalChair);
        client.sit();
        System.out.println("Результат сложения: " + functionalChair.sum(3, 5));
    }
}