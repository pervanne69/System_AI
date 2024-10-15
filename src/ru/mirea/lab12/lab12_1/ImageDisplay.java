package ru.mirea.lab12.lab12_1;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ImageDisplay extends JFrame {

    private Image scaledImage;

    public ImageDisplay(String imagePath, int width, int height) {
        try {
            BufferedImage originalImage = ImageIO.read(new File(imagePath));
            scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ошибка при загрузке изображения: " +
                            ex.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

        setTitle("Image Display");
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(scaledImage, 0, 0, this);
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java ImageDisplay <image-path> <new-width> <new-height>");
            System.exit(1);
        }

        String imagePath = args[0];
        int width = Integer.parseInt(args[1]);
        int height = Integer.parseInt(args[2]);

        SwingUtilities.invokeLater(() -> {
            ImageDisplay frame = new ImageDisplay(imagePath, width, height);
            frame.setVisible(true);
        });
    }
}