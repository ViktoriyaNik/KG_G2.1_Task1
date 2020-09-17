package Yatskova;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        //поле
        gr.setColor(Color.BLUE);
        gr.fillRect(0, 0, 800, 300);
        gr.setColor(Color.GREEN);
        gr.fillRect(0, 300, 800, 600);

        drawSun(gr, 80, 80, 30, 70, 44, Color.YELLOW);
        drawCloud(gr, 200, 90, 120, 50, Color.WHITE);
        drawCloud(gr, 400, 20, 120, 50, Color.WHITE);
        drawCloud(gr, 600, 130, 120, 50, Color.WHITE);

        gr.setStroke(new BasicStroke(5));

        //дом
        //gr.setColor(Color.getHSBColor(154, 188, 222));
        gr.setColor(Color.MAGENTA);
        gr.fillRect(100, 250, 300, 300);
        drawBricks(gr, 100, 250, 300, 300, Color.pink);
        gr.setColor(Color.BLACK);
        gr.drawRect(100, 250, 300, 300);

        //крыша
        gr.setColor(Color.MAGENTA);
        int[] x = {250, 450, 50};
        int[] y = {150, 250, 250};
        gr.fillPolygon(x, y, 3);
        gr.setColor(Color.YELLOW);
        gr.setStroke(new BasicStroke(1));
        while (y[0] < y[1]) {
            y[0] += 5;
            x[1] -= 10;
            x[2] += 10;
            gr.drawPolygon(x, y, 3);
        }
        gr.setStroke(new BasicStroke(5));
        x = new int[]{250, 450, 50};
        y = new int[]{150, 250, 250};
        gr.setColor(Color.BLACK);
        gr.drawPolygon(x, y, 3);

        //круглое окно
        gr.setColor(Color.DARK_GRAY);
        gr.fillOval(215, 170, 70, 70);
        gr.setColor(Color.CYAN);
        gr.fillOval(220, 175, 60, 60);
        gr.setColor(Color.DARK_GRAY);
        gr.drawLine(222, 205, 280, 205);
        gr.drawLine(250, 177, 250, 235);

        //окно
        /*gr.fillRect(120, 270, 90, 110);
        gr.setColor(Color.CYAN);
        gr.fillRect(130, 280, 70, 90);
        gr.setColor(Color.DARK_GRAY);
        gr.drawLine(165, 275, 165, 370);*/
        drawWindow(gr, 130, 270, 90, 110);
        drawWindow(gr, 280, 270, 90, 110);
        drawWindow(gr, 130, 400, 90, 110);

        //дверь
        gr.setColor(Color.ORANGE);
        gr.fillRect(280, 400, 110, 150);
        gr.setColor(Color.DARK_GRAY);
        gr.drawRect(280, 400, 110, 150);
        gr.drawLine(308, 401, 308, 549);
        gr.drawLine(335, 401, 335, 549);
        gr.drawLine(362, 401, 362, 549);
        gr.drawOval(284, 470, 10, 20);
        gr.drawLine(280, 435, 390, 435);
        gr.drawLine(280, 515, 390, 515);

        //звездочка
        //gr.setColor(Color.WHITE);
        //gr.drawPolygon(new int[] {450, 470, 400, 500, 430}, new int[] {350, 400, 370, 370, 400}, 5);
    }

    public static void drawSun(Graphics2D g, int x, int y, int r, int R, int n, Color color) {
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

    public static void drawCloud(Graphics2D g, int x, int y, int wight, int height, Color color) {
        g.setColor(color);
        g.fillOval(x, y + (height / 3), 3 * wight / 9, 2 * height / 3);
        g.fillOval(x + wight * 2 / 9, y, wight / 9 * 7, height);
        g.fillOval(x + 8 * wight / 9, y + height / 3, 3 * wight / 9, 2 * height / 3);
    }

    public static void drawWindow(Graphics2D g, int x, int y, int wight, int height) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x, y, wight, height);
        g.setColor(Color.CYAN);
        g.fillRect(x + 10, y + 10, wight - 20, height - 20);
        g.setColor(Color.DARK_GRAY);
        g.drawLine(x + wight / 2, y + 10, x + wight / 2, y + height - 10);
    }

    public static void drawBricks(Graphics2D g, int x, int y, int wight, int height, Color color) {
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
