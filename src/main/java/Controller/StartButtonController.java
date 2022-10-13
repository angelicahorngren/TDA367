package Controller;

import Utilities.Constants;

import java.awt.event.MouseEvent;

public class StartButtonController extends MenuItemsController{

    private int buttonPosX;

    public StartButtonController(int x, int y, int width, int height){

        super(x, y, width, height);

        this.buttonPosX = x;

    }


    @Override
    public void buttonPressed(){


        if ( buttonPosX == Constants.START_BTN_POSX || buttonPosX == Constants.PLAY_AGAIN_BTN_POSX){

            System.out.println("start & play again");

        }


    }

}
