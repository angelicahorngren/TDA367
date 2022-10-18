package Model;

public class Score {
    private int cs;
    private int hs;

    public Score(int currentScore, int highScore) {
        cs = currentScore;
        hs = highScore;
    }

    public int getCurrentScore() {
        return cs;
    }

    public int getHighScore() {
        return hs;
    }

    private void updateCurrentScore(int currentScore) {
        cs = currentScore;
    }

    private void updateHighScore(int highScore) {
        hs = highScore;
    }

    public void updateScore(int score) {
        //score to current score(percentage on progress indicator)
        updateCurrentScore(score); //updates current score
        if(score > hs){ // Checks if current score is bigger than high score
            updateHighScore(score); //Updates high score
        }
    }

}