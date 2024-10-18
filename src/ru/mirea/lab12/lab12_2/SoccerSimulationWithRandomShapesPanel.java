package ru.mirea.lab12.lab12_2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class SoccerSimulationWithRandomShapesPanel extends JPanel {
    private Random random = new Random();
    private SoccerSimulation soccerSimulation;

    public SoccerSimulationWithRandomShapesPanel() {
        this.soccerSimulation = new SoccerSimulation();
        this.soccerSimulation.startSimulation();
    }

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

    public static void main(String[] args) {
        JFrame frame = new JFrame("Soccer Simulation with Random Shapes Panel");
        SoccerSimulationWithRandomShapesPanel panel = new SoccerSimulationWithRandomShapesPanel();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}