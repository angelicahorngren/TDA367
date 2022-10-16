/*import Utilities.Constants;
import org.junit.jupiter.api.Test;
import Model.ProgressIndicator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressIndicatorTest {

    @Test
    void getIncreasedTime() {
        ProgressIndicator progressIndicatorTest = new ProgressIndicator();
        double expectedInc_EveryThreadIteration = 0.05;
        assertEquals(expectedInc_EveryThreadIteration, progressIndicatorTest.getIncreasedTime(20000));
    }



    @Test
    void updateTimeTest() {
        ProgressIndicator progressIndicatorTest = new ProgressIndicator();
        double expectedCurrentIncrease = 0.2;
        progressIndicatorTest.getIncreasedTime(5000);
        progressIndicatorTest.updateTime();
        assertEquals(expectedCurrentIncrease, progressIndicatorTest.currentIncrease );

    }

    @Test
    void increaseIfWholeNumberTest() {
        ProgressIndicator progressIndicatorTest = new ProgressIndicator();
        int expectedCurrentPercentage = 1;
        for (int i= 0; i <5; i++){
        progressIndicatorTest.updateTime();
        progressIndicatorTest.increaseIfWholeNumber();
        }

        assertEquals(expectedCurrentPercentage, progressIndicatorTest.currentPercentage);

    }

}
*/