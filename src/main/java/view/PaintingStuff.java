package view;
import javax.swing.*;
import java.awt.*;

import Model.LevelOne;
import Model.Player;

import Model.Obstacle;
import Utilities.Constants;

public class PaintingStuff extends JComponent {

    DrawPlayer drawPlayer;
    DrawRectView drawrect;
    DrawCircView drawcirc;
    DrawLevel drawLevel;

    public PaintingStuff(Player player, Obstacle obstacle, LevelOne levelOne){
         this.drawLevel = new DrawLevel(levelOne);
         this.drawrect = new DrawRectView(obstacle);
         this.drawPlayer = new DrawPlayer(player);
         this.drawcirc = new DrawCircView(obstacle);

    }
    DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
    //DrawCircView drawcirc = new DrawCircView(Constants.RECT_HEIGHT,Constants.RECT_WIDTH);



    public void paint(Graphics g){


        drawrect.drawRect(g);
        dbg.draw2(g);
        drawcirc.drawCirc(g);
        drawPlayer.drawPlayer(g);


    }
}
