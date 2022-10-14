package main;

import Controller.MouseListener;
import Model.CollisionDetector;
import Model.Obstacle;
import Model.Player;
import view.GameView;
import view.PaintingStuff;
import view.ProgressBar;
import Utilities.Constants;
import javax.swing.*;

public class GameLoop implements Runnable{

    private Player player;       //Have to extend JFrame for add()-functions to work, still working on this
    private ProgressBar progressBar;
    private GameView gameView;
    private CollisionDetector collisionDetector;

    Thread animationThread;

    public GameLoop(Player player, GameView gameView, ProgressBar progressBar, CollisionDetector collisionDetector){
        this.player = player;
        this.gameView = gameView;
        this.progressBar = progressBar;
        this.collisionDetector = collisionDetector;

    }

    @Override
    public void run() {
        while (true) {
            /*if(mouseListener.mousePressed){
                    player.jump();
                }

                if(player.yPosition == 250){
                    mouseListener.mousePressed = false;
                }*/
            collisionDetector.detectCollision();
            player.gravity();
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


        }
    }
    //animationThread.start();

    public void startGame(){
        animationThread.start();
    }

}
