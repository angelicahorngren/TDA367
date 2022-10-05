package view;

import Utilities.Constants;
import Model.Shape;
import java.awt.*;

public class MenuButtonRectangle extends Shape implements IMenuItems{


    public MenuButtonRectangle(int x, int y, int width, int height){
        super(x, y, width, height);

    }

    private void drawMenuText(Graphics g){

        Font fontbtn = new Font("Bahnschrift", Font.BOLD, 15);
        g.setFont(fontbtn);
        g.setColor(Color.BLACK); //sets text to black color.
        g.drawString("Menu", Constants.MENU_BTN_POSX + 6, Constants.MENU_BTN_POSY + 29); //drawing "Menu" in the rectangle.
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
