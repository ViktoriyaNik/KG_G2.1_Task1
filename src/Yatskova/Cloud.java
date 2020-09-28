package Yatskova;

import java.awt.*;

public class Cloud implements Drawable {
    private int x;
    private int y;
    private int wight;
    private int height;
    private Color color;

    Cloud(int x, int y, int wight, int height, Color color) {
        this.x = x;
        this.y = y;
        this.wight = wight;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x, y + (height / 3), 3 * wight / 9, 2 * height / 3);
        g.fillOval(x + wight * 2 / 9, y, wight / 9 * 7, height);
        g.fillOval(x + 8 * wight / 9, y + height / 3, 3 * wight / 9, 2 * height / 3);
    }
}
