package ru.mirea.lab6.lab6_2;

import java.util.Formatter;

public class DegreesKelvin implements Convertable {
    private final double celsiusTemperature;
    private double kelvinTemperature;

    public DegreesKelvin(double celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    @Override
    public void convert() {
       kelvinTemperature =  celsiusTemperature + 273.15;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        formatter.format("%.2f celsius = %.2f fahrenheit", celsiusTemperature, kelvinTemperature);
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
