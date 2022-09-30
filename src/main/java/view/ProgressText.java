package view;

import Utilities.Constants;

import java.awt.*;

public class ProgressText implements Texts {

    @Override
    public void draw(Graphics g){
        Font titleFont = new Font("Bell MT", Font.BOLD, 20);
        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString("Progress: ", Constants.LOST_ROUND_VIEW_WIDTH - 270, Constants.LOST_ROUND_VIEW_HEIGHT - 100) ;
    }

}
