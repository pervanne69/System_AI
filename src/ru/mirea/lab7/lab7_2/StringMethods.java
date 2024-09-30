package ru.mirea.lab7.lab7_2;

public interface StringMethods {
    static int stringLength(String string) {
        int result = 0;
        for (char _ : string.toCharArray()) {
            result += 1;
        }
        return result;
    }

    static String stringOdd(String string) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < stringLength(string); i++) {
            if (i % 2 != 0) {
                newString.append(string.charAt(i));
            }
        }
        return newString.toString();
    }

    static String reverse(String string) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = stringLength(string) - 1; i >= 0; i--) {
            reversedString.append(string.charAt(i));

        }
        return reversedString.toString();
    }
}
