package View;
import Controller.PlayerKeyController;
import Controller.PlayerMouseController;
import Model.*;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameView extends JPanel{


    public GameView(Player player, ArrayList<Projectile> projectiles, Obstacle obstacle, ProgressBar progressBar, PlayerMouseController mouseListener, PlayerKeyController playerKeyController, LevelOne levelOne, PowerUp powerUp) {

        this.addMouseListener(mouseListener);

        BorderLayout borderLayout = new BorderLayout();

        this.setLayout( borderLayout );
        this.setBackground(Color.WHITE);
        this.addKeyListener(playerKeyController);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);

        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));

        this.add(progressBar);
        this.add(new PaintingStuff(player, projectiles, obstacle, levelOne, powerUp));
        this.setFocusable(true);

        this.setVisible(true);


    }


}

