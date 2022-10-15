package Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlayerController extends MouseAdapter {

    public boolean mousePressed;
    public int mouseButton;
    public boolean mouseDragged;


    @Override
    public void mousePressed(MouseEvent mouseEvent){
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mousePressed = true;
    }

    @Override
    public void mouseReleased(MouseEvent e){
    }
}


