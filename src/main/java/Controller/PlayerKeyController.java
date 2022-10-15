package Controller;

import Model.Player;

import java.awt.event.*;

public class PlayerKeyController extends KeyAdapter implements KeyListener {


    private boolean keyPressed; // which keyboard keys currently are being pressed, 128 ascii character set
    Player player;

    public PlayerKeyController(Player player){
        this.player = player;
    }

    @Override
    public void keyPressed (KeyEvent e) {
        if (e.getKeyCode() == 32){
            player.jump();
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
