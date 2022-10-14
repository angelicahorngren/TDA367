package main;
import Controller.*;
import Model.*;
import Model.Object;
import Utilities.Constants;
import view.*;

public class main {

    public static void main(String args[]){


        System.out.println("Hello, do you wanna jump and stuff?");
        Object object = new Object(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X, Constants.OBSTACLE_START_Y);
        Player player = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, -100, true);
        CollisionDetector collisionDetector = new CollisionDetector(player, object);
        ProgressIndicator progressIndicator = new ProgressIndicator();
        ProgressBar progressBar = new ProgressBar(progressIndicator);
        PlayerController mouseListener = new PlayerController();
        LevelOne levelOne = new LevelOne(object);

        GameView gameView = new GameView(player, object, progressBar, mouseListener, levelOne);
        GameLoop gameLoop = new GameLoop(player, object, gameView, progressBar, mouseListener, collisionDetector);



        StartButtonController startBtnC = new StartButtonController(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT, gameLoop, gameView);
        MenuButtonController menuBtnC = new MenuButtonController(Constants.MENU_BTN_POSX, Constants.MENU_BTN_POSY, Constants.MENU_BTN_WIDTH, Constants.MENU_BTN_HEIGHT);
        PlayAgainButtonController playAgainBtnC = new PlayAgainButtonController(Constants.PLAY_AGAIN_BTN_POSX, Constants.PLAY_AGAIN_BTN_POSY, Constants.PLAY_AGAIN_BTN_WIDTH, Constants.PLAY_AGAIN_BTN_HEIGHT);

        LostRoundItemsView lostRoundItemsView = new LostRoundItemsView(menuBtnC, playAgainBtnC);
        LostRoundView lostRoundView = new LostRoundView(lostRoundItemsView);

        gameLoop.startGame();





        //new MenuView(startBtnC);
        //new LostRoundView(menuBtnC, playAgainBtnC);


    }


}