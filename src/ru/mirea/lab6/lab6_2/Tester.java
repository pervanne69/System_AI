package ru.mirea.lab6.lab6_2;

public class Tester {
    public static void main(String[] args) {
        double celsiusTemperature = 1111;

        DegreesFahrenheit degreesFahrenheit = new DegreesFahrenheit(celsiusTemperature);
        DegreesKelvin degreesKelvin = new DegreesKelvin(celsiusTemperature);

        degreesFahrenheit.convert();
        degreesKelvin.convert();

        System.out.println(degreesFahrenheit);
        System.out.println(degreesKelvin);
    }
}
