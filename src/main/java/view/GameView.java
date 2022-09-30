package view;
import Utilities.Constants;
import javax.swing.JFrame;

public class GameView extends JFrame{


    public GameView() {
        ProgressBar progressBar = new ProgressBar();
        add(progressBar);
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true || progressBar.counter <= 100 ) {
                    paintComponents(getGraphics());
                    //repaint();
                    progressBar.setValue(progressBar.counter);
                    progressBar.setBounds(200,10,400,10);
                    try {
                        Thread.sleep(10);

                    } catch (Exception ex) {
                    }

                    progressBar.updatetime();
                    progressBar.increaseIfWholeNumber();


                    }
                }

        });

        animationThread.start();

        // DrawRect drawrect = new DrawRect(Constants.RECT_HEIGHT, Constants.RECT_WIDTH);
        //this.add(drawrect);
        // DrawGameBackground dbg = new DrawGameBackground(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        // this.add(dbg);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new PaintingStuff());


        //this.add(new DrawGameBackground(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT));
        //this.add(new DisplayObjects());
        //this.add(new Canvas());
        //this.add(new DrawCirc(Constants.RECT_HEIGHT,Constants.RECT_WIDTH));
    }


}

