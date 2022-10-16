package view;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Model.*;

import Model.Obstacle;
import Utilities.Constants;

public class PaintingStuff extends JComponent {

    Player player;
    DrawPlayer drawPlayer;
    DrawRectView drawrect;
    DrawCircView drawCirc;
    DrawLevel levelOne;
    DrawProjectile drawProjectile;
    //Projectile p = new Projectile(10, 10, 10, 10, 10);
    Projectile projectile;
    ArrayList<Projectile> projectiles = new ArrayList<>();

    public PaintingStuff(Player player, ArrayList<Projectile> projectiles, Obstacle obstacle, LevelOne levelOne, PowerUp powerUp){
        this.player = player;
        this.drawrect = new DrawRectView(obstacle);
        this.drawPlayer = new DrawPlayer(player);
        this.drawCirc = new DrawCircView(obstacle);
        this.levelOne = new DrawLevel(levelOne);
        this.projectiles = projectiles;
        this.drawProjectile = new DrawProjectile(projectile);
    }
    DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);


    public void paintComponent(Graphics g){
        drawrect.drawRect(g);
        dbg.draw2(g);
        drawCirc.drawCirc(g);
        drawPlayer.drawPlayer(g);
        drawProjectile(projectiles, g);
    }

    public void drawProjectile(ArrayList<Projectile> projectiles, Graphics g){
        this.projectiles = projectiles;
        super.paintComponent(g);
        if(projectiles.size() != 0){
            for(Projectile projectile : projectiles){
                g.setColor(new Color(85, 85, 85));
                g.fillRect(projectile.xPosition, projectile.yPosition, 20, 10);
            }
        }
    }
}
