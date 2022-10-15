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
    DrawCircView drawCirc;
    DrawLevel levelOne;

    public PaintingStuff(Player player, Obstacle obstacle, LevelOne levelOne){
         //this.drawLevel = new DrawLevel(levelOne);
         this.drawrect = new DrawRectView(obstacle);
         this.drawPlayer = new DrawPlayer(player);
         this.drawCirc = new DrawCircView(obstacle);
         this.levelOne = new DrawLevel(levelOne);
    }
    DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);



    public void paint(Graphics g){
        drawrect.drawRect(g);
        dbg.draw2(g);
        drawCirc.drawCirc(g);
        drawPlayer.drawPlayer(g);
        //levelOne.drawLevelOne(g);
    }

    //put this in GameView
}
