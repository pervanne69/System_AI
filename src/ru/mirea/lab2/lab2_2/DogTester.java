package ru.mirea.lab2.lab2_2;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogKennel dogKennel = new DogKennel();

        String dogName;
        String age_string;
        int age;

        System.out.println("Welcome to our dog kennel");
        System.out.println("You can bring your dog to our friendly kennel");

        do {
            System.out.print("Write a name of your dog: ");
            dogName = scanner.nextLine();
            do {
                System.out.print("Write a correct age of your dog: ");
                age_string = scanner.nextLine();
            } while (!age_string.matches("-?\\d+"));
            age = Integer.parseInt(age_string);

            dogKennel.addDogToKennel(new Dog(dogName, age));

            dogKennel.getDogsHumanAge();

            System.out.println("If you want to leave, type 'exit' in command line,\nelse type any other letter or word");

        } while (!scanner.nextLine().equals("exit"));
    }
}
