package Model;

public class Score {
    private int cs;
    private int hs;

    /**
     *The constructor for Score.
     * @param currentScore
     * @param highScore
     */
    public Score(int currentScore, int highScore) {
        cs = currentScore;
        hs = highScore;
    }

    /**
     *Gets the current score.
     * @return the current score.
     */
    public int getCurrentScore() {
        return cs;
    }

    /**
     *Gets the highest achieved score.
     * @return the highscore.
     */
    public int getHighScore() {
        return hs;
    }

    /**
     * Updates the score if the current percentage(score) when game is over is higher than the last score.
     * @param score is the current percentage in GameLoop when the game stops.
     */
    public void updateScore(int score) {
        cs = score;
        if(score > hs){ // Checks if current score is bigger than high score
            hs = score; //Updates high score
        }
    }

}