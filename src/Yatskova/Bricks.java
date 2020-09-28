package Yatskova;

import java.awt.*;

public class Bricks implements Drawable {
    private int x;
    private int y;
    private int wight;
    private int height;
    private Color color;

    public Bricks(int x, int y, int wight, int height, Color color) {
        this.x = x;
        this.y = y;
        this.wight = wight;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        int count = 0;
        g.setColor(color);
        int yy = y;
        int xx = x;
        while (yy < y + height) {
            if (count % 2 == 0) {
                xx += 25;
                while (xx < x + wight) {
                    g.drawLine(xx, yy, xx, yy + 25);
                    xx += 50;
                }
                count++;
            } else {
                while (xx < x + wight) {
                    g.drawLine(xx + 50, yy, xx + 50, yy + 25);
                    xx += 50;
                }
                count++;
            }
            xx = x;
            g.drawLine(x, yy + 25, x + wight, yy + 25);
            yy += 25;
        }

    }
}
