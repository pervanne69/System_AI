package ru.mirea.lab28.lab28_1;

import java.util.HashMap;

public class Tester {
    public static void main(String[] args) {
        HashMap<String, String> map = CustomMap.createMap();

        System.out.println(CustomMap.getSameLastNameCount(map));
        System.out.println(CustomMap.getSameFirstNameCount(map));
    }
}
