package ru.mirea.lab2.lab2_2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DogKennel {

    private List<Dog> dogs;

    public DogKennel() {
        this.dogs = new ArrayList<>();
    }

    public void getDogsHumanAge() {
        for (Dog dog : dogs) {
            System.out.println(dog.getNickname() + " " + dog.toHumanAge(dog.getAge()));
        }
    }

    public void addDogToKennel(Dog dog) {
        dogs.add(dog);
    }



    public void getDogsNames() {
        for (Dog dog : dogs) {
            System.out.println(dog.getNickname());
        }
    }

}
