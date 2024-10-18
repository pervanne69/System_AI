package ru.mirea.lab5.lab5_2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapesPanel extends JPanel {
    private Shape[] shapes;
    private static final int ROWS = 4;
    private static final int COLS = 5;

    public RandomShapesPanel() {
        setLayout(new GridBagLayout());

        Random rand = new Random();
        shapes = new Shape[ROWS * COLS];

        for (int i = 0; i < shapes.length; i++) {
            int choice = rand.nextInt(0, 3);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            if (choice == 0) {
                int radius = rand.nextInt(50) + 10;
                shapes[i] = new Circle(0, 0, radius, color);
            } else if (choice == 1) {
                int width = rand.nextInt(100) + 20;
                int height = rand.nextInt(100) + 20;
                shapes[i] = new Rectangle(0, 0, width, height, color);
            } else {
                int side = rand.nextInt(100) + 20;
                shapes[i] = new Square(0, 0, side, color);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        int cellWidth = panelWidth / COLS;
        int cellHeight = panelHeight / ROWS;

        for (int i = 0; i < shapes.length; i++) {
            int row = i / COLS;
            int col = i % COLS;
            int x = col * cellWidth + cellWidth / 4;
            int y = row * cellHeight + cellHeight / 4;
            shapes[i].setPosition(x, y);
            shapes[i].draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        RandomShapesPanel panel = new RandomShapesPanel();

        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;

        frame.add(panel, gbc);
        frame.setSize(new Dimension(700, 700));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}