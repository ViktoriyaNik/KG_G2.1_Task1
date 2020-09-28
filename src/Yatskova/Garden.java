package Yatskova;

import java.awt.*;

public class Garden implements Drawable {
    private int x, y;
    private int wight, height;
    private Color color;

    public Garden(int x, int y, int wight, int height, Color color) {
        this.x = x;
        this.y = y;
        this.wight = wight;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(x, y, wight, height);
        for (int i = y + 50; i < y + height; i += 50) {
            g.setColor(Color.BLACK);
            g.drawLine(x, i, x + wight, i);
            for (int j = x; j < x + wight; j += 50) {
                g.setColor(Color.GREEN);
                g.fillOval(j + 50, i - 20, 10, 20);
            }
        }

    }
}
