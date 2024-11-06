package ru.mirea.lab20.lab20_1;

public class TestGenericClass {
    public static void main(String[] args) {
        // Инициализации экземпляра класса GenericClass
        String firstValue = "Yes";
        Dog secondValue = new Dog();
        String thirdValue = "Hello";
        GenericClass<String, Dog, String> genericClass = new GenericClass<String, Dog, String>(
                firstValue, secondValue, thirdValue);

        // Вывод в коносль имен классов для трех переменных класса GenericClass
        genericClass.printClassNames();


        // Получаем значения переменных
        System.out.println("First: " + genericClass.getT());
        System.out.println("Second: ");
        genericClass.getValue().makeSound();
        System.out.println("Third: " + genericClass.getKey());

    }
}
