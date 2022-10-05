package view;
import Controller.MouseListener;
import Model.PlayerModel;
import Utilities.Constants;
import javax.swing.JFrame;


public class GameView extends JFrame{


    public GameView() {
        ProgressBar progressBar = new ProgressBar();
        add(progressBar);
        MouseListener mouseListener;
        mouseListener = new MouseListener();
        addMouseListener(mouseListener);
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    if(mouseListener.mousePressed){
                        PlayerModel.jump();
                    }
                    PlayerModel.gravity();
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

