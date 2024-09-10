package ru.mirea.lab2;

import java.util.Objects;
import java.util.Scanner;

public class Tester {
    private static boolean validateEmail(String email) {
        int lastIndexOfDog = email.lastIndexOf("@");
        int IndexOfDog = email.indexOf("@");
        int lastIndexOfDot = email.lastIndexOf(".");
        if (lastIndexOfDog == IndexOfDog) {
            return lastIndexOfDot > lastIndexOfDog;
        }
        return false;
    }
    private static boolean validateGender(Object gender) {
        if (gender instanceof Character) {
            char gender_f = (Character) gender;
            return gender_f == 'm' || gender_f == 'f';
        }
        return false;
    }
    public static void main(String[] args) {
        String name;
        String email;
        char gender;
        String genderTmp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя автора: ");
        if (sc.hasNextLine()) {
            name = sc.nextLine();
            System.out.print("Введите почту автора: ");
            if (sc.hasNextLine()) {
                email = sc.nextLine();
                while (!(validateEmail(email))) {
                    System.out.println("\nНеправильно указана почта. Попробуйте еще раз.\n");
                    System.out.print("Введите почту автора: ");
                    if (sc.hasNextLine()) {
                        email = sc.nextLine();
                    }
                }
                System.out.print("Введите пол автора: ");
                if (sc.hasNext()) {
                    genderTmp = sc.nextLine();
                    gender = genderTmp.charAt(0);
                    while (!validateGender(gender)) {
                        System.out.println("\nНеправильно указан пол. Попробуйте еще раз.\n");
                        System.out.print("Введите пол автора: ");
                        if (sc.hasNext()) {
                            genderTmp = sc.nextLine();
                            gender = genderTmp.charAt(0);
                            System.out.println(gender);
                        }
                    }
                    Author author1 = new Author(name, email, gender);
                    System.out.printf("Имя автора: %s, Почта автора: %s, Пол автора: %c",
                            author1.getName(), author1.getEmail(), author1.getGender());
                }

            }
        }

    }
}
