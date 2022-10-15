package Controller;

import Model.Player;
import Model.Projectile;

import java.awt.event.*;

public class PlayerKeyController extends KeyAdapter {


    private boolean keyPressed; // which keyboard keys currently are being pressed, 128 ascii character set
    Player player;


    public PlayerKeyController(Player player){
        this.player = player;
    }

    @Override
    public void keyPressed (KeyEvent e) {
        if (e.getKeyCode() == 32){
            Projectile p = new Projectile(1, 1, 3, player.getxPosition(), player.yPosition);
        }
    }

    @Override
    public void keyReleased (KeyEvent e) {
        keyPressed= false;
    }


    public boolean isKeyPressed (int keyCode)    {
        return keyPressed;
    }


}
