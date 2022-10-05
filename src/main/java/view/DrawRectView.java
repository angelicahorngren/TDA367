package view;
import Model.DrawRectModel;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class DrawRectView extends JComponent {


    DrawRectModel drawRectModel;
    public DrawRectView(int h, int w) {

        this.drawRectModel = new DrawRectModel(h, w);


    }

    public void draw(Graphics g) {

        Graphics2D gg = (Graphics2D) g;


        gg.setColor(Constants.RECT_COLOR);
        gg.fillRect(drawRectModel.moveRect(),Constants.Y_POS, drawRectModel.rWidth, drawRectModel.rHeight);      //här sätts även yposition



    }
}
