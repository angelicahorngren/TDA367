package view;
import Model.Object;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class DrawRectView extends JComponent {


    Object object;
    public DrawRectView(Object object) {
        this.object = object;

        //this.obstacle = new Obstacle(h, w, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X);


    }

    public void drawRect(Graphics g) {

        Graphics2D gg = (Graphics2D) g;


        gg.setColor(Constants.RECT_COLOR);
        gg.fillRect(object.getxPosition(),Constants.Y_POS, object.width, object.height);      //här sätts även yposition



    }
}
