package Yatskova;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private Sun sun = new Sun(80, 80, 30, 70, 44, Color.YELLOW);
    private Cloud[] cloud = new Cloud[3];
    private Home home = new Home(100, 250, 300, 300, Color.MAGENTA);
    private CircleWindow circleWindow = new CircleWindow(215, 170, 70, 70, Color.DARK_GRAY, Color.CYAN);
    private Window[] window = new Window[3];
    private Door door = new Door(280, 400, 110, 150, Color.ORANGE, Color.DARK_GRAY);
    private Plate plate = new Plate(410, 350, 100, 50, "Home", Color.ORANGE);
    private Hay[] hay = new Hay[3];
    private Garden garden = new Garden(550, 350, 300, 300, Color.DARK_GRAY);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        //поле
        gr.setColor(Color.BLUE);
        gr.fillRect(0, 0, 800, 300);
        gr.setColor(Color.GREEN);
        gr.fillRect(0, 300, 800, 600);

        sun.draw(gr);
        cloud[0] = new Cloud(200, 90, 120, 50, Color.WHITE);
        cloud[1] = new Cloud(400, 20, 120, 50, Color.WHITE);
        cloud[2] = new Cloud(600, 130, 120, 50, Color.WHITE);
        for (int i = 0; i < 3; i++) {
            cloud[i].draw(gr);
        }
        gr.setStroke(new BasicStroke(5));

        home.draw(gr);
        circleWindow.draw(gr);
        window[0] = new Window(130, 270, 90, 110, Color.DARK_GRAY, Color.CYAN);
        window[1] = new Window(280, 270, 90, 110, Color.DARK_GRAY, Color.CYAN);
        window[2] = new Window(130, 400, 90, 110, Color.DARK_GRAY, Color.CYAN);

        for (int i = 0; i < 3; i++) {
            window[i].draw(gr);
        }
        door.draw(gr);
        plate.draw(gr);

        hay[0] = new Hay(520, 290, 50, 50, Color.ORANGE);
        hay[1] = new Hay(570, 290, 50, 50, Color.ORANGE);
        hay[2] = new Hay(545, 247, 50, 50, Color.ORANGE);
        for (int i = 0; i < 3; i++) {
            hay[i].draw(gr);
        }
        garden.draw(gr);
    }

}
