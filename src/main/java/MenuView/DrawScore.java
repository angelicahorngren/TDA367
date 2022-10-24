package MenuView;

import View.IDraw;

import Model.Score;

import java.awt.*;

public class DrawScore implements IDraw {

    private Score scoreText;
    private boolean isHighScore;
    private int size;
    private int scorePosX;
    private int scorePosY;

    /**
     * A constructor for DrawScore.
     * @param score A score-object that updates when loosing or winning game.
     * @param scoreIsAHighScore Boolean checking if score displayed is a high score, if false current score is displayed.
     * @param size size of score displayed.
     * @param scorePosX x-position of score.
     * @param scorePosY y-position of score.
     */
    public DrawScore(Score score, boolean scoreIsAHighScore, int size, int scorePosX, int scorePosY){
        this.scoreText = score;
        this.size = size;
        this.scorePosX = scorePosX;
        this.scorePosY = scorePosY;
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

    private String scoreToString(int score){
        Integer integerScore = score;
        return String.valueOf(integerScore);
    }

    /**
     * Draws a score.
     * @param g is a Graphics class object
     */
    @Override
    public void draw(Graphics g){
        Font titleFont = new Font("Bell MT", Font.BOLD, size);
        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString(decideScoreType(scoreText), scorePosX, scorePosY) ;
    }
}
