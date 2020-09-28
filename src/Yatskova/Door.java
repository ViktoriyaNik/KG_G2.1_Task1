package Yatskova;

import java.awt.*;

public class Door implements Drawable {
    private int x, y;
    private int wight, height;
    private Color color1, color2;

    public Door(int x, int y, int wight, int height, Color color1, Color color2) {
        this.x = x;
        this.y = y;
        this.wight = wight;
        this.height = height;
        this.color1 = color1;
        this.color2 = color2;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color1);
        g.fillRect(x, y, wight, height);
        g.setColor(color2);
        g.drawRect(x, y, wight, height);
        g.drawLine(x + 28, y, x + 28, y + height);
        g.drawLine(x + 28 + 27, y, x + 28 + 27, y + height);
        g.drawLine(x + 28 + 27 + 27, y, x + 28 + 27 + 27, y + height);
        g.drawOval(x + 5, y + 70, 10, 20);
        g.drawLine(x, y + 35, x + wight, y + 35);
        g.drawLine(x, y + height - 35, x + wight, y + height - 35);
    }
}
