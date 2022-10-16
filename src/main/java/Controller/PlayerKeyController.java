package Controller;

import Model.Player;
import Model.Projectile;
import view.DrawProjectile;

import java.awt.event.*;
import java.util.ArrayList;

public class PlayerKeyController extends KeyAdapter {



    private boolean keyPressed; // which keyboard keys currently are being pressed, 128 ascii character set
    Player player;
    ArrayList<Projectile> projectiles;


    public PlayerKeyController(Player player, ArrayList<Projectile> projectiles){
        this.player = player;
        this.projectiles = projectiles;
    }

    @Override
    public void keyPressed (KeyEvent e) {
        if (e.getKeyCode() == 32 && projectiles.size() <= 10) {
            projectiles.add(new Projectile(20, 10, 10, true, player.getxPosition() + player.getPlayerWidth(), player.yPosition + player.playerHeight/2 - 5));
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
