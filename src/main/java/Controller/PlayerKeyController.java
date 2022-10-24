package Controller;

import Model.Player;
import Model.Projectile;
import java.awt.event.*;
import java.util.ArrayList;

public class PlayerKeyController extends KeyAdapter {
    ArrayList<Projectile> projectiles;
    private Player player;

    /**
     * Constructor for PlayerKeyController.
     * @param player is used to be able to fire projectiles from the users x-axis position.
     * @param projectiles is the list of projectiles that is drawn on the gameview.
     */
    public PlayerKeyController(Player player, ArrayList<Projectile> projectiles){
        this.player = player;
        this.projectiles = projectiles;
    }

    /**
     * KeyAdapter that listens for input from the user.
     * @param e Tells if an action has occurred on a component.
     */
    @Override
    public void keyPressed (KeyEvent e) {
        if (e.getKeyCode() == 32) {
            projectiles.add(new Projectile(20, 10, 10, true, player.getxPosition() + player.getPlayerWidth(), player.getyPosition()));
        }
    }


}
