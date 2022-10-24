package main;
import Controller.*;
import MenuView.DrawGameOverMenu;
import MenuView.DrawStartMenu;
import MenuView.GameOverMenu;
import MenuView.StartMenu;
import Model.*;
import Utilities.Constants;
import View.*;

import java.util.ArrayList;


public class main {

    public static void main(String args[]) {


        System.out.println("Hello, do you wanna jump and stuff?");
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        LevelCreator levelCreator = new LevelCreator(obstacles);
        levelCreator.createLevel();
        PowerUp powerUp = new PowerUp(Constants.POWERUP_WIDTH, Constants.POWERUP_HEIGHT, Constants.POWERUP_SPEED, Constants.POWERUP_START_X, Constants.POWERUP_START_Y );
        Player player = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, Constants.PLAYER_START_X, true, powerUp);
        ArrayList<Projectile> projectiles = new ArrayList<>();
        ProgressBar progressBar = new ProgressBar(new ProgressIndicator());
        PlayerMouseController mouseListener = new PlayerMouseController(player);
        Score score = new Score(0,0);

        GameView gameView = new GameView(player, projectiles, obstacles, progressBar, mouseListener, new PlayerKeyController(player, projectiles), powerUp);


        GameOverMenu gameOverMenu = new GameOverMenu(new DrawGameOverMenu(score));
        StartMenu startMenu = new StartMenu(new DrawStartMenu(score));

        ViewContainer viewContainer = new ViewContainer(startMenu, gameOverMenu, gameView);
        GameLoop gameLoop = new GameLoop(player, projectiles, obstacles, gameView, progressBar, score, mouseListener, new CollisionDetector(player, obstacles, projectiles, powerUp), powerUp, viewContainer);


        new Window(startMenu, gameOverMenu, gameView, gameLoop, viewContainer);



    }

}