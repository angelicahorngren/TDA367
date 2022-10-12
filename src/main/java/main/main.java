package main;
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
        MenuView menuView = new MenuView(player, obstacle);

        //new LostRoundView();


    }


}