package ru.mirea.lab20.lab20_1;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
