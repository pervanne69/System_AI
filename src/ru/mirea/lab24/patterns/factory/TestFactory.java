package ru.mirea.lab24.patterns.factory;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC");

        Computer server = ComputerFactory.getComputer("Server", "16 GB", "1 TB", "2.9 GHz");

        System.out.println("Factory PC config::" + pc);
        System.out.println("Factory Server config::" + server);

    }
}
