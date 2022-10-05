package view;

import Utilities.Constants;

import java.awt.*;

public class TitleText implements Texts {

    public String text;

    TitleText(String t){
        text = t;
    }
    @Override
    public void draw(Graphics g){
        Font titleFont = new Font("Bell MT", Font.BOLD, 30);
        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString(text, Constants.LOST_ROUND_VIEW_WIDTH - 245, Constants.LOST_ROUND_VIEW_HEIGHT - 150) ;
    }
}
