package view;
import Model.DrawCircModel;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class DrawCircView extends JComponent {


    DrawCircModel drawCircModel;
    public DrawCircView(int h, int w) {

        this.drawCircModel = new DrawCircModel(h, w);


    }

    public void draw3(Graphics g) {

        Graphics2D gg = (Graphics2D) g;


        gg.setColor(Constants.RECT_COLOR);
        gg.fillOval(drawCircModel.move(),Constants.Y_POS, drawCircModel.cWidth, drawCircModel.cHeight);      //här sätts även yposition



    }
}
