package ru.mirea.lab6.lab6_2;

import java.util.Formatter;

public class DegreesFahrenheit implements Convertable {
    private final double celsiusTemperature;
    private double fahrenheitTemperature;

    public DegreesFahrenheit(double celsiusTemperature) {
        this.celsiusTemperature = celsiusTemperature;
    }

    @Override
    public void convert() {
        fahrenheitTemperature = celsiusTemperature * 1.8 + 32;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        formatter.format("%.2f celsius = %.2f fahrenheit", celsiusTemperature, fahrenheitTemperature);
        String result = formatter.toString();
        formatter.close();
        return result;
    }

}
