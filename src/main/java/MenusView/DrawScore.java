package MenusView;

import java.awt.*;

public class DrawScore implements IDrawMenuItems {

    private int st;
    private int s;
    private int xc; //Placement of text
    private int yc;

    public DrawScore(int scoreText, int size, int Xcentering, int Ycentering){
        st = scoreText;
        s = size;
        xc = Xcentering;
        yc = Ycentering;
    }

    // Makes score a string, so it can be displayed on the menu through drawString
    private String scoreToString(int st){
        Integer integerScore = st;
        return String.valueOf(integerScore);
    }

    @Override
    public void draw(Graphics g){
        Font titleFont = new Font("Bell MT", Font.BOLD, s);
        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString(scoreToString(st), xc, yc) ;
    }
}
