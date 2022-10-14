package Controller;

import Model.CollisionDetector;
import Model.Player;
import Utilities.Constants;
import main.GameLoop;
import view.GameView;
import view.ProgressBar;

import java.awt.event.MouseEvent;

public class StartButtonController extends MenuItemsController{

    private int buttonPosX;
    /*Player player;
    GameView gameView;
    ProgressBar progressBar;
    CollisionDetector collisionDetector;*/
    GameLoop gameLoop;

    public StartButtonController(int x, int y, int width, int height, GameLoop gameLoop /* Player player, GameView gameView, ProgressBar progressBar, CollisionDetector collisionDetector*/){

        super(x, y, width, height);

        this.buttonPosX = x;
        this.gameLoop = gameLoop;
        /*this.player = player;
        this.gameView = gameView;
        this.progressBar = progressBar;
        this.collisionDetector = collisionDetector;*/


    }


    @Override
    public boolean buttonPressed(){
        boolean button = false;

        if ( buttonPosX == Constants.START_BTN_POSX || buttonPosX == Constants.PLAY_AGAIN_BTN_POSX){
            //GameLoop gameLoop = new GameLoop(player, gameView, progressBar, collisionDetector);
            //gameLoop.run();
            //gameLoop.startGame();
            System.out.println("start & play again");
            button = true;

        }


    }

}
