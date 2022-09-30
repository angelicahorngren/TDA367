package view;

import Utilities.Constants;

import java.awt.*;

public class OopsText implements Texts {

    @Override
    public void draw(Graphics g){
        Font titleFont = new Font("Bell MT", Font.BOLD, 30);
        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString("OOPS!", Constants.LOST_ROUND_VIEW_WIDTH - 245, Constants.LOST_ROUND_VIEW_HEIGHT - 150) ;
    }

}
