import Model.LevelOne;
import Model.Obstacle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LevelOneJUnitTest {
    @Test
    public void checkObstacleExistence(){
        LevelOne testLevelOne = new LevelOne(new ArrayList<Obstacle>());
        testLevelOne.createLevel();
        assertEquals(9, testLevelOne.getObstacleList().size()); //kollar så antalet objekt stämmer överens med antalet objekt i Model
    }
}
