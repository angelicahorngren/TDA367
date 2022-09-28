package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter implements ActionListener {


    private boolean keyPressed [] = new boolean[128]; // which keyboard keys currently are being pressed, 128 ascii character set

    @Override
    public void keyPressed (KeyEvent e) {
        keyPressed [e.getKeyCode()] = true;

    }


    @Override
    public void keyReleased (KeyEvent e) {
        keyPressed[e.getKeyCode()] = false;
    }


    public boolean isKeyPressed (int keyCode) {
        return keyPressed[keyCode];
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
