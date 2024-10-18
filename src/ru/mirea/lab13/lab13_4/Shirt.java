package ru.mirea.lab13.lab13_4;

class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public Shirt(String shirtData) {
        String[] parts = shirtData.split(","); // Разделяем строку по запятой
        this.id = parts[0];
        this.name = parts[1];
        this.color = parts[2];
        this.size = parts[3];
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Color: " + color + "\n" +
                "Size: " + size + "\n";
    }

    public static void main(String[] args) {
        String[] shirts = {
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] shirtObjects = new Shirt[shirts.length];

        for (int i = 0; i < shirts.length; i++) {
            shirtObjects[i] = new Shirt(shirts[i]);
        }

        // Выводим каждый объект на консоль
        for (Shirt shirt : shirtObjects) {
            System.out.println(shirt);
        }
    }
}