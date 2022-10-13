package view;
import javax.swing.*;
import java.awt.*;

import Model.Player;

import Model.Obstacle;
import Utilities.Constants;

public class PaintingStuff extends JComponent {
    Player player;
    DrawPlayer drawPlayer;
    Obstacle obstacle;
    DrawRectView drawrect;

    public PaintingStuff(Player player, Obstacle obstacle){
         this.drawrect = new DrawRectView(obstacle);
         this.drawPlayer = new DrawPlayer(player);
    }
    DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
    DrawCircView drawcirc = new DrawCircView(Constants.RECT_HEIGHT,Constants.RECT_WIDTH);



    public void paint(Graphics g){

        drawrect.draw(g);
        dbg.draw2(g);
        drawcirc.draw3(g);
        drawPlayer.drawPlayer(g);


    }
}
