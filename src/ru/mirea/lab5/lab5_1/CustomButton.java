package ru.mirea.lab5.lab5_1;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    private Color backgroundColor;
    private Color foregroundColor;

    public CustomButton(String text, Color backgroundColor, Color foregroundColor) {
        super(text);
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(true); // Делаем кнопку непрозрачной
        setBackground(backgroundColor);
        setForeground(foregroundColor);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }
}
