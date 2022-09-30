package view;

import Model.DrawCirc;
import Model.DrawRect;
import view.DrawGameBackground;

import javax.swing.*;
import java.awt.*;
import Utilities.Constants;

public class PaintingStuff extends JComponent {
    DrawRect drawrect = new DrawRect(Constants.RECT_HEIGHT, Constants.RECT_WIDTH);
    DrawGameBackground dbg = new DrawGameBackground(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
    DrawCirc drawcirc = new DrawCirc(Constants.RECT_HEIGHT,Constants.RECT_WIDTH);

    public void paint(Graphics g){
        //System.out.println("worked");
        //Graphics2D gg = (Graphics2D) g;
        super.paint(g);
        drawrect.draw(g);
        dbg.draw2(g);
        drawcirc.draw3(g);


    }
}
