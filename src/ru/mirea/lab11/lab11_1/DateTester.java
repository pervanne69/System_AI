package ru.mirea.lab11.lab11_1;

import java.util.Arrays;
import java.util.Date;

import java.text.SimpleDateFormat;

import java.util.Random;

public class DateTester {

    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat();
        Random rand = new Random();
        Developer developer1 = new Developer("Jobs", now);
        Developer developer2 = new Developer("Zukerberg", now);
        Developer developer3 = new Developer("Pascal", now);

        Developer[] developers = {developer1, developer2, developer3};

        for (int i = 0; i < developers.length; i++) {
            try {
                Thread.sleep(rand.nextInt(1000, 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Date endDate = new Date();
            developers[i].setSolveTask(endDate);
        }


        System.out.println(Arrays.toString(developers));

    }


}
