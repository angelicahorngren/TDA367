package view;
import Controller.MouseListener;
import Model.Player;
import Utilities.Constants;

import javax.swing.JFrame;
import java.awt.event.MouseEvent;

public class GameView extends JFrame{

    MouseListener mouseListener;
    ProgressBar_View progressBarView = new ProgressBar_View();
    MouseEvent e;



    public GameView() {
        add(progressBarView);
        mouseListener = new MouseListener();
        addMouseListener(mouseListener);


        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    Player.gravity();
                    if(mouseListener.mousePressed){
                        Player.jump();
                    }
                    repaint();
                    progressBarView.setUpdatedCounter();
                    progressBarView.setProgressbarBounds();


                    try {
                        Thread.sleep(Constants.Thread_argument_ms);           //repaints the game view every 10 milliseconds

                    } catch (Exception ex) {
                    }

                    progressBarView.progressBar_.updateTime();
                    progressBarView.progressBar_.increaseIfWholeNumber();


                    }
                }

        });

        animationThread.start();

        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new PaintingStuff());
    }


}

