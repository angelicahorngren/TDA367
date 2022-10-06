package Model;
import view.ProgressBar;

public class Score {
    private int cs;
    private int hs;

    public Score(int currentScore, int highScore){
        cs = currentScore;
        hs = highScore;
    }

    public int getCurrentScore(){
        Integer stringCs = cs;
        stringCs.toString();
        return stringCs;
    }
    public int getHighScore(){
        Integer stringHs = hs;
        stringHs.toString();
        return stringHs;
    }
    public void updateCurrentScore(int currentScore){
        cs = currentScore;
    }
    public void updateHighScore(int highScore){
        hs = highScore;
    }
}
