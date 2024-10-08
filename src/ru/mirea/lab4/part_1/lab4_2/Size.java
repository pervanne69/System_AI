package ru.mirea.lab4.part_1.lab4_2;

public enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "extra extra small";
        }
    },
    XS(34) {
        @Override
        public String getDescription() {
            return "extra small";
        }
    },
    S(36) {
        @Override
        public String getDescription() {
            return "small";
        }
    },
    M(38) {
        @Override
        public String getDescription() {
            return "medium";
        }
    },
    L(40) {
        @Override
        public String getDescription() {
            return "large";
        }
    };

    private final int euroSize;


    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public abstract String getDescription();
}