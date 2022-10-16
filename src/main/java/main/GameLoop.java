package main;

import Controller.MouseListener;
import Model.CollisionDetector;
import Model.Obstacle;
import Model.Player;
import view.GameView;
import view.ProgressBar;
import Utilities.Constants;


public class GameLoop implements Runnable{

    Player player;
    Obstacle obstacle;
    GameView gameView;
    ProgressBar progressBar;
    MouseListener mouseListener;
    CollisionDetector collisionDetector;


    public GameLoop(Player player, Obstacle obstacle, GameView gameView, ProgressBar progressBar, MouseListener mouseListener, CollisionDetector collisionDetector) {
    this.player = player;
    this.obstacle = obstacle;
    this.progressBar = progressBar;
    this.mouseListener = mouseListener;
    this.collisionDetector = collisionDetector;
    this.gameView = gameView;


    }
    @Override
    public void run() {

                while (true) {
                    if(mouseListener.mousePressed){
                        player.jump(); //switch to controller
                    }

                    if(player.yPosition == 250){
                        mouseListener.mousePressed = false;
                    }
                    obstacle.move();
                    if (collisionDetector.detectCollision() == 1){

                        Constants.Thread_argument_ms = 0;

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

                    progressBar.progressIndicator.updateTime();
                    progressBar.progressIndicator.increaseIfWholeNumber();
                    if (progressBar.progressIndicator.currentPercentage == 100){
                        Constants.Thread_argument_ms = 0;
                    }


                }
            }



    }
