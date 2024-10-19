package ru.mirea.lab14.lab14_6;

import java.time.LocalDate;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CheckDate {

    public static boolean isLogicalDate(String date) {
        try {
            String[] parts = date.split("/");
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isValidDate(Pattern pattern, String string) {
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()) {
            return isLogicalDate(string);
        }
        return matcher.matches();
    }
    public static void main(String[] args) {
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19\\d{2})|(2\\d{3}))";
        String[] validDates = {"29/02/2000", "30/04/2003", "01/01/2003"};
        String[] invalidDates = {"29/02/2001", "30-04-2003", "1/1/1899"};

        Pattern pattern = Pattern.compile(regex);

        for (String date: validDates) {
            System.out.println("Проверка " + date + ": " +
                    isValidDate(pattern, date));
        }
        for (String date : invalidDates) {
            System.out.println("Проверка " + date + ": " +
                    isValidDate(pattern, date));
        }
    }
}