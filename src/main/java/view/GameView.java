package view;
import Controller.PlayerKeyController;
import Controller.PlayerMouseController;
import Model.*;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{


    public GameView(Player player, Obstacle obstacle, PowerUp powerUp, ProgressBar progressBar, PlayerMouseController mouseListener, PlayerKeyController playerKeyController, LevelOne levelOne) {

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

