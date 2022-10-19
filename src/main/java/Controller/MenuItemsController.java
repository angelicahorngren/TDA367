package Controller;

import Utilities.Constants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MenuItemsController extends MouseAdapter {

    private int buttonPosX; //Constants.START_BTN_POSX
    protected int buttonPosY; //Constants.START_BTN_POSY
    protected int buttonWidth; //Constants.START_BTN_WIDTH
    public int buttonHeight; //Constants.START_BTN_HEIGHT

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
        int x = 0;

        if (mousex >= buttonPosX && mousex <= buttonPosX + buttonWidth) {

            if (mousey >= buttonPosY && mousey <= buttonPosY + buttonHeight) {

                x=1;
                buttonPressed();

                System.out.println(x);

            }
        }
    }

    public void buttonPressed(){


        if ( buttonPosX == Constants.START_BTN_POSX || buttonPosX == Constants.PLAY_AGAIN_BTN_POSX){

            System.out.println("yay");

        }

        else if (buttonPosX == Constants.MENU_BTN_POSX){

            System.out.println("hoo");
        }

    }

}
