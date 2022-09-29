package view;
import Utilities.Constants;

import javax.swing.JFrame;
import java.awt.*;

public class GameView extends JFrame{


    public GameView() {

        ProgressBar progressBar = new ProgressBar();
        add(progressBar);
        //double increase = progressBar.getIncreasedTime(Constants.SEC_LV1);
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                 int counter = 0;
                 double x = 0;

                while (true || counter <= 100 ) {
                    paintComponents(getGraphics());
                    //repaint();
                    progressBar.setValue(counter);
                    progressBar.setBounds(200,10,400,10);
                    try {
                        Thread.sleep(10);

                    } catch (Exception ex) {
                    }

                    while (x % 1 != 0.0 || x == 0.0) {
                        x = (x + progressBar.getIncreasedTime(Constants.SEC_LV1));
                        x = Math.round(x * 1000000000d) / 1000000000d;
                        System.out.println(x);
                        break;
                    }
                    if (x % 1 == 0.0) {

                        counter += 1;
                        x = 0;




                    }
                    else continue;
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

