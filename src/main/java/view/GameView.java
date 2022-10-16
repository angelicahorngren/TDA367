package view;
import Controller.PlayerKeyController;
import Controller.PlayerMouseController;
import Model.*;
import Utilities.Constants;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{

    public GameView(Player player, ArrayList<Projectile> projectiles, Obstacle obstacle, ProgressBar progressBar, PlayerMouseController mouseListener, PlayerKeyController playerKeyController, LevelOne levelOne, PowerUp powerUp) {
        BorderLayout borderLayout = new BorderLayout();
        this.add(progressBar);
        this.addMouseListener(mouseListener);
        this.addKeyListener(playerKeyController);

        this.setLayout( borderLayout );
        this.setBackground(Color.WHITE);
        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));

        this.add(progressBar);
        this.addMouseListener(mouseListener);

        this.add(new PaintingStuff(player, projectiles, obstacle, levelOne, powerUp));
        this.setVisible(true);

    }


    //put PaintingStuff stuff here


}

