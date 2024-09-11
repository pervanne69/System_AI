package ru.mirea.lab2.lab2_2;

import java.util.Scanner;

public class DogTester {
    public static boolean validateAge(Object age) {
        return age instanceof Integer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogKennel dogKennel = new DogKennel();

        String dogName;
        int age = 0;
        Object age_tmp;

        System.out.println("Welcome to our dog kennel");
        System.out.println("You can bring your dog to our friendly kennel");

        do {
            System.out.print("Write a name of your dog: ");
            dogName = scanner.nextLine();
            System.out.print("Write a correct age of your dog: ");
            age_tmp = scanner.nextLine();
            do {
                System.out.print("Write a correct age of your dog: ");
                age_tmp = scanner.nextLine();
            } while (!scanner.hasNextInt());
            age_tmp = scanner.nextLine();
            System.out.println(age_tmp);
            age = (Integer) age_tmp;

            dogKennel.addDogToKennel(new Dog(dogName, age));

            dogKennel.getDogsNames();

        } while (!scanner.nextLine().equals("exit"));
    }
}
