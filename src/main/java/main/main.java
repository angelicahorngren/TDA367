package main;
import Controller.MenuButtonController;
import Controller.PlayAgainButtonController;
import Controller.StartButtonController;
import Model.Collision;
import Utilities.Constants;
import Model.Player;
import view.*;
import Model.Obstacle;


public class main {

    public static void main(String args[]){


        System.out.println("Hello, do you wanna jump and stuff?");

        Obstacle obstacle = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X);
        Player player = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, -100, true);

        Collision collisionDetector = new Collision(player, obstacle);
        DrawPlayer dp = new DrawPlayer(player);

        ProgressBar progressBar = new ProgressBar();
        PaintingStuff paintingStuff = new PaintingStuff(player, obstacle);


        GameView gameView = new GameView(player, obstacle, collisionDetector);
        GameLoop gameLoop = new GameLoop(player, gameView, progressBar);


        StartButtonController startBtnC = new StartButtonController(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT, gameLoop, gameView);
        MenuButtonController menuBtnC = new MenuButtonController(Constants.MENU_BTN_POSX, Constants.MENU_BTN_POSY, Constants.MENU_BTN_WIDTH, Constants.MENU_BTN_HEIGHT);
        PlayAgainButtonController playAgainBtnC = new PlayAgainButtonController(Constants.PLAY_AGAIN_BTN_POSX, Constants.PLAY_AGAIN_BTN_POSY, Constants.PLAY_AGAIN_BTN_WIDTH, Constants.PLAY_AGAIN_BTN_HEIGHT);



        new MenuView(startBtnC);
        //new LostRoundView(menuBtnC, playAgainBtnC);


    }


}