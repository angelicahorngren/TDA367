package View;
import Model.Obstacle;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class DrawRectView extends JComponent implements IDraw {


    private Obstacle obstacle;
    public DrawRectView(Obstacle obstacle) {
        this.obstacle = obstacle;


    }

    public void draw(Graphics g) {

        Graphics2D gg = (Graphics2D) g;

        gg.setColor(Constants.RECT_COLOR);
        gg.fillRect(obstacle.getxPosition(),Constants.Y_POS, obstacle.getWidth(), obstacle.getHeight());      //här sätts även yposition



    }
}
