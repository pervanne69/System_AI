package ru.mirea.lab24.patterns.abstract_factory;

import ru.mirea.lab24.patterns.factory.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
