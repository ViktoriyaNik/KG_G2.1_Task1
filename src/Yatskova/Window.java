package Yatskova;

import java.awt.*;

public class Window implements Drawable{
    private int x, y;
    private int wight, height;
    private Color color1, color2;

    public Window(int x, int y, int wight, int height, Color color1, Color color2) {
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
        g.fillRect(x + 10, y + 10, wight - 20, height - 20);
        g.setColor(color1);
        g.drawLine(x + wight / 2, y + 10, x + wight / 2, y + height - 10);
    }
}
