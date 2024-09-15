package ru.mirea.lab3.lab3_3;

public class SomeToDo {
    public static void main(String[] args) {
        // 1. Создаем объекты Double с использованием метода valueOf
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("42.0");
        System.out.println("doubleObj1: " + doubleObj1);
        System.out.println("doubleObj2: " + doubleObj2);

        // 2. Преобразование значения типа String к типу double
        String str = "3.1415";
        double value = Double.parseDouble(str);
        System.out.println("Преобразованное значение из строки: " + value);

        // 3. Преобразование объекта класса Double ко всем примитивным типам
        Double doubleObj = Double.valueOf(123.456);
        double d = doubleObj.doubleValue();
        int i = doubleObj.intValue();
        byte b = doubleObj.byteValue();
        short s = doubleObj.shortValue();
        long l = doubleObj.longValue();
        float f = doubleObj.floatValue();
        System.out.println("double: " + d);
        System.out.println("int: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("long: " + l);
        System.out.println("float: " + f);

        // 4. Вывод значения объекта Double на консоль
        System.out.println("Значение объекта Double: " + doubleObj);

        // 5. Преобразование литерала типа double к строке
        String doubleStr = Double.toString(3.14);
        System.out.println("Преобразованное значение double в строку: " + doubleStr);
    }
}
