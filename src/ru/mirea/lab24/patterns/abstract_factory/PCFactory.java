package ru.mirea.lab24.patterns.abstract_factory;

import ru.mirea.lab24.patterns.factory.Computer;
import ru.mirea.lab24.patterns.factory.PC;

public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String cpu;
    private String hdd;

    public PCFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
