package view;
import Model.Object;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class DrawCircView extends JComponent {

    Object object;
    public DrawCircView(Object object) {
        this.object = object;

    }

    public void drawCirc(Graphics g) {

        Graphics2D gg = (Graphics2D) g;

        gg.setColor(Constants.RECT_COLOR);
        gg.fillOval(object.getxPosition(),Constants.Y_POS, object.width, object.height);      //här sätts även yposition



    }
}
