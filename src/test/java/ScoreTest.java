import Model.Score;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreTest {


    @Test
    void UpdateScoreShouldUpdateTest(){
        Score updateScoreShouldUpdateTest = new Score(0,5);
        int cs = 7;
        updateScoreShouldUpdateTest.updateScore(cs);
        assertEquals(7, updateScoreShouldUpdateTest.getHighScore()); //High score should be updated to the new score since it is bigger than old high score
        assertEquals(7, updateScoreShouldUpdateTest.getCurrentScore()); //Current score updates either way to the new value
    }

    @Test
    void UpdateScoreShouldNotUpdateTest(){
        Score updateScoreShouldNotUpdateTest = new Score(0,10);
        int cs = 7;
        updateScoreShouldNotUpdateTest.updateScore(cs);
        assertEquals(10, updateScoreShouldNotUpdateTest.getHighScore()); //Old high score was 10 and should therefore not update
        assertEquals(7, updateScoreShouldNotUpdateTest.getCurrentScore()); //current score still updates even though it's lower than old high score
    }
}
