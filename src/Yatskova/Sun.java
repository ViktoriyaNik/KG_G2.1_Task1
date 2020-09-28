package Yatskova;

import java.awt.*;

public class Sun implements Drawable {
    private int x;
    private int y;
    private int r;
    private int R;
    private int n;
    private Color color;

    Sun(int x, int y, int r, int R, int n, Color color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.R = R;
        this.n = n;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da + i);
            double dy1 = r * Math.sin(da + i);
            double dx2 = R * Math.cos(da + i);
            double dy2 = R * Math.sin(da + i);
            g.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);
        }
    }
}
