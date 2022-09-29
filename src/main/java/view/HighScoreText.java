package view;

import Utilities.Constants;

import java.awt.*;

public class HighScoreText implements Texts{

    @Override
    public void draw(Graphics g){
        Font font = new Font("Agency FB", Font.PLAIN, 40); //creating font for HighScore: text.
        g.setFont(font);
        g.setColor(Color.BLACK); // setting font color
        g.drawString("High Score : ", (Constants.SCREEN_WIDTH - 300) / 2, (Constants.SCREEN_HEIGHT - 35) / 2); //drawing the "HighScore:" text.
    }
}
