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



    public DrawGameView(Player player, ArrayList<Projectile> projectiles, ArrayList<Obstacle> levelOne, PowerUp powerUp){
        this.player = player;
        this.drawPlayer = new DrawPlayer(player);
        this.projectiles = projectiles;
        this.drawProjectile = new DrawProjectile(projectile);
        this.drawPowerUp = new DrawPowerUp(powerUp);
        this.drawLevel = new DrawLevel(levelOne);
    }
    DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);



    public void paintComponent(Graphics g){
        dbg.draw(g);
        drawPlayer.draw(g);
        drawProjectile.drawProjectile(g, player, projectiles);
        drawPowerUp.draw(g);
        drawLevel.draw(g);
    }
}
