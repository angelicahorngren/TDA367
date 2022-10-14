package main;

import Controller.PlayerController;
import Model.CollisionDetector;
import Model.Object;
import Model.Player;
import view.GameView;
import view.ProgressBar;
import Utilities.Constants;

public class GameLoop {       //Have to extend JFrame for add()-functions to work, still working on this

    Thread animationThread;

    public GameLoop(Player player, Object object, GameView gameView, ProgressBar progressBar, PlayerController playerController, CollisionDetector collisionDetector){



     this.animationThread = new Thread(new Runnable() {
        public void run() {
            while (true) {
                object.move();
                if(playerController.mousePressed){
                    player.jump(); //switch to controller
                }
                if(player.yPosition == 250){
                    playerController.mousePressed = false;
                }
                collisionDetector.detectCollision();
                player.gravity();
                gameView.paintComponents(gameView.getGraphics());
                //gameView.repaint();
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
