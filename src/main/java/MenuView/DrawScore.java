package MenuView;

import View.IDraw;

import Model.Score;

import java.awt.*;

public class DrawScore implements IDraw {

    private Score sc;
    private boolean isHighScore;
    private int s;
    private int xc; //Placement of text
    private int yc;

    public DrawScore(Score score, boolean scoreIsAHighScore, int size, int Xcentering, int Ycentering){
        sc = score;
        s = size;
        xc = Xcentering;
        yc = Ycentering;
        isHighScore = scoreIsAHighScore;
    }

    private String decideScoreType(Score score){
        if(isHighScore){
            return scoreToString(score.getHighScore());
        }
        else {
            return scoreToString(score.getCurrentScore());
        }
    }

    // Makes score a string, so it can be displayed on the menu through drawString
    private String scoreToString(int score){
        Integer integerScore = score;
        return String.valueOf(integerScore);
    }

    @Override
    public void draw(Graphics g){
        Font titleFont = new Font("Bell MT", Font.BOLD, s);
        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString(decideScoreType(sc), xc, yc) ;
    }
}
