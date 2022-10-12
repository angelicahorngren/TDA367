package main;

import Controller.MouseListener;
import Model.Obstacle;
import Model.Player;
import view.ProgressBar;
import Utilities.Constants;
import javax.swing.*;

public class GameLoop extends JFrame {       //Have to extend JFrame for add()-functions to work, still working on this

    MouseListener mouseListener;
    ProgressBar progressBar = new ProgressBar();

    public GameLoop(Player player, Obstacle obstacle){

    add(progressBar);
    mouseListener = new MouseListener();
    addMouseListener(mouseListener);
    Thread animationThread = new Thread(new Runnable() {
        public void run() {
            while (true) {
                if(mouseListener.mousePressed){
                    player.jump();
                }
                player.gravity();
                if(player.yPosition == 250){
                    mouseListener.mousePressed = false;
                }
                repaint();
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

        animationThread.start();
}
}
