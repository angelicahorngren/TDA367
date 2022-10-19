package Controller;

import Utilities.Constants;
import java.awt.event.MouseEvent;

public class MenuButtonController extends MenuItemsController{

    private int buttonPosX;
    private int x;

    public MenuButtonController(int x, int y, int width, int height){

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

                this.x=4;
                buttonPressed();

                System.out.println(this.x);

            }
        }
    }


    @Override
    public void buttonPressed() {

        if (buttonPosX == Constants.MENU_BTN_POSX) {

            System.out.println("back to menu");
        }
    }

 public int getXvalueMenuBtn(){
        return this.x;
 }
}
