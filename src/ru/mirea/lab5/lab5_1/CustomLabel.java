package ru.mirea.lab5.lab5_1;

import javax.swing.*;
import java.awt.*;

public class CustomLabel extends JLabel {
    private Color fontColor;
    private int fontSize;

    public CustomLabel(String text, Color fontColor, int fontSize) {
        super(text);
        this.fontColor = fontColor;
        this.fontSize = fontSize;
        setFont(new Font("Serif", Font.BOLD, fontSize));
        setForeground(fontColor);
        setHorizontalAlignment(SwingConstants.CENTER);

    }
}
