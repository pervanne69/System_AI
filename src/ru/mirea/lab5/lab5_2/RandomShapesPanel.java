package ru.mirea.lab5.lab5_2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesPanel extends JPanel {
    private final Shape[] shapes;
    private static final int ROWS = 4;
    private static final int COLS = 5;

    public RandomShapesPanel() {
        Random rand = new Random();
        shapes = new Shape[ROWS * COLS];

        int panelWidth = 500;
        int panelHeight = 500;
        int cellWidth = panelWidth / COLS;
        int cellHeight = panelHeight / ROWS;

        for (int i = 0; i < shapes.length; i++) {
            int row = i / COLS;
            int col = i % COLS;
            int x = col * cellWidth + cellWidth / 4;
            int y = row * cellHeight + cellHeight / 4;

            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int choice = rand.nextInt(0, 3);
            if (choice == 0) {
                int radius = rand.nextInt(50) + 10;
                shapes[i] = new Circle(x, y, radius, color);
            } else if (choice == 1) {
                int width = rand.nextInt(100) + 20;
                int height = rand.nextInt(100) + 20;
                shapes[i] = new Rectangle(x, y, width, height, color);
            } else {
                int side = rand.nextInt(100) + 20;
                shapes[i] = new Square(x, y, side, color);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        RandomShapesPanel panel = new RandomShapesPanel();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}