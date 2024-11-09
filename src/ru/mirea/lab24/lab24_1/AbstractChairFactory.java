package ru.mirea.lab24.lab24_1;

interface AbstractChairFactory {
    VictorianChair createVictorianChair(int age);
    MagicChair createMagicianChair();
    FunctionChair createFunctionalChair();
}