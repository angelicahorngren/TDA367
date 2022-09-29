package Controller;;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListener extends MouseAdapter {

    public boolean mousePressed;
    public int mouseButton = -1;


    @Override
    public void mousePressed(MouseEvent mouseEvent){
        this.mousePressed = true;
        this.mouseButton = mouseEvent.getButton();

    }

}
