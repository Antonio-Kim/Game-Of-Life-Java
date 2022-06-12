package gui;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainFrame extends JFrame {
    private GamePanel gamePanel = new GamePanel();
    public MainFrame() {
        super("Game of Life");

        setLayout(new BorderLayout());
        add(gamePanel, BorderLayout.CENTER);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int code = e.getKeyCode();

                switch (code) {
                    case 32:
                        gamePanel.next();
                        break;
                    case 8:
                        gamePanel.clear();
                        break;
                    case 10:
                        gamePanel.randomize();
                        break;
                }
            }
        });

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
