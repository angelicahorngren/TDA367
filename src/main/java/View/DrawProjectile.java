package View;

import Model.Player;
import Model.Projectile;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class DrawProjectile extends JComponent {


    private Projectile projectile;

    /**
     * A constructor for DrawProjectile
     * @param projectile used to get the projectile that needs to be drawn
     */

    public DrawProjectile(Projectile projectile){
        this.projectile = projectile;
    }


    /**
     * Method that draw and color all the projectiles that the player shoots
     * @param g a neccasery parameter used to draw on a Jpanel
     * @param player used to calcualt the projectile width and hight using the dimentions of the player
     * @param projectiles used to get all the projectile in the list that needs to be drawn
     */

    public void drawProjectile(Graphics g, Player player, ArrayList<Projectile> projectiles){
        super.paintComponent(g);
        for(Projectile projectile : projectiles){
            g.setColor(new Color(85, 85, 85));
            g.fillRect(projectile.getxPosition(), projectile.getyPosition() + player.getPlayerHeight()/2 - projectile.getHeight()/2, 20, 10);
            //System.out.println(projectile.getyPosition());
        }
    }



}
