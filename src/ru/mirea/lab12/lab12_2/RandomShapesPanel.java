package ru.mirea.lab12.lab12_2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class RandomShapesPanel extends JPanel {
    private Random random = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(getWidth());
            int y = random.nextInt(getHeight());
            int width = random.nextInt(100);
            int height = random.nextInt(100);
            g.drawRect(x, y, width, height);
        }
    }
}