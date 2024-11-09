package ru.mirea.lab24.lab24_1;

class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MagicChair createMagicianChair() {
        return new MagicChair();
    }

    @Override
    public FunctionChair createFunctionalChair() {
        return new FunctionChair();
    }
}

