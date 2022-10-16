package view;
import Controller.PlayerKeyController;
import Controller.MouseListener;
import Model.LevelOne;
import Model.Obstacle;
import Model.Player;
import Utilities.Constants;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{


    public GameView(Player player, ArrayList<Projectile> projectiles, Obstacle obstacle, ProgressBar progressBar, MouseListener mouseListener, PlayerKeyController playerKeyController, LevelOne levelOne, PowerUp powerUp) {

        this.addMouseListener(mouseListener);

        BorderLayout borderLayout = new BorderLayout();
        this.setLayout( borderLayout );
        this.setBackground(Color.WHITE);
        this.addKeyListener(playerKeyController);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);

        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));

        this.add(progressBar);
        this.add(new PaintingStuff(player, projectiles, obstacle, levelOne, powerUp));

        this.setVisible(true);


    }


}

