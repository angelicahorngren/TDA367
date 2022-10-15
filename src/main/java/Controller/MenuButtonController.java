package Controller;


import Utilities.Constants;

public class MenuButtonController extends MenuItemsController{

    private int buttonPosX;

    public MenuButtonController(int x, int y, int width, int height){

        super(x, y, width, height);

        this.buttonPosX = x;

    }

    @Override
    public boolean buttonPressed() {
        boolean button = false;


        if (buttonPosX == Constants.MENU_BTN_POSX) {

            System.out.println("menu");

        }
        return button;
    }



}
