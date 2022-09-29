package view;

import Utilities.Constants;

import java.awt.*;

public class Rectangles extends Shape {

    private final int border_thickness = 2; //declares thickness of rectangle border.

    public Rectangles(int x, int y, int width, int height){
        super(x, y, width, height);

    }

    public void drawStartButton(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        g2d.setStroke(new BasicStroke(border_thickness));
        g.drawRect(getX(), getY(), getWidth(), getHeight());

        Font fontbtn = new Font("Bahnschrift", Font.BOLD, 30); //creating font for startbutton.
        g.setFont(fontbtn);
        g.setColor(Color.BLACK); //sets text to black color.
        g.drawString("Start", Constants.START_BTN_POSX + 41, Constants.START_BTN_POSY + 35); //drawing "Start" in the rectangle.
    }

    @Override
    public void draw(Graphics g){
        drawStartButton(g);
    }

}
