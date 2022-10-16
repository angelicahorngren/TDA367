package main;
import Controller.*;
import Model.*;
import Model.Obstacle;
import Utilities.Constants;
import view.*;

import java.util.ArrayList;

public class main {

    public static void main(String args[]) {

        System.out.println("Hello, do you wanna jump and stuff?");
        Obstacle obstacle = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X, Constants.OBSTACLE_START_Y);
        Player player = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, -100, true);
        Projectile projectile = new Projectile(20, 10, 10, true, player.getxPosition(), 265);
        CollisionDetector collisionDetector = new CollisionDetector(player, obstacle, null);
        ProgressIndicator progressIndicator = new ProgressIndicator();
        ArrayList<Projectile> projectiles = new ArrayList<>();

        ProgressBar progressBar = new ProgressBar(progressIndicator);
        PlayerMouseController mouseListener = new PlayerMouseController(player);
        PlayerKeyController playerKeyController = new PlayerKeyController(player, projectiles);
        LevelOne levelOne = new LevelOne(obstacle);

        GameView gameView = new GameView(player, projectiles, obstacle, progressBar, mouseListener, playerKeyController, levelOne);
        GameLoop gameLoop = new GameLoop(player, projectiles ,obstacle, gameView, progressBar, mouseListener, collisionDetector);


        StartButtonController startBtnC = new StartButtonController(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT, gameLoop);

        MenuItemsView menuItemsView = new MenuItemsView(startBtnC);

        MenuView menuView = new MenuView(menuItemsView);

        MenuButtonController menuBtnC = new MenuButtonController(Constants.MENU_BTN_POSX, Constants.MENU_BTN_POSY, Constants.MENU_BTN_WIDTH, Constants.MENU_BTN_HEIGHT);

        PlayAgainButtonController playAgainBtnC = new PlayAgainButtonController(Constants.PLAY_AGAIN_BTN_POSX, Constants.PLAY_AGAIN_BTN_POSY, Constants.PLAY_AGAIN_BTN_WIDTH, Constants.PLAY_AGAIN_BTN_HEIGHT);


        LostRoundItemsView lostRoundItemsView = new LostRoundItemsView(menuBtnC, playAgainBtnC);

        LostRoundView lostRoundView = new LostRoundView(lostRoundItemsView);

        gameLoop.startGame();


    }
}