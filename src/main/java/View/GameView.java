package View;
import Controller.PlayerKeyController;
import Controller.PlayerMouseController;
import Model.*;
import Utilities.Constants;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{


    public GameView(Player player, ArrayList<Projectile> projectiles, ArrayList<Obstacle> levelOne, ProgressBar progressBar, PlayerMouseController mouseListener, PlayerKeyController playerKeyController, PowerUp powerUp) {

        this.addMouseListener(mouseListener);
        this.setFocusable(true);


        BorderLayout borderLayout = new BorderLayout();

        this.setLayout(borderLayout);
        this.setBackground(Color.WHITE);
        this.addKeyListener(playerKeyController);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));
        this.add(progressBar);
        this.add(new PaintingStuff(player, projectiles, levelOne, powerUp));
        this.setVisible(true);


    }


}

