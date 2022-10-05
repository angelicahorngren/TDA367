package view;
import Controller.MouseListener;
import Model.Player;
import Utilities.Constants;
import javax.swing.JFrame;

public class GameView extends JFrame{

    MouseListener mouseListener;

    public GameView() {
        ProgressBar progressBar = new ProgressBar();
        add(progressBar);
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
                    progressBar.setUpdatedCounter();
                    progressBar.setProgressbarBounds();
                    try {
                        Thread.sleep(10);           //repaints the game view every 10 milliseconds

                    } catch (Exception ex) {
                    }

                    progressBar.updateTime();
                    progressBar.increaseIfWholeNumber();


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

