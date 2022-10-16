package view;

import Model.Player;
import Model.Projectile;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class DrawProjectile extends JPanel {


    Projectile projectile;

    public DrawProjectile(Projectile projectile){
        this.projectile = projectile;
    }


    public void drawProjectile(Graphics g, Player player, ArrayList<Projectile> projectiles){
        super.paintComponent(g);
        for(Projectile projectile : projectiles){
            g.setColor(new Color(85, 85, 85));
            g.fillRect(projectile.xPosition, projectile.yPosition + player.playerHeight/2 - projectile.getHeight()/2, 20, 10);
            System.out.println(projectile.getyPosition());
        }
    }



}
