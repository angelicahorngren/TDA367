package Controller;

import Utilities.Constants;
import main.GameLoop;
import view.GameView;

import java.awt.event.MouseEvent;

public class StartButtonController extends MenuItemsController{

    private int buttonPosX;
    GameLoop gameLoop;
    GameView gameView;

    public StartButtonController(int x, int y, int width, int height, GameLoop gameLoop, GameView gameView){

        super(x, y, width, height);

        this.buttonPosX = x;
        this.gameLoop = gameLoop;
        this.gameView = gameView;

    }


    @Override
    public void buttonPressed(){


        if ( buttonPosX == Constants.START_BTN_POSX || buttonPosX == Constants.PLAY_AGAIN_BTN_POSX){

            //gameLoop.run();
            //gameLoop.startGame();
            System.out.println("start & play again");

        }


    }

}
