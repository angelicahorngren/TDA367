package Model;

public class Score {
    private int cs;
    private int hs;
    private Player player;
    private ProgressIndicator progressIndicator;

    public Score(int currentScore, int highScore, Player player, ProgressIndicator progressIndicator) {
        this.cs = currentScore;
        this.hs = highScore;
        this.player = player;
        this.progressIndicator = progressIndicator;
    }

    public int getCurrentScore() {
        /*Integer stringCs = cs;
        stringCs.toString();
        return stringCs;*/
        return cs;
    }

    public int getHighScore() {
        /*Integer stringHs = hs;
        stringHs.toString();
        return stringHs;*/
        return hs;
    }

    public void updateCurrentScore(int currentScore) {
        cs = currentScore;
    }

    public void updateHighScore(int highScore) {
        hs = highScore;
    }

    public void setScoreAfterLevelStop() {
        if (!this.player.getaliveStatus()) {
            this.cs = this.progressIndicator.getCurrentProcentage();

        }

        //Hitta vart progressbar stoppat och sätt s = det värdet
        //uppdatera score: progressbarScore(s)
    }
/*
    public void progressbarScore(int score){
        oldHS = Model.Score.getHighScore();
        if (score>oldHS){
            Model.Score.updateHighScore(score);
        else(){
                Model.Score.updateCurrentScore(score);
            }
        }
 */
}