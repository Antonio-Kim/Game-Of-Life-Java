package application;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel() {
        setBackground(Color.RED);
    }

    // Paint Component allows users to draw
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        g2.setColor(Color.GREEN);
        g2.fillRect(0,0, width, height);
    }
}
