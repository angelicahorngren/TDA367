package Model;

public class Score {
    private int cs;
    private int hs;

    /**
     *
     * @param currentScore
     * @param highScore
     */
    public Score(int currentScore, int highScore) {
        cs = currentScore;
        hs = highScore;
    }

    /**
     *
     * @return
     */
    public int getCurrentScore() {
        return cs;
    }

    /**
     *
     * @return
     */
    public int getHighScore() {
        return hs;
    }

    public void updateScore(int score) {
        //score to current score(percentage on progress indicator)
        cs = score; //updates current score
        if(score > hs){ // Checks if current score is bigger than high score
            hs = score; //Updates high score
        }
    }

}