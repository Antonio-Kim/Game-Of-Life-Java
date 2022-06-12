package application;

import javax.swing.JPanel;
import java.awt.*;

public class GamePanel extends JPanel {
    private final static int CELLSIZE = 50;
    private final static Color backgroundColor = Color.BLACK;
    private final static Color foregroundColor = Color.GREEN;
    private final static Color gridColor = Color.GRAY;

    private int topBottomMargin;
    private int leftRightMargin;

    public GamePanel() {
        setBackground(Color.RED);
    }

    // Paint Component allows users to draw
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        leftRightMargin = ((width % CELLSIZE) + 50) / 2;
        topBottomMargin = ((height % CELLSIZE) + 50) / 2;

        g2.setColor(backgroundColor);
        g2.fillRect(0, 0, width, height);

        drawGrid(g2, width, height);
    }

    private void filLCell(Graphics2D g2, int row, int col, boolean status) {
        Color color = status ? foregroundColor : backgroundColor;
        g2.setColor(color);

        int x = leftRightMargin + col * CELLSIZE;
        int y = topBottomMargin + row * CELLSIZE;

        g2.fillRect(x + 1, y + 1, CELLSIZE -2, CELLSIZE -2);
    }

    private void drawGrid(Graphics2D g2, int width, int height) {
        g2.setColor(gridColor);

        for (int i = leftRightMargin; i <= width - leftRightMargin; i += CELLSIZE) {
            g2.drawLine(i, topBottomMargin, i, height - topBottomMargin);
        }

        for (int j = topBottomMargin; j <= height - topBottomMargin; j += CELLSIZE) {
            g2.drawLine(leftRightMargin, j, width-leftRightMargin, j);
        }

    }
}
