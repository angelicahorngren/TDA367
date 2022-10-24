package View;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Model.*;

import Model.Obstacle;
import Utilities.Constants;

public class DrawGameView extends JComponent {

    private Player player;
    private DrawPlayer drawPlayer;
    private DrawProjectile drawProjectile;
    private Projectile projectile;
    private ArrayList<Projectile> projectiles;
    private DrawPowerUp drawPowerUp;
    private DrawLevel drawLevel;


    /**
     * The constructor for DrawGameView
     * @param player used to draw the player object on the Jpanel
     * @param projectiles used to draw the projectiles on the Jpanel
     * @param levelOne used to draw the obsticals in level one
     * @param powerUp used to draw the power up object on the Jpanel
     */

    public DrawGameView(Player player, ArrayList<Projectile> projectiles, ArrayList<Obstacle> levelOne, PowerUp powerUp){
        this.player = player;
        this.drawPlayer = new DrawPlayer(player);
        this.projectiles = projectiles;
        this.drawProjectile = new DrawProjectile(projectile);
        this.drawPowerUp = new DrawPowerUp(powerUp);
        this.drawLevel = new DrawLevel(levelOne);
    }
    DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);


    /**
     * method that add all the drawn object to the jpanel
     * @param g  a neccasery parameter used to draw on a Jpanel
     */

    public void paintComponent(Graphics g){
        dbg.draw(g);
        drawPlayer.draw(g);
        drawProjectile.drawProjectile(g, player, projectiles);
        drawPowerUp.draw(g);
        drawLevel.draw(g);
    }
}
