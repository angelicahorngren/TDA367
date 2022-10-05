package view;

import Model.DrawCirc;
import Model.DrawRect;
import Model.Player;

import javax.swing.*;
import java.awt.*;
import Utilities.Constants;

public class PaintingStuff extends JComponent {
    DrawRect drawrect = new DrawRect(Constants.RECT_HEIGHT, Constants.RECT_WIDTH);
    DrawGameBackground dbg = new DrawGameBackground(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
    DrawCirc drawcirc = new DrawCirc(Constants.RECT_HEIGHT,Constants.RECT_WIDTH);
    Player player = new Player();

    public void paint(Graphics g){
        //Graphics2D gg = (Graphics2D) g;
        //super.paint(g);
        drawrect.draw(g);
        dbg.draw2(g);
        drawcirc.draw3(g);
        player.drawPlayer(g);

    }
}
