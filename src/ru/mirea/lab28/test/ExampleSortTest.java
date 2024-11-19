package ru.mirea.lab28.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class ExampleSortTest {
    public static void main(String[] args) {

        Set<String> set = Collections.synchronizedSet(new HashSet<String>());

        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");

        System.out.println("Original HashSet: " + set);

        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);

        System.out.println("HashSet elements in sorted order using List: " + list);
    }
}
