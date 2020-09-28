package Yatskova;

import java.awt.*;

public class Plate implements Drawable {
    private int x, y;
    private int wight, height;
    private Color color;
    private String str;

    public Plate(int x, int y, int wight, int height, String str, Color color) {
        this.x = x;
        this.y = y;
        this.wight = wight;
        this.height = height;
        this.color = color;
        this.str = str;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect(x, y, wight, height);
        g.setStroke(new BasicStroke(1));
        g.setColor(Color.BLACK);
        g.drawRect(x, y, wight, height);
        g.setColor(color);
        g.fillRect(x + wight / 2 - 5, y + height, 10, height);
        g.setColor(Color.BLACK);
        g.drawRect(x + wight / 2 - 5, y + height, 10, height);
        g.setStroke(new BasicStroke(3));
        g.setFont(new Font(str, Font.ITALIC, 35));
        g.drawString(str, x + 2, y + 3 * height / 4);
        /*x = x + 5;
        g.drawLine(x + 5, y + 5, x + 5, y + height - 5);
        g.drawLine(x + 20, y + 5, x + 20, y + height - 5);
        g.drawLine(x + 5, y + height / 2, x + 20, y + height / 2);
        g.drawRect(x + 25, y + 5, 15, height - 10);
        g.drawLine(x + 45, y + 5, x + 45, y + height - 5);
        g.drawLine(x + 45, y + 5, x + 55, y + height / 2);
        g.drawLine(x + 55, y + height / 2, x + 65, y + 5);
        g.drawLine(x + 65, y + 5, x + 65, y + height - 5);
        g.drawLine(x + 70, y + 5, x + 70, y + height - 5);
        g.drawLine(x + 70, y + 5, x + 80, y + 5);
        g.drawLine(x + 70, y + height / 2, x + 80, y + height / 2);
        g.drawLine(x + 70, y + height - 5, x + 80, y + height - 5);

         */
    }
}
