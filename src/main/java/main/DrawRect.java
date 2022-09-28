package main;

import javax.swing.*;
import java.awt.*;



public class DrawRect extends JComponent {
    private int cWidth;
    private int cHeight;
    private int cSpeed;
    private int X_POS = Constants.RECT_START_X;         //startposition för kvadraten xled

    int w = 1500;                       //skärmens bredd (osynlig+synlig)

    public DrawRect(int h, int w) {
        cWidth = w;
        cHeight = h;
        cSpeed = -3;

        //int w = Constants.RECT_WIDTH;
        // int objectHeight = Constants.RECT_HEIGHT;
        int objectSpeed = -3;
    }

    public void draw(Graphics g) {

        Graphics2D gg = (Graphics2D) g;
        int x = X_POS + cSpeed;

        if (x > w + cWidth) {
            x = -cWidth;
        }

        gg.setColor(Constants.RECT_COLOR);
        gg.fillRect(x,Constants.Y_POS, cWidth, cHeight);      //här sätts även yposition

        X_POS = x;


    }
}


