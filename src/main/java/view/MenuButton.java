package view;

import Utilities.Constants;
import Model.Shapes;
import java.awt.*;

public class MenuButton extends Shapes implements IMenuItems{


    private int bx;
    private int by;
    private int ts;
    private String bt;

    public MenuButton(int x, int y, int width, int height, int buttonX, int buttonY, int textSize, String buttonText){
        super(x, y, width, height);
        bx = buttonX;
        by = buttonY;
        ts = textSize;
        bt = buttonText;
    }

    private void drawMenuText(Graphics g){

        Font fontbtn = new Font("Bahnschrift", Font.BOLD, ts);
        g.setFont(fontbtn);
        g.setColor(Color.BLACK); //sets text to black color.
        g.drawString(bt, bx, by); //drawing "Menu" in the rectangle.
    }

    @Override
    public void draw(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setStroke(new BasicStroke(Constants.BORDER_THICKNESS));
        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getWidth(), getHeight());

        drawMenuText(g);

    }


}
