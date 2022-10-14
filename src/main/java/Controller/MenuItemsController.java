package Controller;
import Utilities.Constants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MenuItemsController extends MouseAdapter {

    private int buttonPosX; //Constants.START_BTN_POSX
    private int buttonPosY; //Constants.START_BTN_POSY
    private int buttonWidth; //Constants.START_BTN_WIDTH
    private int buttonHeight; //Constants.START_BTN_HEIGHT

    public MenuItemsController(int buttonPosX, int buttonPosY, int buttonWidth, int buttonHeight) {

        this.buttonPosX = buttonPosX;
        this.buttonPosY = buttonPosY;
        this.buttonWidth = buttonWidth;
        this.buttonHeight = buttonHeight;

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int mousex = e.getX();
        int mousey = e.getY();

        if (mousex >= buttonPosX && mousex <= buttonPosX + buttonWidth) {

            if (mousey >= buttonPosY && mousey <= buttonPosY + buttonHeight) {

                buttonPressed();

            }
        }
    }

    public boolean buttonPressed(){

        boolean button = false;

        if ( buttonPosX == Constants.START_BTN_POSX || buttonPosX == Constants.PLAY_AGAIN_BTN_POSX){

            System.out.println("yay");
            button = true;

        }

        else if (buttonPosX == Constants.MENU_BTN_POSX){

            System.out.println("hoo");
            button = true;

        }
        return button;

    }




}
