package Controller;

import Model.Player;
import Model.Projectile;

import java.awt.event.*;
import java.util.ArrayList;

public class PlayerKeyController extends KeyAdapter {



    private boolean keyPressed; // which keyboard keys currently are being pressed, 128 ascii character set
    ArrayList<Projectile> projectiles;
    private Player player;


    public PlayerKeyController(Player player, ArrayList<Projectile> projectiles){
        this.player = player;
        this.projectiles = projectiles;
    }

    @Override
    public void keyPressed (KeyEvent e) {
        if (e.getKeyCode() == 32 && projectiles.size() <= 10) {
            projectiles.add(new Projectile(20, 10, 10, true, player.getxPosition() + player.getPlayerWidth(), player.getyPosition() + player.getPlayerHeight()/2 - 5));
            System.out.println("ammo");
        }
        else {
            System.out.println("no more ammo!");
        }
    }

    @Override
    public void keyReleased (KeyEvent e) {
        keyPressed = false;
    }


    public boolean isKeyPressed (int keyCode)    {
        return keyPressed;
    }


}
