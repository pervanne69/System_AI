package ru.mirea.lab24.lab24_1;

class FunctionChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Вы сидите на многофункциональном стуле.");
    }
}