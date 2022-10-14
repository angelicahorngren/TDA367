package view;
import Model.Obstacle;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class DrawRectView extends JComponent {


    Obstacle obstacle;
    public DrawRectView(Obstacle obstacle) {
        this.obstacle = obstacle;

        //this.obstacle = new Obstacle(h, w, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X);


    }

    public void drawRect(Graphics g) {

        Graphics2D gg = (Graphics2D) g;


        gg.setColor(Constants.RECT_COLOR);
        gg.fillRect(obstacle.getxPosition(),Constants.Y_POS, obstacle.width, obstacle.height);      //här sätts även yposition



    }
}
