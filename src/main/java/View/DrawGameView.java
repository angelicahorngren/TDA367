package View;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Model.*;

import Model.Obstacle;
import Utilities.Constants;

public class DrawGameView extends JComponent {

    private DrawPlayer drawPlayer;
    private DrawRectView drawrect;
    private DrawCircView drawCirc;
    private DrawLevel levelOne;
    private DrawProjectile drawProjectile;
    private Projectile projectile;
    private ArrayList<Projectile> projectiles;
    private DrawPowerUp drawPowerUp;
    private ArrayList<Obstacle> obstacles = new ArrayList<>();
    private ArrayList<DrawRectView> drawRectViews = new ArrayList<>();
    private DrawLevel drawLevel;



    public DrawGameView(Player player, ArrayList<Projectile> projectiles, ArrayList<Obstacle> levelOne, PowerUp powerUp){
        /*this.drawrect = new DrawRectView(obstacle);*/
        this.drawPlayer = new DrawPlayer(player);
        /*this.drawCirc = new DrawCircView(obstacle);
        this.levelOne = new DrawLevel(levelOne);*/
        this.projectiles = projectiles;
        this.drawProjectile = new DrawProjectile(projectile);
        this.drawPowerUp = new DrawPowerUp(powerUp);
        this.drawLevel = new DrawLevel(levelOne);
    }
    DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);



    public void drawProjectile(ArrayList<Projectile> projectiles, Graphics g){
        super.paintComponent(g);
        if(projectiles.size() != 0){
            for(Projectile projectile : projectiles){
                g.setColor(new Color(85, 85, 85));
                g.fillRect(projectile.getxPosition(), projectile.getyPosition(), 20, 10);
            }
        }
    }



    public void paintComponent(Graphics g){
        //drawrect.drawRect(g);
        dbg.draw2(g);
        //drawCirc.drawCirc(g);
        drawPlayer.drawPlayer(g);
        drawProjectile(projectiles, g);
        drawPowerUp.drawPowerup(g);

        drawLevel.drawLevel(g);
    }
}
