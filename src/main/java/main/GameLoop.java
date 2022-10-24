package main;

import Controller.PlayerMouseController;
import Model.*;
import View.GameView;
import View.ProgressBar;
import Utilities.Constants;
import View.ViewContainer;

import java.util.ArrayList;

public class GameLoop implements Runnable {       //Have to extend JFrame for add()-functions to work, still working on this

    Player player;
    GameView gameView;
    ProgressBar progressBar;
    Score score;
    PlayerMouseController mouseListener;
    CollisionDetector collisionDetector;
    ArrayList<Projectile> projectiles;
    PowerUp powerUp;
    ArrayList<Obstacle> levelOne;
    ViewContainer viewContainer;

    public GameLoop(Player player, ArrayList<Projectile> projectiles, ArrayList<Obstacle> levelOne, GameView gameView, ProgressBar progressBar, Score score, PlayerMouseController mouseListener, CollisionDetector collisionDetector, PowerUp powerUp, ViewContainer viewContainer){
        this.player = player;
        this.levelOne = levelOne;
        this.progressBar = progressBar;
        this.score = score;
        this.mouseListener = mouseListener;
        this.collisionDetector = collisionDetector;
        this.gameView = gameView;
        this.projectiles = projectiles;
        this.powerUp = powerUp;
        this.viewContainer = viewContainer;
    }

    public void StopGame(){
        if (!player.getaliveStatus() || progressBar.progressIndicator.getCurrentProcentage() == 100) {
            score.updateScore(progressBar.progressIndicator.getCurrentProcentage());
            Constants.Thread_argument_ms = 0;
            viewContainer.gameOver();
            //byt vy
        }
    }


    @Override
    public void run() {
                while (Constants.Thread_argument_ms != 0) {
                    for(Projectile projectile : projectiles){
                        projectile.move();
                    }
                    if(mouseListener.getMousePressed()){
                        player.jump(); //should be in controller
                    }
                    if(player.getyPosition() == 250){
                        mouseListener.setMousePressedfalse();
                    }
                    player.runPlayerSystem();
                    for(Obstacle obstacle: levelOne){
                        obstacle.move();
                    }
                    collisionDetector.runCollisionDetectorSystem();
                    powerUp.runpowerUpSystem();
                    gameView.repaint();
                    player.move();
                    progressBar.setUpdatedCounter();
                    progressBar.setProgressbarBounds();
                    try {
                        Thread.sleep(Constants.Thread_argument_ms);           //repaints the game view every 10 milliseconds

                } catch (Exception ex) {
                }

                    StopGame();
                    progressBar.runProgressBarSystem();
                }
            }

}

