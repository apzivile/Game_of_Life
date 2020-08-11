package life;

import javax.swing.*;

import java.util.jar.JarEntry;

import static life.Main.*;

public class GameOfLife extends JFrame {
    //Main main= new Main();
    public GameOfLife() throws InterruptedException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        setLayout(null);
        setVisible(true);

        JLabel generationLabel = new JLabel();
        generationLabel.setText("Generation " + getGenerations());

        JLabel aliveLabel = new JLabel();
        aliveLabel.setText("Alive" + getAliveNumber());

        JToggleButton playToggleButton = new JToggleButton("PlayToggleButton");
        playToggleButton.setBounds(1, 1, 1, 1);

        JButton resetButton = new JButton("ResetButton");
        resetButton.setBounds(2, 2, 2, 2);

        generationLabel.setName("GenerationLabel");
        aliveLabel.setName("AliveLabel");
        playToggleButton.setName("PlayToggleButton");
        resetButton.setName("ResetButton");
        add(generationLabel);
        add(aliveLabel);
        add(playToggleButton);
        add(resetButton);
        super.update(this.getGraphics());
        setVisible(true);

    }
}
