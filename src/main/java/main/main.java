package main;
import Controller.*;
import MenuView.DrawLostRoundItems;
import MenuView.DrawStartPageItems;
import MenuView.LostRoundMenu;
import MenuView.StartPageMenu;
import Model.*;
import Utilities.Constants;
import View.*;

import java.util.ArrayList;


public class main {

    public static void main(String args[]) {


        System.out.println("Hello, do you wanna jump and stuff?");
        Obstacle obstacle = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED,false, Constants.OBSTACLE_START_X, Constants.OBSTACLE_START_Y);
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        LevelOne levelOne = new LevelOne(obstacles);
        levelOne.createLevel(obstacles);
        PowerUp powerUp = new PowerUp(Constants.POWERUP_WIDTH, Constants.POWERUP_HEIGHT, Constants.POWERUP_SPEED, Constants.POWERUP_START_X, Constants.POWERUP_START_Y );
        Player player = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, Constants.PLAYER_START_X, true, powerUp);
        Projectile projectile = new Projectile(20, 10, 10, true, player.getxPosition(), 265);
        CollisionDetector collisionDetector = new CollisionDetector(player, obstacles, powerUp);
        ProgressIndicator progressIndicator = new ProgressIndicator();
        ArrayList<Projectile> projectiles = new ArrayList<>();
        ProgressBar progressBar = new ProgressBar(progressIndicator);
        PlayerMouseController mouseListener = new PlayerMouseController(player);
        PlayerKeyController playerKeyController = new PlayerKeyController(player, projectiles);
        Score score = new Score(0,0);

        GameView gameView = new GameView(player, projectiles, obstacles, progressBar, mouseListener, playerKeyController, powerUp);
        GameLoop gameLoop = new GameLoop(player, projectiles, obstacles, gameView, progressBar, score,  mouseListener, collisionDetector, powerUp);

        StartButtonController startBtnC = new StartButtonController(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT, gameLoop, gameView);

        DrawStartPageItems drawStartPageItems = new DrawStartPageItems(startBtnC, score);

        StartPageMenu startPageMenu = new StartPageMenu(drawStartPageItems);

        MenuButtonController menuBtnC = new MenuButtonController(Constants.MENU_BTN_POSX, Constants.MENU_BTN_POSY, Constants.MENU_BTN_WIDTH, Constants.MENU_BTN_HEIGHT);

        //PlayAgainButtonController playAgainBtnC = new PlayAgainButtonController(Constants.PLAY_AGAIN_BTN_POSX, Constants.PLAY_AGAIN_BTN_POSY, Constants.PLAY_AGAIN_BTN_WIDTH, Constants.PLAY_AGAIN_BTN_HEIGHT, gameLoop);

        DrawLostRoundItems drawLostRoundItems = new DrawLostRoundItems(score);

        LostRoundMenu lostRoundMenu = new LostRoundMenu(drawLostRoundItems);

        WindowLayout windowLayout = new WindowLayout(startPageMenu, lostRoundMenu, gameView, startBtnC);



        /*if (startBtnC.buttonPressed() || playAgainBtnC.buttonPressed()) {
            mainWindow.addGameView(); //toFront
        } else if (menuBtnC.buttonPressed()) {
            mainWindow.addMenuView(); //toFront
        }*/

        //windowLayout.setContentPane(gameView);
        //startBtnC.buttonPressed();

        }

    }
