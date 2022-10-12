package view;
import Controller.MouseListener;
import Model.Obstacle;
import Model.PlayerModel;
import Utilities.Constants;
import javax.swing.JFrame;

public class GameView extends JFrame{

    MouseListener mouseListener;
    ProgressBar progressBar = new ProgressBar();




    public GameView(Obstacle obstacle) {

        add(progressBar);
        mouseListener = new MouseListener();
        addMouseListener(mouseListener);
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    if(mouseListener.mousePressed){
                        PlayerModel.jump();
                    }
                    PlayerModel.gravity();
                    if(PlayerModel.yPosition == 250){
                        mouseListener.mousePressed = false;
                    }
                    repaint();
                    PlayerModel.moveIntoFrame();
                    progressBar.setUpdatedCounter();
                    progressBar.setProgressbarBounds();
                    try {
                        Thread.sleep(Constants.Thread_argument_ms);           //repaints the game view every 10 milliseconds

                    } catch (Exception ex) {
                    }

                    progressBar.progressIndicator_.updateTime();
                    progressBar.progressIndicator_.increaseIfWholeNumber();


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
        this.add(new PaintingStuff(obstacle));

    }


}

