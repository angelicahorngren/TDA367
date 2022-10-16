package view;
import Controller.MouseListener;
import Model.CollisionDetector;
import Model.Player;
import Model.Obstacle;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{


    public GameView(Player player, Obstacle obstacle, ProgressBar progressBar, MouseListener mouseListener, PlayerKeyController playerKeyController, LevelOne levelOne) {

        BorderLayout borderLayout = new BorderLayout();
        this.addKeyListener(playerKeyController);

        this.setLayout( borderLayout );
        this.setBackground(Color.WHITE);
        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));

        this.add(progressBar);
        this.addMouseListener(mouseListener);
        this.add(new PaintingStuff(player, obstacle, levelOne, powerUp));

        this.setVisible(true);


    }


}

