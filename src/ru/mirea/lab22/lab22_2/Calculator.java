package ru.mirea.lab22.lab22_2;

import java.util.Stack;

public class Calculator {
    public static double evaluate(String expression) {
        Stack<Double> stack = new Stack<>();

        String[] tokens = expression.split(" ");
        double a;
        double b;

        for (String token : tokens) {
            switch (token) {
                case "+":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a * b);
                    break;
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    if (b == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                    stack.push(a / b);
                    break;
                default:
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression1 = "2 3 4 * +";
        String expression2 = "2 3 4 5 6 * + - /";
        try {
            double result = evaluate(expression1);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            double result = evaluate(expression2);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}
