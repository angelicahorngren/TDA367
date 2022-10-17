package Controller;

import Model.Player;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlayerMouseController extends MouseAdapter {

    private boolean mousePressed;
    private int mouseButton;
    private boolean mouseDragged;
    private Player player;

    public PlayerMouseController(Player player){
        this.player = player;
    }


    @Override
    public void mousePressed(MouseEvent mouseEvent){
        if(mousePressed && player.getyPosition() == 250){
            player.jump(); //switch to controller
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mousePressed = true;
    }

    @Override
    public void mouseReleased(MouseEvent e){
    }

    public boolean getMousePressed(){
        return mousePressed;
    }

    public void setMousePressedfalse(){
        mousePressed = false;
    }
}


