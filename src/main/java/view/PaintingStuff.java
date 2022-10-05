package view;

import Model.DrawRectModel;
import Model.Player;

import javax.swing.*;
import java.awt.*;
import Utilities.Constants;

public class PaintingStuff extends JComponent {
    DrawRectView drawrect = new DrawRectView(Constants.RECT_HEIGHT, Constants.RECT_WIDTH);
    DrawGameBackground dbg = new DrawGameBackground(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
    DrawCircView drawcirc = new DrawCircView(Constants.RECT_HEIGHT,Constants.RECT_WIDTH);
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
