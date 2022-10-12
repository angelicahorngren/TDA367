package main;
import Controller.MenuItemsController;
import Utilities.Constants;
import Model.Player;
import Utilities.Constants;
import view.DrawPlayer;
import view.GameView;
import view.LostRoundView;
import Model.Obstacle;
import Utilities.Constants;
import view.MenuView;

import java.awt.*;

import javax.swing.*;

public class main {

    public static void main(String args[]){


        System.out.println("Hello, do you wanna jump and stuff?");
        Obstacle obstacle = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X);
        Player player = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, -100, true);
        DrawPlayer dp = new DrawPlayer(player);
        GameView gm = new GameView(player, obstacle);

        MenuItemsController startBtnC = new MenuItemsController(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT, player, obstacle, gm);
        MenuItemsController menuBtnC = new MenuItemsController(Constants.MENU_BTN_POSX, Constants.MENU_BTN_POSY, Constants.MENU_BTN_WIDTH, Constants.MENU_BTN_HEIGHT, player, obstacle, gm);
        MenuItemsController playAgainBtnC = new MenuItemsController(Constants.PLAY_AGAIN_BTN_POSX, Constants.PLAY_AGAIN_BTN_POSY, Constants.PLAY_AGAIN_BTN_WIDTH, Constants.PLAY_AGAIN_BTN_HEIGHT, player, obstacle, gm);

       // MenuView menuView = new MenuView(player, obstacle, startBtnC);


        new MenuView(startBtnC);
        //new LostRoundView(menuBtnC, playAgainBtnC);

    }


}