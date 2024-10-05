package ru.mirea.lab5.lab5_1;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    private Color backgroundColor;
    private Color foregroundColor;
    private int fontSize;

    public CustomButton(String text, Color backgroundColor, Color foregroundColor, int fontSize) {
        super(text);
        this.backgroundColor = backgroundColor;
        this.foregroundColor = foregroundColor;
        this.fontSize = fontSize;
        setContentAreaFilled(false);
        setFocusPainted(true);
        setBorderPainted(false);
        setOpaque(true); // Делаем кнопку непрозрачной
        setBackground(backgroundColor);
        setForeground(foregroundColor);
        setFont(new Font("Arial", Font.BOLD, fontSize));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }
}
