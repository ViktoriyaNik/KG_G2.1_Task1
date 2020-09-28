package Yatskova;

import java.awt.*;

public class Hay implements Drawable {
    private int x, y;
    private int wight, height;
    private Color color;

    public Hay(int x, int y, int wight, int height, Color color) {
        this.x = x;
        this.y = y;
        this.wight = wight;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x, y, wight, height);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(1));
        g.drawOval(x, y, wight, height);
        g.drawOval(x+5, y+5, wight-10, height-10);
        g.drawOval(x+10, y+10, wight-20, height-20);
        g.drawOval(x+15, y+15, wight-30, height-30);
        g.drawOval(x+20, y+20, wight-40, height-40);
    }
}
