package view;

import Utilities.Constants;

import java.awt.*;

public class PlayAgainButtonRectangle extends Shape {

    public PlayAgainButtonRectangle(int x, int y, int width, int height){
        super(x, y, width, height);

    }

    private void drawMenuText(Graphics g){

        Font fontbtn = new Font("Bahnschrift", Font.BOLD, 15);
        g.setFont(fontbtn);
        g.setColor(Color.BLACK); //sets text to black color.
        g.drawString("Again", Constants.PLAY_AGAIN_BTN_POSX + 5, Constants.PLAY_AGAIN_BTN_POSY + 29); //drawing "Again" in the rectangle.
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
