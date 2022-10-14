package main;
import Controller.MenuButtonController;
import Controller.MouseListener;
import Controller.PlayAgainButtonController;
import Controller.StartButtonController;
import Model.*;
import Utilities.Constants;
import view.*;


public class main {

    public static void main(String args[]){


        System.out.println("Hello, do you wanna jump and stuff?");

        Obstacle obstacle = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X, Constants.OBSTACLE_START_Y);
        Player player = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, -100, true);

        CollisionDetector collisionDetector = new CollisionDetector(player, obstacle);
        DrawPlayer dp = new DrawPlayer(player);
        ProgressIndicator progressIndicator = new ProgressIndicator();
        ProgressBar progressBar = new ProgressBar(progressIndicator);
        MouseListener mouseListener = new MouseListener();


        GameView gameView = new GameView(player, obstacle, progressBar, mouseListener);
        GameLoop gameLoop = new GameLoop(player, obstacle, gameView, progressBar, collisionDetector);

        StartButtonController startBtnC = new StartButtonController(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT, gameLoop);

        MenuItemsView menuItemsView = new MenuItemsView(startBtnC);

        MenuView menuView = new MenuView(menuItemsView);

        MenuButtonController menuBtnC = new MenuButtonController(Constants.MENU_BTN_POSX, Constants.MENU_BTN_POSY, Constants.MENU_BTN_WIDTH, Constants.MENU_BTN_HEIGHT);

        PlayAgainButtonController playAgainBtnC = new PlayAgainButtonController(Constants.PLAY_AGAIN_BTN_POSX, Constants.PLAY_AGAIN_BTN_POSY, Constants.PLAY_AGAIN_BTN_WIDTH, Constants.PLAY_AGAIN_BTN_HEIGHT);


        LostRoundItemsView lostRoundItemsView = new LostRoundItemsView(menuBtnC, playAgainBtnC);

        LostRoundView lostRoundView = new LostRoundView(lostRoundItemsView);

        MainWindow mainWindow = new MainWindow(menuView, gameView, lostRoundView, startBtnC, playAgainBtnC, menuBtnC);

        mainWindow.addMenuView();
        


        //GameLoop gameLoop = new GameLoop(player, gameView, progressBar, collisionDetector);


    }

}