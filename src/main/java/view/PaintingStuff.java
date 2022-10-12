package view;
import javax.swing.*;
import java.awt.*;

import Model.Obstacle;
import Utilities.Constants;

public class PaintingStuff extends JComponent {
    Obstacle obstacle;
    DrawRectView drawrect;
    public PaintingStuff(Obstacle obstacle){
         this.drawrect = new DrawRectView(obstacle);
    }
    DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
    DrawCircView drawcirc = new DrawCircView(Constants.RECT_HEIGHT,Constants.RECT_WIDTH);
    PlayerView playerView = new PlayerView();


    public void paint(Graphics g){

        drawrect.draw(g);
        dbg.draw2(g);
        drawcirc.draw3(g);
        playerView.drawPlayer(g);


    }
}
