package Controller;

import Model.Player;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class PlayerMouseController extends MouseAdapter {

    private boolean mousePressed;
    private boolean mouseDragged;
    private Player player;

    /**
     * Constructor for PlayerMouseController that is empty.
     */
    public PlayerMouseController(){

    }

    /**
     * MouseAdapter that listens for input from the user.
     * @param e Tells if an action has occurred on a component.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        mousePressed = true;
    }

    /**
     * Gets the mousePressed status.
     * @return mousepressed status (true/false).
     */
    public boolean getMousePressed(){
        return mousePressed;
    }

    /**
     * Sets the mousePressed status to false. Makes sure the player can't spam jump.
     */
    public void setMousePressedfalse(){
        mousePressed = false;
    }
}


