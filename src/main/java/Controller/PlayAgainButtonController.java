package Controller;

import Utilities.Constants;
import main.GameLoop;
import java.awt.event.MouseEvent;

public class PlayAgainButtonController extends MenuItemsController{

    public int buttonPosX;
    int x;

    public PlayAgainButtonController(int x, int y, int width, int height){
        super(x, y, width, height);

        this.buttonPosX = x;

    }
    @Override
    public void mouseClicked(MouseEvent e) {

        int mousex = e.getX();
        int mousey = e.getY();
        this.x = 0;

        if (mousex >= buttonPosX && mousex <= buttonPosX + buttonWidth) {

            if (mousey >= buttonPosY && mousey <= buttonPosY + buttonHeight) {

                this.x=3;
                buttonPressed();

                System.out.println(this.x);

            }
        }
    }


    @Override
    public void buttonPressed() {

        if (buttonPosX == Constants.START_BTN_POSX || buttonPosX == Constants.PLAY_AGAIN_BTN_POSX) {

            System.out.println("play again");

        }
    }

    public int getXvaluePlayBtn(){
        return this.x;
    }
}
