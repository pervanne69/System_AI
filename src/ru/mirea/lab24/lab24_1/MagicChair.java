package ru.mirea.lab24.lab24_1;

class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Происходит магия!");
    }

    @Override
    public void sit() {
        System.out.println("Вы сидите на магическом стуле.");
    }
}
