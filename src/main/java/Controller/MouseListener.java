package Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener extends MouseAdapter {

    public boolean mousePressed;
    public int mouseButton;
    public boolean mouseDragged;


    @Override
    public void mousePressed(MouseEvent mouseEvent){
        //this.mousePressed = true;
        //this.mouseButton = mouseEvent.getButton();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mousePressed = true;

    }

    @Override
    public void mouseReleased(MouseEvent e){
        this.mousePressed = false;
        this.mouseDragged = false;
    }
}


