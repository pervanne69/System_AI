package ru.mirea.lab26.lab26_1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList();

        for (int i = 0; i < 10; i++) {
            a1.add(i);
        }
        System.out.println(a1);

        Iterator<Integer> it = a1.iterator();
        while (it.hasNext()) {
            int i = (Integer) it.next();

            System.out.print(i + " ");

            if (i % 2 != 0) {
                it.remove();
            }
        }
        System.out.println();
        System.out.println(a1);

    }
}
