package Yatskova;

import java.awt.*;

public class Home implements Drawable {
    private int x;
    private int y;
    private int wight;
    private int height;
    private Color color;
    private Bricks bricks;

    Home(int x, int y, int wight, int height, Color color) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.wight = wight;
        this.color = color;
        bricks = new Bricks(x, y, wight, height, Color.pink);

    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(x, y, wight, height);
        bricks.draw(g);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, wight, height);
        g.setColor(Color.MAGENTA);
        int[] x = {this.x + (wight / 2), this.x + wight + 50, this.x - 50};
        int[] y = {this.y - 100, this.y, this.y};
        g.fillPolygon(x, y, 3);
        g.setColor(Color.YELLOW);
        g.setStroke(new BasicStroke(1));
        while (y[0] < y[1]) {
            y[0] += 5;
            x[1] -= 10;
            x[2] += 10;
            g.drawPolygon(x, y, 3);
        }
        g.setStroke(new BasicStroke(5));
        x = new int[]{this.x + (wight / 2), this.x + wight + 50, this.x - 50};
        y = new int[]{this.y - 100, this.y, this.y};
        g.setColor(Color.BLACK);
        g.drawPolygon(x, y, 3);
    }
}
