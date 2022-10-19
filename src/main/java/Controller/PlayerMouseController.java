package Controller;

import Model.Player;
import Model.Projectile;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PlayerMouseController extends MouseAdapter {

    private boolean mousePressed;
    private int mouseButton;
    private boolean mouseDragged;
    private Player player;
    private ArrayList<Projectile> projectile;

    public PlayerMouseController(Player player, ArrayList<Projectile> projectiles){
        this.player = player;
        this.projectile = projectiles;
    }


    @Override
    public void mousePressed(MouseEvent mouseEvent){
        mousePressed = true;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mousePressed = true;
    }

    @Override
    public void mouseReleased(MouseEvent e){
        mouseDragged = true;
        projectile.add(new Projectile(20, 10, 10, true, player.getxPosition() + player.getPlayerWidth(), player.getyPosition() + player.getPlayerHeight()/2 - 5));

    }

    public boolean getMousePressed(){
        return mousePressed;
    }

    public boolean getMouseReleased(){ return mouseDragged; }



    public void setMousePressedfalse(){
        mousePressed = false;
    }
}


