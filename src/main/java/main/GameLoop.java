package main;

import Controller.PlayerMouseController;
import Model.CollisionDetector;
import Model.Obstacle;
import Model.Player;
import Model.Projectile;
import Model.PowerUp;
import view.GameView;
import view.ProgressBar;
import Utilities.Constants;
import javax.swing.*;
import java.util.ArrayList;

public class GameLoop implements Runnable{

    Player player;
    Obstacle obstacle;
    GameView gameView;
    ProgressBar progressBar;
    PlayerMouseController mouseListener;
    CollisionDetector collisionDetector;
    ArrayList<Projectile> projectiles;
    PowerUp powerUp;


    public GameLoop(Player player, ArrayList<Projectile> projectiles, Obstacle obstacle, GameView gameView, ProgressBar progressBar, PlayerMouseController mouseListener, CollisionDetector collisionDetector, PowerUp powerUp) {
    this.player = player;
    this.obstacle = obstacle;
    this.progressBar = progressBar;
    this.mouseListener = mouseListener;
    this.collisionDetector = collisionDetector;
    this.gameView = gameView;
    this.projectiles = projectiles;
    this.powerUp = powerUp;


    }
    @Override
    public void run() {

                while (true) {
                    for(Projectile projectile : projectiles){
                        projectile.move();
                    }
                    if(mouseListener.getMousePressed()){
                        player.jump(); //switch to controller
                    }

                    if(player.getyPosition() == 250){
                        mouseListener.setMousePressedfalse();
                    }
                    obstacle.move();

                    /*if (collisionDetector.detectCollision() == 1){

                        Constants.Thread_argument_ms = 0;

                    }*/
                    powerUp.move();
                    collisionDetector.detectCollisionPowerUpObject();
                    if (powerUp.getPowerUpStatus()){
                        powerUp.startPowerUpTimer();
                        powerUp.endPowerup();
                    }
                    if (!powerUp.getPowerUpStatus()) {
                        if (collisionDetector.detectCollision() == 1){

                            Constants.Thread_argument_ms = 0;

                        }


                    }
                    player.gravity();
                    //gameView.paintComponents(gameView.getGraphics());
                    gameView.repaint();
                    player.moveIntoFrame();
                    progressBar.setUpdatedCounter();
                    progressBar.setProgressbarBounds();
                    try {
                        Thread.sleep(Constants.Thread_argument_ms);           //repaints the game view every 10 milliseconds

                } catch (Exception ex) {
                }

                    progressBar.updatePrgressBar();
                    if (progressBar.progressIndicator.getCurrentProcentage() == 100){
                        Constants.Thread_argument_ms = 0;
                    }


                }
            }

    }
