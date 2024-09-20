package ru.mirea.lab4.part_1.lab4_2;


public class Atelier {
    public void dressMen(Clothes[] clothes) {
        for (Clothes cloth: clothes) {
            if (cloth instanceof MenClothing) {
                ((MenClothing) cloth).dressMen();
            }
        }
    }

    public void dressWomen(Clothes[] clothes) {
        for (Clothes cloth: clothes) {
            if (cloth instanceof WomenClothing) {
                ((WomenClothing) cloth).dressWomen();
            }
        }
    }
}
