package main;

import Controller.PlayerMouseController;
import Model.CollisionDetector;
import Model.Obstacle;
import Model.Player;
import Model.PowerUp;
import view.GameView;
import view.ProgressBar;
import Utilities.Constants;
import javax.swing.*;

public class GameLoop {       //Have to extend JFrame for add()-functions to work, still working on this

    Thread animationThread;

    public GameLoop(Player player, Obstacle obstacle, PowerUp powerUp, GameView gameView, ProgressBar progressBar, CollisionDetector collisionDetector, MouseListener mouseListener){


     this.animationThread = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if(mouseListener.mousePressed){
                    player.jump(); //switch to controller
                }

                if(player.yPosition == 250){
                    mouseListener.mousePressed = false;
                }
                    obstacle.move();
                    powerUp.move();
                collisionDetector.detectCollisionPowerUpObject();
                if (powerUp.powerOn){
                    powerUp.startPowerUpTimer();
                    powerUp.endPowerup();
                }
                if (!powerUp.powerOn) {
                    collisionDetector.detectCollision();
                }
                    player.gravity();
                    gameView.paintComponents(gameView.getGraphics());
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

        });


}

    public void startGame(){
        animationThread.start();
    }

}
