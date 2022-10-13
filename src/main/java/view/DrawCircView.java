package view;
import Model.Obstacle;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class DrawCircView extends JComponent {

    //public int hight;
   // public int width;
    Obstacle obstacle;

    public DrawCircView(int h, int w) {
        this.obstacle = new Obstacle(h, w, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X, Constants.OBSTACLE_START_Y);
        //this.hight = obstacle.Height;
        //this.width = obstacle.Width;


    }

    public void draw3(Graphics g) {

        Graphics2D gg = (Graphics2D) g;


        gg.setColor(Constants.RECT_COLOR);
        gg.fillOval(obstacle.getxPosition(),Constants.Y_POS, obstacle.width, obstacle.height);      //här sätts även yposition



    }
}
