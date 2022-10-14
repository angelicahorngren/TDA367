package view;
import Model.Obstacle;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class DrawCircView extends JComponent {

    Obstacle obstacle;
    public DrawCircView(Obstacle obstacle) {
        this.obstacle = obstacle;

    }

    public void drawCirc(Graphics g) {

        Graphics2D gg = (Graphics2D) g;

        gg.setColor(Constants.RECT_COLOR);
        gg.fillOval(obstacle.getxPosition(),Constants.Y_POS, obstacle.width, obstacle.height);      //här sätts även yposition



    }
}
