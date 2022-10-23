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


    private void updateHighScore(int highScore) {
        hs = highScore;
    }

    public void updateScore(int score) {
        cs = score;
        if(score > hs){ // Checks if current score is bigger than high score
            updateHighScore(score); //Updates high score
        }
    }

}