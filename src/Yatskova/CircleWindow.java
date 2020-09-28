package Yatskova;

import java.awt.*;

public class CircleWindow implements Drawable {
    private int x, y;
    private int wight, height;
    private Color color1, color2;

    public CircleWindow(int x, int y, int wight, int height, Color color1, Color color2) {
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
        g.fillOval(215, 170, 70, 70);
        g.setColor(color2);
        g.fillOval(x+5, 175, wight-10, height-10);
        g.setColor(color1);
        g.drawLine(x+5, y+height/2, x+wight-5, y+height/2);
        g.drawLine(x+wight/2, y+5, x+wight/2, y+height-5);
    }
}
