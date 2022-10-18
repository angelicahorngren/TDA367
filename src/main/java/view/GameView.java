package view;
import Controller.MouseListener;
import Model.Player;
import Model.Obstacle;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{

    DrawPlayer drawPlayer;
    DrawRectView drawrect;
    DrawCircView drawcirc;


    public GameView(Player player, Obstacle obstacle, ProgressBar progressBar, MouseListener mouseListener) {

        BorderLayout borderLayout = new BorderLayout();
        /*this.drawrect = new DrawRectView(obstacle);
        this.drawPlayer = new DrawPlayer(player);
        this.drawcirc = new DrawCircView(obstacle);*/

        this.setLayout( borderLayout );
        this.setBackground(Color.WHITE);
        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));

        this.add(progressBar);
        this.addMouseListener(mouseListener);

        this.add(new PaintingStuff(player, obstacle));

        this.setVisible(true);


    }

    //DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);


    /*public void paintComponent(Graphics g){


        drawrect.drawRect(g);
        dbg.draw2(g);
        drawcirc.drawCirc(g);
        drawPlayer.drawPlayer(g);


    }*/

}




