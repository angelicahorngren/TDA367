package main;

import javax.swing.*;
import java.awt.*;

public class DrawCirc extends JComponent {
    private int cWidth;
    private int cHeight;
    private int cSpeed;

    private int x_pos_circle = Constants.CIRC_START_X;
    int w = 1500;                       //skärmens bredd (osynlig+synlig)

    public DrawCirc(int h, int w) {
        cWidth = w;
        cHeight = h;
        cSpeed = -3;

        //int w = Constants.RECT_WIDTH;
        // int objectHeight = Constants.RECT_HEIGHT;
        int objectSpeed = -3;
    }

    public void draw3(Graphics g) {

        Graphics2D gg = (Graphics2D) g;

        int u = x_pos_circle + cSpeed;

        if (u > w + cWidth) {
            u = -cWidth;
        }

        gg.setColor(Constants.RECT_COLOR);
        gg.fillOval(u,Constants.Y_POS, cWidth, cHeight);      //här sätts även yposition


        x_pos_circle = u;

    }
}
