package View;
import Controller.PlayerKeyController;
import Controller.PlayerMouseController;
import Model.*;
import Utilities.Constants;
import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{


    /**
     * A constructor for GameView
     * @param player used to get the player object that needs to be drawn in the game view panel
     * @param projectiles used to get the projectile objects that needs to be drawn in the game view panel
     * @param levelOne used to get the ostacle object that needs to be drawn in the game view panel
     * @param progressBar used to add the progressbar to the game view panel
     * @param mouseListener used to add a mouse listener to the game view that is neccesary for the player movment
     * @param playerKeyController used to add a key listener to the game view that is neccesary for the shooting of projectiles
     * @param powerUp used to get the powerup object that needs to be drawn in the game view panel
     */
    public GameView(Player player, ArrayList<Projectile> projectiles, ArrayList<Obstacle> levelOne, ProgressBar progressBar, PlayerMouseController mouseListener, PlayerKeyController playerKeyController, PowerUp powerUp) {

        this.addMouseListener(mouseListener);
        this.setFocusable(true);


        BorderLayout borderLayout = new BorderLayout();

        this.setLayout(borderLayout);
        this.setBackground(Color.WHITE);
        super.addKeyListener(playerKeyController);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));
        this.add(progressBar);
        this.add(new DrawGameView(player, projectiles, levelOne, powerUp));

        this.setVisible(true);


    }


}

