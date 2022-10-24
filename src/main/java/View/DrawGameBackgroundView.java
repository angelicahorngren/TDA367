package View;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawGameBackgroundView extends JComponent implements IDraw {

    private int width;
    private int height;
    private Object cloudPart1;
    private Object cloudPart2;

    /**
     * A constructor for DrawGameBackgroundView
     * @param w used to get the width of the background
     * @param h used to get the hight of the background
     */

    public DrawGameBackgroundView(int w, int h){
        width = w;
        height = h;
    }

    /**
     * A method that draw and gives the colors to the diffrent parts of the background
     * @param g a neccasery parameter used to draw on a Jpanel
     */
    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        int [] x = {-1, 801, 800, 0};
        int [] y = {-1, -1, 300, 300};
        g2d.drawPolygon(x, y, 4);
        g2d.setColor(new Color(169, 223, 248));
        g2d.fillPolygon(x, y, 4);

        g2d.setColor(Color.white);

        Rectangle2D.Double grass = new Rectangle2D.Double(0,300,width, 10);
        g2d.setColor(new Color(25, 160, 60));
        g2d.fill(grass);

        Rectangle2D.Double ground = new Rectangle2D.Double(0,310,width, 90);
        g2d.setColor(new Color(63,38,29));
        g2d.fill(ground);

    }

}
