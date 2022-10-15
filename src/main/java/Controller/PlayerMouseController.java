package Controller;

import Model.Player;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PlayerMouseController extends MouseAdapter {

    public boolean mousePressed;
    public int mouseButton;
    public boolean mouseDragged;
    Player player;

    public PlayerMouseController(Player player){
        this.player = player;
    }


    @Override
    public void mousePressed(MouseEvent mouseEvent){
        if(mousePressed && player.yPosition == 250){
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
}


