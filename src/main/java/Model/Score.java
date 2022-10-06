package Model;

public class Score {
    private int cs;
    private int hs;

    public Score(int currentScore, int highScore){
        cs = currentScore;
        hs = highScore;
    }

    public int getCurrentScore(){
        /*Integer stringCs = cs;
        stringCs.toString();
        return stringCs;*/
        return cs;
    }
    public int getHighScore(){
        /*Integer stringHs = hs;
        stringHs.toString();
        return stringHs;*/
        return hs;
    }
    public void updateCurrentScore(int currentScore){
        cs = currentScore;
    }
    public void updateHighScore(int highScore){
        hs = highScore;
    }
}
