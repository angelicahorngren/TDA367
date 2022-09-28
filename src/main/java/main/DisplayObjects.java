package main;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;

public class DisplayObjects extends JComponent {
    private int X_POS = Constants.RECT_START_X;         //startposition för kvadraten xled
    private int x_pos_circle = Constants.CIRC_START_X;  //startposition för cirkeln xled

    public DisplayObjects() {   //detta ska flyttas till en annan klass, repaintar jframe

    /*    Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    repaint();
                    try {
                        Thread.sleep(10);
                    } catch (Exception ex) {
                    }
                }
            }
        });

        animationThread.start();

     */
    }


    public void paintComponent(Graphics g) {

        Graphics2D gg = (Graphics2D) g;

        int w = 1500;                       //skärmens bredd (osynlig+synlig)
        //int h = Constants.SCREEN_HEIGHT;

        int objectWidth = Constants.RECT_WIDTH;
        int objectHeight = Constants.RECT_HEIGHT;
        int objectSpeed = -3;

        //Här nedanför skapas kvadraten och hur den förflyttas

        int x = X_POS + objectSpeed;

        if (x > w + objectWidth) {
            x = -objectWidth;
        }

        gg.setColor(Constants.RECT_COLOR);
        gg.fillRect(x,Constants.Y_POS, objectWidth, objectHeight);      //här sätts även yposition

        X_POS = x;


        //Här nedanför skapas cirkeln och hur den förflyttas

        int u = x_pos_circle + objectSpeed;

        if (u > w + objectWidth) {
            u = -objectWidth;
        }

        gg.setColor(Constants.RECT_COLOR);
        gg.fillOval(u,Constants.Y_POS, objectWidth, objectHeight);      //här sätts även yposition


        x_pos_circle = u;



    }

}
