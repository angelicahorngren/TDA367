package view;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawGameBackgroundView extends JComponent {

    private int width;
    private int height;

    public DrawGameBackgroundView(int w, int h){
        width = w;
        height = h;
    }
    public void draw2(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

       /* Rectangle2D.Double sky = new Rectangle2D.Double(0,0, width, 300);
        g2d.setColor(new Color(135, 206, 250));
        g2d.fill(sky);*/

        Rectangle2D.Double grass = new Rectangle2D.Double(0,300,width, 10);
        g2d.setColor(Color.green);
        g2d.fill(grass);

        Rectangle2D.Double ground = new Rectangle2D.Double(0,310,width, 90);
        g2d.setColor(new Color(63,38,29));
        g2d.fill(ground);
    }

}
