package Controller;

import Utilities.Constants;
import main.GameLoop;

public class PlayAgainButtonController extends MenuItemsController{

    private int buttonPosX;
    GameLoop gameLoop;

    public PlayAgainButtonController(int x, int y, int width, int height){
        super(x, y, width, height);

        this.buttonPosX = x;

    }

    @Override
    public void buttonPressed() {


        if (buttonPosX == Constants.START_BTN_POSX || buttonPosX == Constants.PLAY_AGAIN_BTN_POSX) {

            gameLoop.startGame();
            System.out.println("start & play again");

        }


    }

}
