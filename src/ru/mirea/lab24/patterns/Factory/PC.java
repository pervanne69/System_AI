package ru.mirea.lab24.patterns.Factory;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HWDiskStore;

import java.util.Formatter;

public class PC extends Computer {
    private final String ram;
    private String hdd;
    private final String cpu;

    public PC() {
        SystemInfo si = new SystemInfo();

        // Получаем информацию о процессоре

        CentralProcessor processor = si.getHardware().getProcessor();
        Formatter formatProcessor = new Formatter();

        String model = processor.getProcessorIdentifier().getModel();
        int numberOfCores = processor.getPhysicalProcessorCount();
        int numberOfLogicalProcessors = processor.getLogicalProcessorCount();

        formatProcessor.format("Processor: Model - %s, number of cores - %d, number of logical processors - %d",
                model, numberOfCores, numberOfLogicalProcessors);


        // Получаем информацию о памяти (RAM)

        GlobalMemory memory = si.getHardware().getMemory();
        Formatter formatMemory = new Formatter();

        long total = memory.getTotal() / (1024 * 1024 * 1024);
        long available = memory.getAvailable() / (1024 * 1024 * 1024);
        formatMemory.format("RAM: Total memory - %d GB, Available memory - %d GB",
                total, available);

        // Получаем информацию о диске (HDD)
        this.hdd = "Disks: ";
        Formatter formatDisk = new Formatter();

        for (HWDiskStore disk : si.getHardware().getDiskStores()) {
            String name = disk.getName();
            String modelOfDisk = disk.getModel();
            long totalDisk = disk.getSize() / (1024 * 1024 * 1024);
            long reads = disk.getReads();
            long writes = disk.getWrites();
            formatDisk.format("Name - %s, Model - %s, Total - %d, Number of Reads - %d, Number of Writes - %d",
                    name, modelOfDisk, totalDisk, reads, writes);
            this.hdd = this.hdd + formatDisk.toString();
        }

        this.ram = formatMemory.toString();
        this.cpu = formatProcessor.toString();
    }

    @Override
    public String getHdd() {
        return hdd;
    }

    @Override
    public String getCpu() {
        return cpu;
    }

    @Override
    public String getRam() {
        return ram;
    }
}
