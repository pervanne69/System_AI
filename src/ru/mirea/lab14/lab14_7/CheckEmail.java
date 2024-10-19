package ru.mirea.lab14.lab14_7;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckEmail {

    public static boolean isValidEmail(String email, Pattern pattern) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*@[a-zA-Z0-9.-](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        String[] validEmails = {"user@example.com", "root@localhost"};
        String[] invalidEmails = {"myhost@@@com.ru", "@my.ru", "Julia String"};

        Pattern pattern = Pattern.compile(regex);

        for (String email : validEmails) {
            System.out.println("Проверка: " + email + " - " + isValidEmail(email, pattern));
        }

        for (String email : invalidEmails) {
            System.out.println("Проверка: " + email + " - " + isValidEmail(email, pattern));
        }
    }
}
