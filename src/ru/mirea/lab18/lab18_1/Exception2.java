package ru.mirea.lab18.lab18_1;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        /*
            Если мы перехватываем исключение более общим классом (Exception)
            то компилятор будет ругаться, если далее мы попытаемся обработать
            исключение более конкретным классом исключений
         */
        try {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.err.println("Вы ввели не число!");
        } catch (Exception e) {
            System.err.println("Error!");
        }

    }
}
