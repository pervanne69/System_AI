package ru.mirea.lab5.lab5_1;

import javax.swing.*;
import java.awt.*;


public class SoccerSimulation extends JFrame {

    private int milanScore = 0;
    private int madridScore = 0;


    private final CustomLabel resultLabel;
    private final CustomLabel lastScorerLabel;
    private final CustomLabel winnerLabel;

    public SoccerSimulation() {
        setTitle("Soccer Match");
        setSize(new Dimension(700, 700));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        Color JFrameBackgroundColor = new Color(152, 251, 152);
        Color labelPanelColor = new Color(152, 251, 152);
        Color milanButtonBackgroundColor = new Color(255, 215, 0);
        Color milanButtonForegroundColor = new Color(0, 0, 0);
        Color madridButtonBackgroundColor = new Color(255, 127, 80);
        Color madridButtonForegroundColor = new Color(0, 0, 0);

        setBackground(JFrameBackgroundColor);

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(3, 1));
        labelPanel.setPreferredSize(new Dimension(700, 600));
        labelPanel.setBackground(labelPanelColor); // Установите зеленый фон для панели меток

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setPreferredSize(new Dimension(1000, 600));
        buttonPanel.setBackground(labelPanelColor);


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        centerPanel.setBackground(labelPanelColor);


        resultLabel = new CustomLabel("Result: 0 X 0", Color.BLUE, 40);
        winnerLabel = new CustomLabel("Winner: DRAW", Color.ORANGE, 32);
        lastScorerLabel = new CustomLabel("Last Scorer: N/A", Color.BLUE, 24);


        CustomButton milanButton = new CustomButton("AC Milan", milanButtonBackgroundColor,
                milanButtonForegroundColor, 30);

        CustomButton madridButton = new CustomButton("Real Madrid", madridButtonBackgroundColor,
                madridButtonForegroundColor, 30);

        milanButton.addActionListener(_ -> updateScore("AC Milan"));


        madridButton.addActionListener(_ -> updateScore("Real Madrid"));

        labelPanel.add(resultLabel);
        labelPanel.add(lastScorerLabel);
        labelPanel.add(winnerLabel);

        buttonPanel.add(milanButton);
        buttonPanel.add(madridButton);

        centerPanel.add(buttonPanel);

        add(labelPanel);
        add(centerPanel);

        setVisible(true);

    }


    public void updateScore(String lastScorer) {
        if (lastScorer.equals("AC Milan")) {
            milanScore++;
        } else if (lastScorer.equals("Real Madrid")) {
            madridScore++;
        }
        updateWinner();
        updateResult();
        updateLastScorer(lastScorer);
    }

    public void updateWinner() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public void updateResult() {
        resultLabel.setText("Result " + milanScore + " X " + madridScore);
    }

    public void updateLastScorer(String lastScorer) {
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SoccerSimulation::new);
    }


}