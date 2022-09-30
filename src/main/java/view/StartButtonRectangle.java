package view;

import Utilities.Constants;

import java.awt.*;

public class StartButtonRectangle extends Shape {

    public StartButtonRectangle(int x, int y, int width, int height){
        super(x, y, width, height);

    }

    private void drawStartText(Graphics g){

        Font fontbtn = new Font("Bahnschrift", Font.BOLD, 30); //creating font for startbutton.
        g.setFont(fontbtn);
        g.setColor(Color.BLACK); //sets text to black color.
        g.drawString("Start", Constants.START_BTN_POSX + 41, Constants.START_BTN_POSY + 35); //drawing "Start" in the rectangle.
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setStroke(new BasicStroke(Constants.BORDER_THICKNESS));
        g.drawRect(getX(), getY(), getWidth(), getHeight());

        drawStartText(g);

    }

}
