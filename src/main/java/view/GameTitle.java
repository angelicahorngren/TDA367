package view;

import Utilities.Constants;

import java.awt.*;

public class GameTitle implements Texts {

    @Override
    public void draw(Graphics g){
        Font titleFont = new Font("Bell MT", Font.BOLD, 50);
        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString("JumpNStuff", (Constants.SCREEN_WIDTH - 260) / 2, (Constants.SCREEN_HEIGHT - 200) / 2);
    }

}
