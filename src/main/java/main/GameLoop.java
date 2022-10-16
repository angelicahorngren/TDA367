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

public class GameLoop {       //Have to extend JFrame for add()-functions to work, still working on this

    Thread animationThread;

    public GameLoop(Player player, ArrayList<Projectile> projectiles, Obstacle obstacle, PowerUp powerUp, GameView gameView, ProgressBar progressBar, PlayerMouseController playerMouseController, CollisionDetector collisionDetector){
     this.animationThread = new Thread(new Runnable() {
        public void run() {
            while (true) {
                for(Projectile projectile : projectiles){
                    projectile.move();
                }
                if(playerMouseController.mousePressed){
                    player.jump(); //switch to controller
                }
                if(player.yPosition == 250){
                    playerMouseController.mousePressed = false;
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
